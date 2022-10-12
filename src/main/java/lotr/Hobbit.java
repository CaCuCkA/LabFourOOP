package lotr;

import kick.BasicKick;
import kick.HobbitKick;

public class Hobbit extends lotr.Character {
    public Hobbit(){
        super(3 , 0, new HobbitKick());
    }

}
