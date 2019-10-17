package com.omtc.itics.tesoem.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecibeParametrosActivity extends AppCompatActivity {
    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);
        vnombre=(TextView)findViewById(R.id.lblNombre);
        Bundle paramatetros = getIntent().getExtras();
        vnombre.setText("Bienvenido"+ paramatetros.getString("nombre"));
    }
}