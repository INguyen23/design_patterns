package state;

import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) { 
        this.game = game;
    }

    public int getNum() {
        Random r = new Random();
        int n = r.nextInt(100);
        n += 1;
        return n;
    }

    public String getOperation() {
        String[] op = {"+", "-", "*", "/"};
        Random r = new Random();
        int s = r.nextInt(op.length);
        return op[s];
    }

    public void levelUp() {
        System.out.println("You are doing so well!");
    }

    public void levelDown() { 
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}
