package Flyweight;

import java.io.Serializable;

class ConcreteCharacterProperties implements CharacterProperties, Serializable {
	private static final long serialVersionUID = 1L;
    private String font;
    private String color;
    private int size;

    public ConcreteCharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Font: " + font + ", Color: " + color + ", Size: " + size);
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}