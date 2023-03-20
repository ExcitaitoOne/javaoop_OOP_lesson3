package org.example.human;

public class Roliki implements Transport{
    @Override
    public void start() {
        System.out.println(" старт ролики");
    }

    @Override
    public void stop() {
        System.out.println(" стоп ролики");
    }
}
