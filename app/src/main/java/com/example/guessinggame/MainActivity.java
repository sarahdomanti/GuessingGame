package com.example.guessinggame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Game game = new Game();
    boolean guessedCorrect;
    String toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view){
        EditText editText = findViewById(R.id.guess);
        Integer guess = Integer.parseInt(String.valueOf(editText.getText()));
        guessedCorrect = game.check(guess);
        if (guessedCorrect){
            toastText = "Correct!";
            game.reset();
        } else {
            toastText = "Incorrect, try again.";
        }

        Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
    }
}
