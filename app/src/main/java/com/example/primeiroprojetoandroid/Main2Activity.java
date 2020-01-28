package com.example.primeiroprojetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btnLogin;
    TextView txtUsuario;
    TextView txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        txtUsuario = (TextView)findViewById(R.id.txtUsuario);
        txtSenha = (TextView)findViewById(R.id.txtSenha);

        btnLogin.setOnClickListener(btnLogin_onClick());
    }

    private View.OnClickListener btnLogin_onClick()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sUsuario;
                String sSenha;
                Intent actMainActivity;
                Bundle bParametros;

                sUsuario = txtUsuario.getText().toString();
                sSenha = txtSenha.getText().toString();

                if(!sUsuario.equals("Majiko") && !sSenha.equals("123"))
                {
                    dialogMessage("Usuário ou senha inválido");

                    return;
                }

                //Define o contexto e a activity que sera demonstrada
                actMainActivity = new Intent(getContext(), MainActivity.class);

                //Envia informaçoes (parametros) para outras activitys
                bParametros = new Bundle();
                bParametros.putString("nome", "Majiko");

                //Adiciona os parametros
                actMainActivity.putExtras(bParametros);

                //Redireciona para outra tela
                startActivity(actMainActivity);
            }
        };
    }

    private void dialogMessage(String sMessage)
    {
        Toast.makeText(getContext(), sMessage,Toast.LENGTH_SHORT).show();
    }

    private Context getContext()
    {
        return this;
    }

}
