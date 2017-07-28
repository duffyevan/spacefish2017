package org.evanduffy.spacefish;

import java.util.ArrayList;

public class Main {
    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static void main(String [] args){
        while (true){
            mainGameLoop();
        }
    }

    private static void mainGameLoop() {
        displayTitleScreen();
        //todo write the game
        displayEndScreen();
    }

    private static void displayTitleScreen(){
        //todo do this
    }

    private static void displayEndScreen(){
        //todo do this
    }


}
