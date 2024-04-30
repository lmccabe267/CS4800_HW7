package Flyweight;

public class Driver {
	public static void main(String[] args) {
		
        Document doc = new Document();
        
        doc.addCharacter('H', "Arial", "Red", 12);
        doc.addCharacter('e', "Calibri", "Blue", 14);
        doc.addCharacter('l', "Verdana", "Black", 16);
        doc.addCharacter('l', "Arial", "Red", 12);
        doc.addCharacter('o', "Calibri", "Blue", 14);
        doc.addCharacter('W', "Arial", "Black", 12);
        doc.addCharacter('o', "Arial", "Red", 12);
        doc.addCharacter('r', "Calibri", "Blue", 14);
        doc.addCharacter('l', "Verdana", "Black", 16);
        doc.addCharacter('d', "Arial", "Red", 12);

        System.out.println("Document:");
        doc.display();

        doc.saveToFile("document.txt");

        System.out.println("\n\n");
        Document loadedDoc = Document.loadFromFile("document.txt");
        if (loadedDoc != null) {
            loadedDoc.display();
        }
	}
}
