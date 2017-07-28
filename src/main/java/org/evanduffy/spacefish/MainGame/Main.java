package org.evanduffy.spacefish.MainGame;

import org.evanduffy.spacefish.GameObject;

import java.util.ArrayList;

import static org.evanduffy.spacefish.MainGame.GameOperations.mainGameLoop;

public class Main {
    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static void main(String [] args){
        while (true){
            mainGameLoop();
        }
    }





}
