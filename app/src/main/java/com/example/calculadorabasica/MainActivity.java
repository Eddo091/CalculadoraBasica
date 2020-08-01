package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular (View vista){
        TextView tempval=(TextView)findViewById(R.id.txtnum1);
        double num1= Double.parseDouble( tempval.getText().toString());

        tempval=(TextView)findViewById(R.id.txtnum2);
        double num2= Double.parseDouble((tempval.getText().toString()));

        double respuesta= num1 + num2;
       tempval=(TextView)findViewById(R.id.lblresp);
       tempval.setText("Respuesta: " + respuesta);
    }
}