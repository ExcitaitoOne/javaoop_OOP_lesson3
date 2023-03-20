package org.example.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<String> logger = new ArrayList<>();
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in=new Scanner(System.in);
        System.out.println("Выберите игру");
        int num=in.nextInt();
        Game game = null;
        switch (num){
            case 1:game=new NumberGame();
                break;
            case 2:game=new WordGame();
                break;
            case 3:game=new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
        }
        game.start(4,2);
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println("ваш ход");
            String answer=in.next();
            logger.add(answer);
            Answer answerGame=game.inputAnswer(answer);
            System.out.printf("Найдено %d коров и %d быков%n",answerGame.getCows(),answerGame.getBulls());
        }
        switch (game.getGameStatus()){
            case LOSE -> System.out.println("Вы проиграли");
            case WIN -> System.out.println("Ура! ВЫ выиграли");
        }

        System.out.println("Вывести на экран историю ходов y/n?");

        Scanner offer = new Scanner(System.in);
       String str = offer.nextLine();
      switch (str){
          case "y": System.out.println("Ваша история ходов: " + logger);
          case "n":  System.out.println("До свидания");
      }

    }
}
