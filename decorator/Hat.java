package design_patterns.decorator;

public class Hat extends CharacterDecorator {

    public Hat(Character character) { 
        super(character);
    }

    public void customize() { 
        this.sections.set(1, " __|____|____");
    }
}
