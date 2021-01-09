package edu.upc.dsa.appEjemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        TextView textView2 = (TextView) findViewById(R.id.textView2);

        String nombre = getIntent().getStringExtra("nombre");
        Log.d("MYAPP", "El nombre que me ha llegado es: " + nombre);

        textView2.setText("El nombre que me ha llegado es: " + nombre);

        Toast.makeText(this,"Hola, soy una tostada",Toast.LENGTH_LONG).show(); // Mensajes temporales, tipo: "Sesión iniciada correctamente"
    }
}