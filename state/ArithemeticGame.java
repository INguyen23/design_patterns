package state;

import java.util.Scanner;

import javax.swing.plaf.nimbus.State;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    
    private State state;
    private int score;
    private Scanner reader;

    public ArithemeticGame() {
        easyState = new Easy(this);
        
        score = this.score;
        reader = new Scanner(System.in);
    }

    public void pressQuestionButton() {

    }

    public void setState(State state) { 
        this.state = state;
    }

    public State getEasyState() { 
        return easyState;
    }

    public State getMediumState() { 
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
