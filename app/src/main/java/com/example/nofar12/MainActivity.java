package com.example.nofar12;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * @author Nofar Amalka
 * @version 1.0
 * @since 22/03/2026
 * * This class manages the background color of the main screen based on
 * the states of a Switch and a ToggleButton components.
 */
public class MainActivity extends AppCompatActivity {
    private Switch sw;
    private ToggleButton tog;
    private Button btn;
    private ConstraintLayout mainlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        tog = findViewById(R.id.tog);
        btn = findViewById(R.id.btn);
        mainlay = findViewById(R.id.mainlay);
    }

    public void Clicked(View view) {
        if (sw.isChecked() && tog.isChecked()) {
            mainlay.setBackgroundColor(Color.YELLOW);
        } else if (sw.isChecked() && !tog.isChecked()) {
            mainlay.setBackgroundColor(Color.CYAN);
        } else if (!sw.isChecked() && tog.isChecked()) {
            mainlay.setBackgroundColor(Color.MAGENTA);
        } else {
            mainlay.setBackgroundColor(Color.LTGRAY);
        }
    }
}