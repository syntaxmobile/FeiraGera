package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarPrincipal();
            }
        }, 3500);
    }

    private void mostrarPrincipal() {
        Intent intent = new Intent(SplashScreen.this,
                Principal.class);
        startActivity(intent);
        finish();
    }
}
