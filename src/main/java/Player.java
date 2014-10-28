import java.util.*;

public class Player {
    private String name;
    private int lifeValue;
    private int attackValue;
    private String role;
    private Weapon weapon = new Weapon();
    private WeaponEffect effectedType = new WeaponEffect();
    private ProtectiveGear protectiveGear = new ProtectiveGear();

    public Player(String name, int lifeValue, int attackValue, String role) {
        this.name = name;
        this.lifeValue = lifeValue;
        this.attackValue = attackValue;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        if(!this.role.equals("普通人")) {
            this.weapon = weapon;
        }
    }

    public ProtectiveGear getProtectiveGear() {
        return protectiveGear;
    }

    public void setProtectiveGear(ProtectiveGear protectiveGear) {
        if(!this.role.equals("普通人")) {
            this.protectiveGear = protectiveGear;
        }
    }

    public String getRole() {
        return role;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public void attack(Player player) {
        int realDamage = this.attackValue + this.getWeapon().getUpAttackValue() - player.getProtectiveGear().getProtectiveValue();
        player.setLifeValue(player.getLifeValue() - realDamage);
        //战士张三用优质木棒攻击了普通人李四,李四受到了8点伤害,李四剩余生命：12
        System.out.println(this.getRole()+this.getName()+"用"+this.getWeapon().getName()+"攻击了"+player.getRole()+player.getName()+","
                            +player.getName()+"受到了"+realDamage+"点伤害,"
                            +player.getName()+"剩余生命:"+player.getLifeValue());

    }

    public Boolean isDied() {
        return this.getLifeValue() <= 0;
    }

    public static void printResultMessage(Player player) {
        System.out.println(player.getName()+"被打败了.");
    }
}