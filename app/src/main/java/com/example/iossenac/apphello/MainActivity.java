package com.example.iossenac.apphello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Inicio da Aplicação");
        Log.i("TagApp","Inicio da Aplicação");
        Log.d("TagApp","Inicio da Aplicação");
    }

    public void mostrarHello(View view){
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        TextView textViewHello = (TextView) findViewById(R.id.textViewHello);
        if(!editTextNome.getText().toString().isEmpty()) {
            textViewHello.setText("Hello " + editTextNome.getText().toString());
        }

        System.out.println("Disparo do Botão!");
        Log.i("TagApp","Disparo da Aplicação");
        Log.d("TagApp","Disparo da Aplicação");
        Log.d("TagApp","Nome: "+editTextNome.getText().toString());

    }
}
