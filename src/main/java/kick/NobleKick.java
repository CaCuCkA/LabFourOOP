package kick;

import lotr.Character;

public class NobleKick implements BasicKick{
    @Override
    public void kick(Character whoKicked, Character toKick) {
        toKick.setHp(toKick.getHp() - whoKicked.getPower());
    }
}
