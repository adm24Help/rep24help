package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ResultadoActivity extends Fragment {
    Button bt;
    Button bt2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_resultado, container, false);

        bt = view.findViewById(R.id.btPerfil);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, new InformacoesPorfiActivity(), "InformacoesPorfiActivity");
                transaction.commit();

            }
        });

        bt2 = view.findViewById(R.id.btPerfil2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.container, new InformacoesPorfiActivity(), "InformacoesPorfiActivity");
                    transaction.commit();

            }
        });

        return view;
    }
}
