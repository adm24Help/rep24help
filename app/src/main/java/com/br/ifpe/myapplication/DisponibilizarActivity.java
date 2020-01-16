package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class DisponibilizarActivity extends Fragment {


    RadioButton radioOnLine;
    TextView online;
    Button bt ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_disponibilizar, container, false);

        radioOnLine = view.findViewById(R.id.radioButton1);
        bt = view.findViewById(R.id.btConfirmar);
        online= (TextView) view.findViewById(R.id.textoOnline);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioOnLine.isChecked()){
                    Toast.makeText(getContext(), "Você está Online !!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Você está Offline !!!", Toast.LENGTH_SHORT).show();
                }
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, new HomeActivity(), "HomeActivity");
                transaction.commit();

            }
        });

        return view;



    }


}
