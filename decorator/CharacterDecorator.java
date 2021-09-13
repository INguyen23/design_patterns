package design_patterns.decorator;

public abstract class CharacterDecorator extends Character { 
    protected Character character;

    public CharacterDecorator(Character character) { 
        this.character = character;
        for(String str : this.character.sections) {
            this.sections.add(str); 
        }
        customize();
    }

    public abstract void customize();
}