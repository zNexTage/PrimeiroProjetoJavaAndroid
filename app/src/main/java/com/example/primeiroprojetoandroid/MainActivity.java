package com.example.primeiroprojetoandroid;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * MainActivity, responsavel pelos eventos da activity_main
 */
public class MainActivity extends AppCompatActivity {
    protected static final  String TAG = "livro";

    TextView txtMensagem;

    /**
     * Executa ao iniciar o aplicativo
     * @param bundle
     */
    protected void onCreate(Bundle bundle)
    {
        Bundle getParameters;
        String sNome;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Log.i(TAG, getLocalClassName()+".onCreate() chamado"+bundle);

        //Recebe o nome que veio da activity 2
        getParameters = getIntent().getExtras();
        sNome = getParameters.getString("nome");

        txtMensagem = findViewById(R.id.txtMensagem);

        txtMensagem.setText("Olá "+sNome);
    }

    public void onStart() {
        super.onStart();

        Log.i(TAG, getLocalClassName()+".onStart()");
    }

    protected  void onRestart()
    {
        super.onRestart();
        Log.i(TAG, getLocalClassName()+".onRestart");
    }


    protected  void onResume()
    {
        super.onResume();
        Log.i(TAG, getLocalClassName()+".onResume");
    }

    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, getLocalClassName()+".onPause");
    }

    @Override
    protected  void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Log.i(TAG, getLocalClassName()+".onSaveInstanceState");
    }

    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, getLocalClassName()+".onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getLocalClassName()+"onDestroy");
    }
}
