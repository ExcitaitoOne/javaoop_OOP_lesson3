package org.example;

import org.example.human.Bicycle;
import org.example.human.Human;
import org.example.human.Roliki;
import org.example.human.Transport;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        Roliki roliki=new Roliki();
        human.drive(roliki);
        Transport transport = new Bicycle();
    }
}