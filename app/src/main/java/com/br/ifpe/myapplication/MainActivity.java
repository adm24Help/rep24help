package com.br.ifpe.myapplication;


import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseRef = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gravando
        //Criando a estrutura Usuario> Nome e setando o valor Waltson
        firebaseRef.child("usuario").child("nome").setValue("Waltson");
    }
}
