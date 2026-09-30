package com.example;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    static ConcurrentLinkedQueue<String> classifica = new ConcurrentLinkedQueue<>();
    private static int t=1000;
    public static void main(String[] args) {
        System.out.println("Inizio corsa");
        ThreadCavallo diegoBrando = new ThreadCavallo(t, "scary Moster", 80);
        ThreadCavallo fannyValentine = new ThreadCavallo(t, "d4c", 200);
        ThreadCavallo johnnyJoestar = new ThreadCavallo(t, "task", 100);
        ThreadCavallo jairoZeppeling = new ThreadCavallo(t, "spin", 90);

       diegoBrando.start();
        fannyValentine.start();
        johnnyJoestar.start();
        jairoZeppeling.start();

        try {
            diegoBrando.join();
            fannyValentine.join();
            johnnyJoestar.join();
            jairoZeppeling.join();
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
                default -> System.out.println("4° Posto: " + nomeVincitore);
            }
            posizione++;
        
        }
        
    }
}

