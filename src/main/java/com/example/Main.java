package com.example;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    static ConcurrentLinkedQueue<String> classifica = new ConcurrentLinkedQueue<>();
    private static int t=1000;
    public static void main(String[] args) {
        System.out.println("Inizio corsa");
        ThreadCavallo diegoBrando = new ThreadCavallo(t, "scary Moster", 90);
        ThreadCavallo fannyValentine = new ThreadCavallo(t, "d4c", 100);
        ThreadCavallo johnnyJoestar = new ThreadCavallo(t, "task", 100);
        ThreadCavallo jairoZeppeling = new ThreadCavallo(t, "spin", 90);
        ThreadCavallo dioBrandoAlt = new ThreadCavallo(t, "The World", 85);
        ThreadCavallo hotPants = new ThreadCavallo(t, "Cream Starter", 95);
        ThreadCavallo mountainTim = new ThreadCavallo(t, "Oh! Lonesome Me", 105);
        ThreadCavallo blackmore = new ThreadCavallo(t, "Catch the Rainbow", 100);
        ThreadCavallo ringoRoadagain = new ThreadCavallo(t, "Mandom", 90);
        ThreadCavallo pocoloco = new ThreadCavallo(t, "Hey Ya!", 75);

        diegoBrando.start();
        fannyValentine.start();
        johnnyJoestar.start();
        jairoZeppeling.start();
        dioBrandoAlt.start();
        hotPants.start();
        mountainTim.start();
        blackmore.start();
        ringoRoadagain.start();
        pocoloco.start();

        try {
            diegoBrando.join();
            fannyValentine.join();
            johnnyJoestar.join();
            jairoZeppeling.join();
            dioBrandoAlt.join();
            hotPants.join();
            mountainTim.join();
            blackmore.join();
            ringoRoadagain.join();
            pocoloco.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fine corsa");

        System.out.println("Classifica gara");
        int posizione = 1;
        
        while (!classifica.isEmpty()) {
            String nomeVincitore = classifica.poll();
            switch (posizione) {
                case 1 -> System.out.println("1° Posto (VINCITORE): " + nomeVincitore);
                case 2 -> System.out.println("2° Posto: " + nomeVincitore);
                case 3 -> System.out.println("3° Posto: " + nomeVincitore);
                default -> System.out.println("4° Posto: " + nomeVincitore);
            }
            posizione++;
        
        }
        
    }
}
