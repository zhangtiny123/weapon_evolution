/**
 * Created by tiny on 14-10-23.
 */
public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("张三",88,15,"战士");
        Player player2 = new Player("李四",100,10,"普通人");

        Weapon weapon = new Weapon("优质木棒", 5);
        ProtectiveGear protectiveGear = new ProtectiveGear("小木盾", 5);

        player1.setWeapon(weapon);
        player1.setProtectiveGear(protectiveGear);
        int game_flag = 1;

        while (game_flag == 1) {
            player1.attack(player2);
            if(player2.isDied()) {
                game_flag = 0;
                Player.printResultMessage(player2);
                continue;
            }
            player2.attack(player1);
            if(player1.isDied()) {
                game_flag = 0;
                Player.printResultMessage(player1);
            }

        }
    }
}

