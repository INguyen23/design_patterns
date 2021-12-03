package state;

import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) { 
        this.game = game;
    }

    public int getNum() { 
        Random r = new Random();
        int n = r.nextInt(50);
        n += 1;
        return n;
    }

    public String getOperation() { 
        String[] op = {"+", "-", "*"};
        Random r = new Random();
        int s = r.nextInt(op.length);
        return op[s];
    }

    public void levelUp() { 
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    public void levelDown() { 
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
