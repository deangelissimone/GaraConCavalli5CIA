package com.example;

public class ThreadCavallo extends Thread{
    private int t;
    private String n;
    private int s;

    public ThreadCavallo(int tragitto, String nomeCavallo, int sosta) {
        this.t = tragitto;
        this.n = nomeCavallo;
        this.s = sosta;
    }
    
    public void run(){
        Thread.currentThread().setName(n);
        for(int i=0; i<=t; i++){
            System.out.println("Tragitto del cavallo"+Thread.currentThread().getName()+i);
            try {
                Thread.sleep(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Il cavalo"+Thread.currentThread().getName()+" è narrivato al tragitto");
    }   
    
}