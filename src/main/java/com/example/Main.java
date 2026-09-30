package com.example;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    static ConcurrentLinkedQueue<String> classifica = new ConcurrentLinkedQueue<>();
    private static int t = 1000;

    public static void main(String[] args) {
        System.out.println("Inizio corsa");
        // ipotesi aggiuntiva: i cavalli sono diversi, quindi ci sono soste aggiuntive
        ThreadCavallo diegoBrando = new ThreadCavallo(t, "scary Moster", 90, "Diego Brando");
        ThreadCavallo fannyValentine = new ThreadCavallo(t, "d4c", 100, "Fanny Valentine");
        ThreadCavallo johnnyJoestar = new ThreadCavallo(t, "task", 100, "Johnny Joestar");
        ThreadCavallo jairoZeppeling = new ThreadCavallo(t, "spin", 90, "Jairo Zeppeling");
        ThreadCavallo dioBrandoAlt = new ThreadCavallo(t, "The World", 85, "Dio Brando");
        ThreadCavallo hotPants = new ThreadCavallo(t, "Cream Starter", 95, "Hot Pants");
        ThreadCavallo mountainTim = new ThreadCavallo(t, "Oh! Lonesome Me", 100, "Mountain Tim");
        ThreadCavallo blackmore = new ThreadCavallo(t, "Catch the Rainbow", 100, "Blackmore");
        ThreadCavallo ringoRoadagain = new ThreadCavallo(t, "Mandom", 90, "Ringo Roadagain");
        ThreadCavallo pocoloco = new ThreadCavallo(t, "Hey Ya!", 85, "Pocoloco");

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
                case 1 -> System.out.println("1° Posto: " + nomeVincitore);
                case 2 -> System.out.println("2° Posto: " + nomeVincitore);
                case 3 -> System.out.println("3° Posto: " + nomeVincitore);
                default -> System.out.println(posizione + "° Posto: " + nomeVincitore);
            }
            posizione++;

        }

    }
}
