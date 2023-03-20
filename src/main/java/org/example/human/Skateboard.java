package org.example.human;

public class Skateboard implements Transport {

    @Override
    public void start() {
        System.out.println(" едем на скейте");
    }

    public void stop() {
        System.out.println(" скейтборд остановился");
    }
}
