package com.br.ifpe.myapplication;


import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro extends Fragment {

    TextView username;
    EditText nome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.activity_cadastro, container, false);
/*        username = view.findViewById(R.id.textViewName);
        nome = view.findViewById(R.id.tNome);
        nome.setText(username.getText());
*/
        return view;
    }
}
