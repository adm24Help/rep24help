package com.br.ifpe.myapplication;


import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseRef = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioeRef = firebaseRef.child("usuario");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gravando
        //Criando a estrutura Usuario> Nome e setando o valor Waltson
        firebaseRef.child("usuario").child("nome").setValue("Waltson");

        Usuario usuario = new Usuario();

        usuario.setNome("Gilson");
        usuario.setEmail("gilson@gmail.com");
        usuario.setSexo("M");
        usuario.setStatus("0");

        //Gravando um obsjeto usuario
        usuarioeRef.child("U001").setValue(usuario);



    }
}
