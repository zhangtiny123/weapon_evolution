/**
 * Created by tiny on 14-10-27.
 */
public class BurningEffect extends WeaponEffect {
    private int damageValue;
    private int continuousRounds;

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getContinuousRounds() {
        return continuousRounds;
    }

    public void setContinuousRounds(int continuousRounds) {
        this.continuousRounds = continuousRounds;
    }

    public BurningEffect(int damageValue, int continuousRounds) {
        this.damageValue = damageValue;
        this.continuousRounds = continuousRounds;
    }

    public String EffectsTriggered(Player player) {
        return player.getName()+"中毒了,";
    }
}
