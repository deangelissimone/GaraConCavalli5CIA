package com.example;

public class ThreadCavallo extends Thread {
    private int t;
    private String nC;
    private String n;
    private int s;

    public ThreadCavallo(int tragitto, String nomeCavallo, int sosta, String nomeCorridore) {
        this.t = tragitto;
        this.nC = nomeCavallo;
        this.s = sosta;
        this.n = nomeCorridore;
    }

    public void run() {
        Thread.currentThread().setName(nC);

        // Il ciclo parte da 1 per contare correttamente i metri percorsi
        for (int i = 0; i <= t; i += 10) {
            System.out.println("Tragitto del cavallo " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Il cavallo " + Thread.currentThread().getName() + " è arrivato al traguardo");

        Main.classifica.add(this.n);
    }
}
