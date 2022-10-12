package lotr;

import kick.NobleKick;

import java.util.Random;

abstract class Noble extends lotr.Character{
    private static final Random randomGenerator= new Random();
        public Noble(int min, int max){
            super(randomGenerator.nextInt(max-min)+5, randomGenerator.nextInt(max-min)+5, new NobleKick());
        }
}
