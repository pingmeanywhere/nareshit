package corejava.part3.objectClass.lab2;

import java.util.Scanner;

public class GameCharacterProfileSystem {


    static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        String characterId = sc.nextLine();
        String playerName = sc.nextLine();
        int level = Integer.parseInt(sc.nextLine());
        double health = Integer.parseInt(sc.nextLine());

        if(characterId.length() < 3 || characterId.length() > 10 || playerName.length() < 3 || playerName.length() > 10) {
            System.out.println("Error: Invalid character details");
            return;
        }

        GameCharacter gameCharacter = new GameCharacter(characterId, playerName, level, health);
        System.out.println("Original Character:");
        System.out.println(gameCharacter);
        GameCharacter copyCharacter = (GameCharacter) gameCharacter.clone();
        if(copyCharacter.level < 15) {
            copyCharacter.level = copyCharacter.level + 5;
        } else {
            copyCharacter.level = copyCharacter.level - 5;
        }
        if(copyCharacter.health > 50) {
            copyCharacter.health =  copyCharacter.health - 20;
        } else {
            copyCharacter.health =  copyCharacter.health + 20;
        }
        System.out.println("Cloned Character:");
        System.out.println(copyCharacter);

    }
}


class GameCharacter implements Cloneable {
    String characterId;
    String playerName;
    int level;
    double health;


    public GameCharacter(String characterId, String playerName, int level, double health) {
        this.characterId = characterId;
        this.playerName = playerName;
        this.level = level;
        this.health = health;
    }


    public Object clone() throws CloneNotSupportedException {
        return (GameCharacter) super.clone();
    }

    public String toString() {
        return "CharacterId=" + characterId + ", PlayerName=" + playerName +
                ", Level=" + level + ", Health=" + health;
    }
}