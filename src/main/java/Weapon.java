/**
 * Created by tiny on 14-10-24.
 */
public class Weapon {
    private int upAttackValue;
    private String name;
    private WeaponEffect[] weaponEffects = new WeaponEffect[5];

    public Weapon() {
        this.name = "";
        this.upAttackValue = 0;
        for (int i=0; i<5; i++) {
            weaponEffects[i] = null;
        }
    }

    public Weapon(String name ,int upAttackValue) {
        this.name = name;
        this.upAttackValue = upAttackValue;
        for (int i=0; i<5; i++) {
            weaponEffects[i] = null;
        }
    }

    public int getUpAttackValue() {
        return upAttackValue;
    }

    public String getName() {
        return name;
    }

    public WeaponEffect[] getWeaponEffects() {
        return weaponEffects;
    }

    public void addWeaponEffects(WeaponEffect weaponEffect) {
        for (int i=0; i<5; i++) {
            if(weaponEffects[i] != null) {
                weaponEffects[i] = weaponEffect;
            }
        }
    }
}
