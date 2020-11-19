
package swiftlyofsixty;

import java.util.Random;

public class Vocabulary {
    private String[] wordEasy = {"dog", "cat", "fat", "owl", "old","low", "bad", "jaw", "jam", "sit","bee", "key", "she", "him", "her","eye", "sex", "die", "six", "one","two", "cry", "pie", "pig", "bag","end", "home", "mos", "ant", "raw"};
    private String[] wordNormal = {"clean", "adult", "dance", "earth", "alarm","brain", "block", "fight", "group", "human","face", "japan", "laugh", "metal", "nurse", "ocean", "ball", "peter", "queen", "rabbit","shirt", "table", "onion", "unity", "voice","woman", "youth", "zebra", "young", "music"};
    private String[] wordHard= {"supreme", "advance", "keyboard", "cocacola", "assault","antibody", "benefit", "capital", "tranfer", "factory","gallery", "husband", "imagine", "justice", "crewmate","library", "machine", "nuclear", "organic", "lazyloxy","xxxtentacion", "linkingpark", "bohemian", "crystal", "summary","nestle", "trouble", "unusual", "whether", "imposter"};
    private int wordAmount = 30;
    private String[] selectedMode;
    private SwiftlyOfSixty swiftly;
    private GameMenu game;
    public static Vocabulary c1;

    
      public void selectedMode(int mode) {
        switch (mode) {
            case 1:
                System.out.println("dsasd");
//              swiftly.getSelectedMode(wordEasy);
//              swiftly.gameStart();
                break;
            case 2:
                swiftly.getSelectedMode(wordNormal);
                swiftly.gameStart();
                break;
            case 3:
                swiftly.getSelectedMode(wordHard);
                swiftly.gameStart();
                break;
            default:
                game.selectMode();
        }
    }
      
      public void selectedMod(){
          System.out.println("Hel");
      }
      
        public String randomWord(){
       int randomWord = new Random().nextInt(wordAmount);
       return selectedMode[randomWord];
    }
}
