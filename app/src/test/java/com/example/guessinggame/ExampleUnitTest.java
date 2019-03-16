package com.example.guessinggame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void run_game(){
        Game game = new Game();
        boolean guessedCorrect = false;
        for (int i=1; i< 11; ++i){
            guessedCorrect = game.check(i);
            if (guessedCorrect){
                break;
            }
        }
        assertTrue(guessedCorrect);
    }
}