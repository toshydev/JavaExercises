package org.example.model;

import java.util.Arrays;

// Object-Oriented Programming
// The Player class: a blueprint for a player object
public class Player {
    // What defines a player?
    public String playerName;                       // e.g. Dragonlord
    public static final boolean IS_NPC = false;     // Players never not 'Non-Playable-Characters'
    public int hitPoints;                           // all PLayers have hitPoints
    private String[] inventory;                     // all Players have an inventory which is private
    public boolean isAlive;                         // all Players can be alive or not alive

    // How to create(or instantiate) a player object
    // This constructor only needs a name to instantiate a player
    public Player(String playerName) {
        this.playerName = playerName;
        this.hitPoints = 100;                       // hitPoints will be 100 as default
        this.inventory = new String[1];             // every Player starts with an inventory
        this.inventory[0] = "Health Potion";        // every Player gets one 'Health Potion'
        this.isAlive = true;                        // every Player starts with isAlive = true
    }

    // This constructor can instantiate a player with custom hitPoints
    public Player(String playerName, int hitPoints) {
        this(playerName);                           // The other constructor is called
        this.hitPoints = hitPoints;                 // hitPoints will be 100 as default
    }

    // The inventory is private. To see what's in the player's inventory, we need a getter method
    public String getInventory() {
        return Arrays.toString(inventory);
    }

    // The player can pick up an item and add it to the inventory with this method like a setter method
    public void collect(String item) {
        String[] newInventory = new String[inventory.length + 1];
        System.arraycopy(inventory, 0, newInventory, 0, inventory.length);
        newInventory[newInventory.length - 1] = item;
        inventory = newInventory;
    }

    // The player can use an item from the inventory after which the item is deleted from the inventory array
    public void use(String item) {
        System.out.printf("%s used a %s%n", playerName, item);
        String[] newInventory = new String[inventory.length - 1];
        for (int i = 0; i < newInventory.length; i++) {
            for (String s : inventory) {
                if (s.equals(item)) {
                    newInventory[i] = s;
                }
            }
        }
        inventory = newInventory;
    }

    // Print Player infos to the console
    @Override
    public String toString() {
        return String.format("Name: %s%nHP: %d%nAlive: %b", playerName, hitPoints, isAlive);
    }





    public static void main(String[] args) {
        // We create a normal player with standard hitpoints called Dragonlorg
        Player newPlayer = new Player("Dragonlord");

        // This player is created with 150 hitpoints, cheater...
        Player epicPlayer = new Player("lvl99Player", 150);
        System.out.println(newPlayer);
        System.out.println(epicPlayer);
        System.out.println("newPlayers inventory: ");
        System.out.println(newPlayer.getInventory());
        System.out.println("newPlayers inventory after collecting a sword: ");
        newPlayer.collect("Sword");
        System.out.println(newPlayer.getInventory());
        newPlayer.use("Health Potion");
        System.out.println(newPlayer.getInventory());

    }
}
