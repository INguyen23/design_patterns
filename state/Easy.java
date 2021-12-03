package state;

import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        Random r = new Random();
        int n = r.nextInt(10);
        n += 1;
        return n;
    }

    public String getOperation() { 
        String[] op = {"+", "-"};
        Random r = new Random();
        int s = r.nextInt(op.length);
        return op[s];
    }

    public void levelUp() { 
        System.out.println("You've been advanced to the medium mode.");
        game.setState(game.getMediumState());
    }

    public void levelDown() { 
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
