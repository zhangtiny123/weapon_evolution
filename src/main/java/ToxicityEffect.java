/**
 * Created by tiny on 14-10-25.
 */
public class ToxicityEffect extends WeaponEffect {
    private String modify_word = "毒性";
    private int damageValue;
    private int continuousRounds = 3;

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

    public ToxicityEffect(int damageValue, int continuousRounds) {
        this.damageValue = damageValue;
        this.continuousRounds = continuousRounds;
    }

    public String EffectsTriggered(String playerName) {
        return playerName+"中毒了,";
    }

    public String EffectsDamageMessage(String playerName) {
        return playerName+"受到了"+this.damageValue+"点毒性伤害";
    }
}
