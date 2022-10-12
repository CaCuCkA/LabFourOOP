package lotr;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.*;


public class CharacterFactory {
    public static Character createCharacter() throws Exception{
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> set = reflections.getSubTypesOf(lotr.Character.class);
        set.removeIf(aClass -> Modifier.isAbstract(aClass.getModifiers()));
        Class[] arr = set.toArray(new Class[set.size()]);
        return (Character) arr[new Random().nextInt(arr.length)].getDeclaredConstructor().newInstance();
    }
}
