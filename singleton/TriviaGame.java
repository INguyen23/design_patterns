package design_patterns.singleton;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score; 
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame() { 
        questions = DataLoader.getTriviaQuestions();
        System.out.println("Welcome to the Trivia Game!");
    }

    public static TriviaGame getInstance() { 
        if(triviaGame == null) { 
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play() { 
        num = reader.nextInt();
        while(true) { 
            System.out.println("(P)lay or (Q)uit?");
            if()
        }
    }

    public boolean playRound() { 

    }
}
