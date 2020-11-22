package edu.upc.dsa.appEjemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onBtClick(android.view.View v) {
        Log.d("MY APP", "Han aceptado las condiciones");

    }
}