package Flyweight;

import java.util.HashMap;
import java.util.Map;

class CharacterPropertiesFactory {
    private static Map<String, CharacterProperties> characterPropertiesMap = new HashMap<>();

    public static CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!characterPropertiesMap.containsKey(key)) {
            characterPropertiesMap.put(key, new ConcreteCharacterProperties(font, color, size));
        }
        return characterPropertiesMap.get(key);
    }
}
