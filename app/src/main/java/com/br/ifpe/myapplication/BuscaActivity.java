package com.br.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class BuscaActivity extends Fragment {

    private FragmentManager fragmentManager;
    Button bt;
    Spinner spinner;
    String[] opcoes = {"Eletricista","Pedreiro","Pintor"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.activity_busca, container, false);
        spinner = view.findViewById(R.id.spin);
        bt = view.findViewById(R.id.btBuscar);



        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if(spinner.getSelectedItem().toString().equals("Eletricista")){

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.container, new ResultadoActivity(), "ResultadoActivity");
                    transaction.commit();


                }else {

                    Toast.makeText(getContext(), "Sem Resultados !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }






    private void showFragment(Fragment fragment, String name){

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment,name);
        transaction.commit();
    }






}