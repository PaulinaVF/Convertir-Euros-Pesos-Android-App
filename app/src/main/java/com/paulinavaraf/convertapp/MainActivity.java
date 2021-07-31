package com.paulinavaraf.convertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToEuro (View view) {
        EditText pesos = (EditText) findViewById(R.id.edtPesos);
        ImageView imagen = (ImageView) findViewById(R.id.imgDinero);
        double num_pesos = Double.parseDouble(pesos.getText().toString());
        double num_euros = num_pesos / 25.27;
        imagen.setImageResource(R.drawable.euros);
        Toast.makeText(MainActivity.this, num_euros + "euros", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}