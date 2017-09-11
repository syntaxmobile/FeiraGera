package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        // Clique em A FEIRA
        LinearLayout layoutFeira = (LinearLayout )findViewById(R.id.layoutFeira);

        layoutFeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Feira.class);
                startActivity(it);
            }
        });

        // Clique em PROGRAMAÇÃO
        LinearLayout layoutProgramacao = (LinearLayout )findViewById(R.id.layoutProgramacao);

        layoutProgramacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Programacao.class);
                startActivity(it);
            }
        });

        // Clique em EXPOSITORES
        LinearLayout layoutExpositores = (LinearLayout )findViewById(R.id.layoutExpositores);

        layoutExpositores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Expositores.class);
                startActivity(it);
            }
        });

        // Clique em UTILIDADES
        LinearLayout layoutUtilidades = (LinearLayout )findViewById(R.id.layoutUtilidades);

        layoutUtilidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Utilidades.class);
                startActivity(it);
            }
        });

        // Clique em PATROCINADORES
        LinearLayout layoutPatrocinadores = (LinearLayout )findViewById(R.id.layoutPatrocinadores);

        layoutPatrocinadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Patrocinadores.class);
                startActivity(it);
            }
        });

        // Clique em DESENVOLVEDOR
        LinearLayout layouDesenvolvedor = (LinearLayout )findViewById(R.id.layoutPatrocinadores);

        layoutPatrocinadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Principal.this, Patrocinadores.class);
                startActivity(it);
            }
        });

       }

    @Override
    public void onClick(View view) {

    }
}
