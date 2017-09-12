package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Expositores extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expositores);

        // EXPOSITORES

        ImageView pref_joacaba = (ImageView) findViewById(R.id.prefjoacaba);
        pref_joacaba.setOnClickListener(this);

        ImageView sebrae = (ImageView) findViewById(R.id.sebrae);
        sebrae.setOnClickListener(this);

        // GERA GOURMET

        ImageView botequim = (ImageView) findViewById(R.id.botequim);
        botequim.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String url;
        Intent it;

        switch (view.getId()) {

            // EXPOSITORES

            case R.id.prefjoacaba:
                url = "http://www.joacaba.sc.gov.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            case R.id.sebrae:
                url = "http://www.sebrae.com.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            // GERA GOURMET

            case R.id.botequim:
                url = "http://botequimdobaptista.com/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

        }

    }

    private void abrirURL(String url, Intent it) {
        it.setData(Uri.parse(url));
        startActivity(it);
    }
}
