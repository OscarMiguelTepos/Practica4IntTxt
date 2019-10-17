package com.omtc.itics.tesoem.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vnombre= (EditText) findViewById(R.id.txtNombre);
    }
    public void Invocar(View v){
        Intent pantalla = new Intent(this,RecibeParametrosActivity.class);
        pantalla.putExtra( "nombre", vnombre.getText().toString());
        startActivity(pantalla);
        this.finish();

    }
}
