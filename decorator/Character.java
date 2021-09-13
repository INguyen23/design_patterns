package design_patterns.decorator;
import java.util.ArrayList;
public abstract class Character {
    protected ArrayList<String> sections;

    public Character() { 
        this.sections = new ArrayList<>();
    }

    public void draw() { 
        for(String str : this.sections) { 
            System.out.println(str);
        }
    }
}
