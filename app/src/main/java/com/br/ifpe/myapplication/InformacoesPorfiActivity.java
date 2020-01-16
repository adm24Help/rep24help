package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class InformacoesPorfiActivity extends Fragment {
    Button bt;
    TextView sucesso;
    RatingBar estrelas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_informacoes_porfi, container, false);
        sucesso= (TextView) view.findViewById(R.id.textoSucesso);
        bt = view.findViewById(R.id.btSolicitar_servico);
        estrelas = view.findViewById(R.id.ratingBar);
        estrelas.setRating(4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sucesso.setVisibility(View.VISIBLE);

        }
        });


        return view;
    }
}