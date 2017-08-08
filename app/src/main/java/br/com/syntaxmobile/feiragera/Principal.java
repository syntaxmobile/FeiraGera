package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TextView feira = (TextView) findViewById(R.id.txvFeira);
        feira.setOnClickListener(this);
        TextView programacao = (TextView) findViewById(R.id.txvProgramacao);
        programacao.setOnClickListener(this);
        TextView exposotires = (TextView) findViewById(R.id.txvExpositores);
        exposotires.setOnClickListener(this);
        TextView patrocinadores = (TextView) findViewById(R.id.txvPatrocinadores);
        patrocinadores.setOnClickListener(this);
        TextView facaparte = (TextView) findViewById(R.id.txvFacaparte);
        facaparte.setOnClickListener(this);
        TextView noticias = (TextView) findViewById(R.id.txvNoticias);
        noticias.setOnClickListener(this);
        TextView utilidades = (TextView) findViewById(R.id.txvUtilidades);
        utilidades.setOnClickListener(this);
        TextView sobre = (TextView) findViewById(R.id.txvSobre);
        sobre.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.txvFeira:
                Intent it = new Intent(Principal.this, Feira.class);
                startActivity(it);
                break;

            case R.id.txvProgramacao:
                it = new Intent(Principal.this, Programacao.class);
                startActivity(it);
                break;

            case R.id.txvExpositores:
                it = new Intent(Principal.this, Expositores.class);
                startActivity(it);
                break;

            case R.id.txvPatrocinadores:
                it = new Intent(Principal.this, Patrocinadores.class);
                startActivity(it);
                break;

            case R.id.txvFacaparte:
                it = new Intent(Principal.this, Parte.class);
                startActivity(it);
                break;

            case R.id.txvUtilidades:
                it = new Intent(Principal.this, Utilidade.class);
                startActivity(it);
                break;

            case R.id.txvSobre:
                it = new Intent(Principal.this, Sobre.class);
                startActivity(it);
                break;
        }
    }
}
