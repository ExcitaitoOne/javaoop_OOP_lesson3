package org.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        List<Character> simbol = new ArrayList<>();
        Random rnd = new Random();
        String a;
        int index;
        simbol = alphabetsRus();
        for (int i = 0; i < 10; ++i) {
            index = rnd.nextInt(32);
            a = simbol.get(index).toString();
            charList.add(a);
        }
        return charList;
    }
}
