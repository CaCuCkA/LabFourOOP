package lotr;

public class GameManager {
    public static void fight(Character firstCharacter, Character secondCharacter) {
        for(int i = 0; firstCharacter.isAlive() && secondCharacter.isAlive(); ++i){
            System.out.format("Round %d\n", i);
            System.out.println(firstCharacter + "\n" + secondCharacter + "\n");
            firstCharacter.kick(secondCharacter);
            if(secondCharacter.isAlive())
                secondCharacter.kick(firstCharacter);
        }
        if(firstCharacter.isAlive())
            System.out.println("First character is win");
        else
            System.out.println("Second character is win");
    }
}
