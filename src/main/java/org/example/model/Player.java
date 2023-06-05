package org.example.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

// Object-Oriented Programming
// The Player class: a blueprint for a player object
public class Player {
    // What defines a player?
    public String playerName;                       // e.g. Dragonlord
    public static final boolean IS_NPC = false;     // Players never not 'Non-Playable-Characters'
    public int hitPoints;                           // all PLayers have hitPoints
    private Inventory inventory;                     // all Players have an inventory which is private
    public boolean isAlive;                         // all Players can be alive or not alive
    public final UUID id;                           // all Players have an id

    // How to create(or instantiate) a player object
    // This constructor only needs a name to instantiate a player
    public Player(String playerName) {
        this.playerName = playerName;               // playerName is passed to the constructor
        this.hitPoints = 100;                       // hitPoints will be 100 as default
        this.inventory = new Inventory();             // every Player starts with an inventory
        this.inventory.add(new Potion("Health Potion", 25));        // every Player gets one 'Health Potion'
        this.isAlive = true;                        // every Player starts with isAlive = true
        this.id = UUID.randomUUID();                // every Player gets a unique id
    }

    // This constructor can instantiate a player with custom hitPoints
    public Player(String playerName, int hitPoints) {
        this(playerName);                           // The other constructor is called
        this.hitPoints = hitPoints;                 // hitPoints will be 100 as default
    }

    public void collect(Item item) {
        this.inventory.add(item);
        System.out.printf("%s picked up a %s%n", playerName, item);
    }

    // The player can use an item from the inventory after which the item is deleted from the inventory array
    public void use(Item item) {
        if (item.usable) {
            System.out.printf("%s used a %s%n", playerName, item);
            if (item.type == Type.POTION) {
                Potion potion = (Potion) item;
                System.out.printf("HP -> %d%n", potion.hpChange);
                this.hitPoints += potion.hpChange;
            }
            this.inventory.remove(item);
        } else {
            System.out.printf("%s is not usable!", item);
        }
    }

    // Print Player infos to the console
    @Override
    public String toString() {
        return String.format("Name: %s%nHP: %d%nAlive: %b", playerName, hitPoints, isAlive);
    }

    // When comparing two players, compare the id only. playerNames are not unique but ids are
    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        Player player = (Player) otherObj;
        return Objects.equals(id, player.id);
    }

    // Only the player id is hashed, the rest will not be compared
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        // We create a normal player with standard hitpoints called Dragonlorg
        Player newPlayer = new Player("Dragonlord", 50);

        // This player is created with 150 hitpoints, cheater...
        Player epicPlayer = new Player("lvl99Player", 150);
        System.out.println(newPlayer);
        System.out.println(epicPlayer);
        System.out.println("newPlayers inventory: ");
        System.out.println(newPlayer.inventory);
        System.out.println("newPlayers inventory after collecting a sword: ");
        Item sword = new Item("Rusty sword", Type.WEAPON);
        newPlayer.collect(sword);
        System.out.println(newPlayer.inventory);
        Item hpPotion = new Potion("Health Potion", 25);
        System.out.println(newPlayer.inventory);
        newPlayer.use(hpPotion);
        System.out.println(newPlayer.inventory);
        System.out.println(newPlayer);
    }
}
