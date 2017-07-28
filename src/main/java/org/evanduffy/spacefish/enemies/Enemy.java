package org.evanduffy.spacefish.enemies;

import org.evanduffy.spacefish.GameObject;

abstract class Enemy implements GameObject{
    int x;
    int y;

    abstract void getImage(); //todo get the Image of the obstacle and return an actual image object

}
