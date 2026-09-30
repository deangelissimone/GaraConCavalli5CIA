package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inizio corsa");
        ThreadCavallo diegoBrando = new ThreadCavallo(3000, "scaryMoster", 80);
        ThreadCavallo fannyValentine = new ThreadCavallo(3000, "d4c", 300);
        ThreadCavallo johnnyJoestar = new ThreadCavallo(3000, "task", 100);
        ThreadCavallo jairoZeppeling = new ThreadCavallo(3000, "task", 90);


    }
}