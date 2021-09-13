package design_patterns.decorator;

public class PotatoeHead extends Character { 
    
    public PotatoeHead() { 
        sections.add("    ____");
        sections.add("   /    \\    ");
        sections.add("  /      \\ ");
        for(int i = 0; i < 2; i++) { 
            sections.add(" |        | ");
        }
        sections.add("  \\      / ");
        sections.add("   \\____/ ");
        }
}