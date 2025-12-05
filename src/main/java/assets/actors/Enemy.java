/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets.actors;

import assets.GameAsset;
import java.awt.Image;

/**
 *
 * @author administrator
 */
class Enemy extends GameAsset{
    
    int health, damage, attack;
    
    public Enemy(int x, int y, Image img, String name) {
        super(x, y, img, name);
        this.damage = 10;
        this.attack = 10;
    }

    public Enemy(int x, int y, Image img, String name, int damage, int attack) {
        super(x, y, img, name);
        this.damage = damage;
        this.attack = attack;
    }
        
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getAttack() {
        return attack;
    }
    
}
