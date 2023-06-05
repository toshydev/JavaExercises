package org.example.model;

import java.util.UUID;

public class Character {
    public final boolean IS_NPC;
    private int hitPoints;
    public boolean isAlive;
    public final UUID id;
    public Character(boolean isNpc) {
        IS_NPC = isNpc;
        this.id = UUID.randomUUID();
    }
    public Character(boolean isNpc, int hitPoints) {
        this(isNpc);
        this.hitPoints = hitPoints;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hp) {
        this.hitPoints = hp;
    }
}
