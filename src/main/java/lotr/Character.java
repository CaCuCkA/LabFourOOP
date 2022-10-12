package lotr;

import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
abstract public class Character {
    @Getter
    private int hp;
    @Getter
    @Setter
    private int power;
    private BasicKick kick;

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void kick(Character toKick) {
        kick.kick(this, toKick);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }


}
