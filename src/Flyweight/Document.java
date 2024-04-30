package Flyweight;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Document implements Serializable {
	private static final long serialVersionUID = 1L;
    private List<Character> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(char character, String font, String color, int size) {
        characters.add(new Character(character, font, color, size));
    }

    public void display() {
        for (Character character : characters) {
            character.display();
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Document loadFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Document) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}