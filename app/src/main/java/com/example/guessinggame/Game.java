package com.example.guessinggame;

import java.util.Random;

public class Game {
    Random random = new Random();
    private int number = random.nextInt(10) + 1;

    public boolean check(int n){
        return n == number;
    }

    public void reset(){
        number = random.nextInt(10) + 1;
    }
}
