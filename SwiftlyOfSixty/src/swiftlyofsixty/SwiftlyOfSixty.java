package swiftlyofsixty;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.TokenType;

public class SwiftlyOfSixty {

    private boolean gameStart; //true = เกมกำลังเล่นอยู่  false = เกมไม่ได้เล่นอยู่
//    private int wordAmount = 30;
    private int score;
    private int[] scorePlayTwo = {0,0};
    private String[] player = {"PLAYER 1", "PLAYER 2"};
    private int turnPlay = 0;
//    private String[] selectedMode;
    //private GameMenu game1 = new GameMenu();
//    private String[] wordEasy = {"dog", "cat", "fat", "owl", "old","low", "bad", "jaw", "jam", "sit","bee", "key", "she", "him", "her","eye", "sex", "die", "six", "one","two", "cry", "pie", "pig", "bag","end", "home", "mos", "ant", "raw"};
//    private String[] wordNormal = {"clean", "adult", "dance", "earth", "alarm","brain", "block", "fight", "group", "human","face", "japan", "laugh", "metal", "nurse", "ocean", "ball", "peter", "queen", "rabbit","shirt", "table", "onion", "unity", "voice","woman", "youth", "zebra", "young", "music"};
//    private String[] wordHard= {"supreme", "advance", "keyboard", "cocacola", "assault","antibody", "benefit", "capital", "tranfer", "factory","gallery", "husband", "imagine", "justice", "crewmate","library", "machine", "nuclear", "organic", "lazyloxy","xxxtentacion", "linkingpark", "bohemian", "crystal", "summary","nestle", "trouble", "unusual", "whether", "imposter"};
//    private GameMenu game;
//    private Vocabulary word;

    /*public static void main(String[] args) {
        SwiftlyOfSixty s = new SwiftlyOfSixty();
//s.timerTick();
        //s.gameStart();
    }*/
    public SwiftlyOfSixty() {

    }

    public boolean isGameStart() {
        return gameStart;
    }

//    public String[] getSelectedMode(String[] mode){
//        return mode;
//    }
    public static void printLogo() {
        System.out.println("■■■■■■■■■■■■■■■■■");
        System.out.println("■  SWIFTLY OF SIXTY  ■");
        System.out.println("■■■■■■■■■■■■■■■■■\n");
    }

    public void timerTick(int noOfPlayer) {
                Timer myTimer;
                myTimer = new Timer();
                myTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        switch(noOfPlayer){
                            case 1: gameEnd(); break;
                            case 2: 
                                if(turnPlay == 0){
                                turnPlay+= 1;
                                gamePlayTwo();
                               
                            }else{
                                gameEnd();
                                turnPlay=0;
                            }
                        }
                        
                    }
                }, 10000);


          
    }

    public void startCount() {
        int count = 3;
        while (count >= 1) {
            clearScreen();
            printLogo();
            System.out.println("Game is starting in " + count);
            count--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SwiftlyOfSixty.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//    public void startCount() {
//        int count=3;
//        Timer myTimer;
//        myTimer = new Timer();
//        myTimer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                
//                System.out.println("");
//                count = count - 1;
//            }
//        }, 1000);
//    }

    public void gameStart() {
        GameMenu game = new GameMenu();
        gameStart = true;
        if (game.getNoOfPlayer() == 1) {
            gamePlayOne();
        } else {
            gamePlayTwo();
        }
    }

//    public void selectedMode(int mode) {
//        switch (mode) {
//            case 1:
//                selectedMode = wordEasy;
//                gameStart();
//                break;
//            case 2:
//                selectedMode = wordNormal;
//                gameStart();
//                break;
//            case 3:
//                selectedMode = wordHard;
//                gameStart();
//                break;
//            case 4:
//                selectedMode = wordEasy;
//                game.selectRound();
//                break;
//            case 5:
//                selectedMode = wordNormal;
//                game.selectRound();
//                break;
//            case 6:
//                selectedMode = wordHard;
//                game.selectRound();
//                break;
//            default:
//                game.selectMode();
//        }
//    }
    public void gameEnd() {
        gameStart = false;
        clearScreen();
        printLogo();
        Scanner end = new Scanner(System.in);
        GameMenu game = new GameMenu();
        if (game.getNoOfPlayer() == 1) {
            System.out.println("Game Over");
            System.out.println("Score = " + score);
            System.out.println("\nPress [Enter] to continue.");
            end.nextLine();
            game.selectPlayer();

        } else {
            if (scorePlayTwo[0] > scorePlayTwo[1]) {
                System.out.println(">> PLAYER 1 Win! <<");
            } else if (scorePlayTwo[0] < scorePlayTwo[1]) {
                System.out.println(">> PLAYER 2 Win! <<");
            } else {
                System.out.println("Draw!");
            }
            System.out.println(toString());
            System.out.println("\nPress [Enter] to continue.");
            end.nextLine();
            game.selectPlayer();
        }
    }

    /*public static WordEasy getRandomWord(){
        return WordEasy.class.getEnumConstants()[new   Random().nextInt(WordEasy.class.getEnumConstants().length)];
    }*/
//    public String randomWord(){
//       int randomWord = new Random().nextInt(wordAmount);
//       return selectedMode[randomWord];
//    }
    public void gamePlayOne() {
        Scanner answer = new Scanner(System.in);
        startCount();
        timerTick(1);

        while (isGameStart() == true) {
            clearScreen();

            printLogo();
            Vocabulary word = new Vocabulary();
            String wordShow = word.randomWord();
            System.out.println(wordShow);
            System.out.print(">> ");
            if (answer.nextLine().equals(wordShow)) {
                if (isGameStart() == true) {
                    score++;
                }
            }
        }
        System.out.println("");
    }

    public void gamePlayTwo() {
//        gamePlayOne();
//        scorePlayTwo[0] = score;
//        System.out.println(scorePlayTwo);
        Scanner answer = new Scanner(System.in);
            clearScreen();
            printLogo();
            System.out.println(player[turnPlay] + " : Ready?");
            System.out.println("Press [Enter] to START!");
            answer.nextLine();
            startCount();
            timerTick(2);
        if (turnPlay == 0) {
            while (turnPlay <= 0) {
                clearScreen();
                printLogo();
                Vocabulary word = new Vocabulary();
                String wordShow = word.randomWord();
                System.out.println(wordShow);
                System.out.print(">> ");
                if (answer.nextLine().equals(wordShow)) {
                    if (isGameStart() == true) {
                        scorePlayTwo[turnPlay]++;
                    }
                    
                }
            }
            System.out.println("");
            
        }else if(turnPlay ==1){
              while (turnPlay <= 1) {
                clearScreen();
                printLogo();
                Vocabulary word = new Vocabulary();
                String wordShow = word.randomWord();
                System.out.println(wordShow);
                System.out.print(">> ");
                if (answer.nextLine().equals(wordShow)) {
                    if (isGameStart() == true) {
                        scorePlayTwo[turnPlay]++;
                    }
                    
                }
            }
            System.out.println("");
        }

    }

    @Override
    public String toString() {
        return player[0] + " : Score = " + scorePlayTwo[0] + "\n" + player[1] + " : Score = " + scorePlayTwo[1];

    }
//    public void switchTurnPlay(){
//        switch(turnPlay){
//            case 0: turnPlay = 1; break;
//            case 1: turnPlay = 0; break;
//            default: turnPlay = 0;
//        }
//    }

    public static void clearScreen() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("");
        }
    }

}
