package org.example;

public class Player {
    protected String name;
    protected int healthPercentage;
    protected Weapon weapon;
    public Player(String name, int healthPercentage, Weapon weapon) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.name = name;
        this.weapon = weapon;
    }
    public double healthRemaining() {
        return this.healthPercentage;
    }
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }        
}
