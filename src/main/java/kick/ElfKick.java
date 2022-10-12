package kick;

import lotr.Character;

public class ElfKick implements BasicKick{
    @Override
    public void kick(Character whoKicked, Character toKick) {
        if(whoKicked.getPower() > toKick.getPower())
            toKick.setHp(0);
        else
            whoKicked.setHp(whoKicked.getHp() - 1);
    }
}
