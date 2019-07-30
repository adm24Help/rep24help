package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class TelasActivity extends AppCompatActivity {

    Button btLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telas);


    }


    public void abreTelaLogin(View v){

          Intent intent = new Intent(this, LoginActivity.class);
         startActivity(intent);

    }

    public void abreTelaSS(View v){

        Intent intent = new Intent(this, PerfilProfActivity.class);
        startActivity(intent);

    }

    public void abreTelaCad(View v){

        Intent intent = new Intent(this, CadastroPActivity.class);
        startActivity(intent);

    }

    public void abreTelaB(View v){

        Intent intent = new Intent(this, BuscaActivity.class);
        startActivity(intent);

    }



}


