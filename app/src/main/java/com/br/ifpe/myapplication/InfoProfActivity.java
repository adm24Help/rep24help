package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InfoProfActivity extends Fragment {

    Button bt;
    TextView sucesso;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_cadastro, container, false);
       bt = view.findViewById(R.id.btSolicitar_servico);
       sucesso= view.findViewById(R.id.textoSucesso);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sucesso.setVisibility(View.VISIBLE);
//                    Toast.makeText(getContext(), "Sem Resultados !!!", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
