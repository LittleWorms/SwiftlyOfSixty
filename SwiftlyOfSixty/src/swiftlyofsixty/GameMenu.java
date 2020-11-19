package swiftlyofsixty;

import java.util.Scanner;
import static swiftlyofsixty.SwiftlyOfSixty.clearScreen;

public class GameMenu {
    
    private int player;
    private int mode;
    private int round;
    public SwiftlyOfSixty game;
    //public Vocabulary word;
    Vocabulary word = new Vocabulary();
    //SwiftlyOfSixty game2 = new SwiftlyOfSixty();
    
    public int getNoOfPlayer(){
        return player;
    }
    public int getNoOfRound() {
        return round;
    }

    public void selectPlayer() {
        Scanner s1 = new Scanner(System.in);
        clearScreen();
        System.out.println("■■■■■■■■■■■■■■■■■");
        System.out.println("■  SWIFTLY OF SIXTY  ■");
        System.out.println("■■■■■■■■■■■■■■■■■\n");
        System.out.println("Select Player(1,2): ");
        System.out.print(">> ");
        switch (s1.nextInt()) {
            case 1:
                player = 1;
                selectMode();
                break;
            case 2:
                player = 2;
                selectMode();
                break;
            default:
                selectPlayer();
                break;
        }
    }

    public void selectMode() {
        Scanner s2 = new Scanner(System.in);
        Vocabulary word = new Vocabulary();
        clearScreen();
        System.out.println("■■■■■■■■■■■■■■■■■");
        System.out.println("■  SWIFTLY OF SIXTY  ■");
        System.out.println("■■■■■■■■■■■■■■■■■\n");
        System.out.println("Select Mode(1,2,3): ");
        System.out.println("\t1.easy, 2.normal, 3.hard");
        System.out.print(">> ");
            switch (s2.nextInt()) {
                case 1:
                   
                    word.selectedMode(1);
                    break;
                case 2:
                    
                    word.selectedMode(2);
                    break;
                case 3:
                    
                    word.selectedMode(3);
                    break;
                default:
                    selectMode();
                    break;
            }
        
    }
    
    
//    public void selectRound(){
//        System.out.println("■■■■■■■■■■■■■■■■■");
//        System.out.println("■  SWIFTLY OF SIXTY  ■");
//        System.out.println("■■■■■■■■■■■■■■■■■\n");
//        System.out.println("Select Round(1,2,3): ");
//        System.out.println("\t(1) 1 round, (2) Best of 3, (3) Best of 5");
//        Scanner round = new Scanner(System.in);
//        switch (round.nextInt()) {
//                case 1:
//                    this.round = 1;
//                    break;
//                case 2:
//                    this.round = 3;
//                    break;
//                case 3:
//                    this.round = 5;
//                    break;
//                default:
//                    selectRound();
//            }
//    }
    
}