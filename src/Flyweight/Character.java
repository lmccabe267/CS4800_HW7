package Flyweight;

import java.io.Serializable;

class Character implements Serializable{
	private static final long serialVersionUID = 1L;
    private char character;
    private CharacterProperties properties;

    public Character(char character, String font, String color, int size) {
        this.character = character;
        this.properties = CharacterPropertiesFactory.getCharacterProperties(font, color, size);
    }

    public void display() {
        System.out.print(character);
        properties.display();
    }

    public String getFont() {
        return properties.getFont();
    }

    public String getColor() {
        return properties.getColor();
    }

    public int getSize() {
        return properties.getSize();
    }
}