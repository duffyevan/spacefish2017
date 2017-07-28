package org.evanduffy.spacefish.enemies;

public abstract class MovingEnemy extends Enemy {
    float deltaX;
    float deltaY;

    /**
     * Can be used to digest the movement of an enemy
     */
    public void move(){
        this.x += deltaX;
        this.y += deltaY;
    }

    /**
     * Can be used to shift an enemy by dx,dy
     * @param dx delta x
     * @param dy delta y
     */
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
}
