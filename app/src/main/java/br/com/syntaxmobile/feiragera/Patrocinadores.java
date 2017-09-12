package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Patrocinadores extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patrocinadores);

        // PATROCINADORES

        ImageView sebrae = (ImageView) findViewById(R.id.sebrae);
        sebrae.setOnClickListener(this);

        ImageView unoesc = (ImageView) findViewById(R.id.unoesc);
        unoesc.setOnClickListener(this);

        ImageView fiesc = (ImageView) findViewById(R.id.fiesc);
        fiesc.setOnClickListener(this);

        /*ImageView irani = (ImageView) findViewById(R.id.irani);
        irani.setOnClickListener(this);

        ImageView pioneiro = (ImageView) findViewById(R.id.pioneiro);
        pioneiro.setOnClickListener(this);

        ImageView itl = (ImageView) findViewById(R.id.itl);
        itl.setOnClickListener(this);

        ImageView senior = (ImageView) findViewById(R.id.senior);
        senior.setOnClickListener(this);

        ImageView aurora = (ImageView) findViewById(R.id.aurora);
        aurora.setOnClickListener(this);

        ImageView elevacar = (ImageView) findViewById(R.id.elevacar);
        elevacar.setOnClickListener(this);

        ImageView tirol = (ImageView) findViewById(R.id.tirol);
        tirol.setOnClickListener(this);

        ImageView ifc = (ImageView) findViewById(R.id.ifc);
        ifc.setOnClickListener(this);

        ImageView jrc = (ImageView) findViewById(R.id.jrc);
        jrc.setOnClickListener(this);

        ImageView inovale = (ImageView) findViewById(R.id.inovale);
        inovale.setOnClickListener(this);

        ImageView brde = (ImageView) findViewById(R.id.brde);
        brde.setOnClickListener(this);

        ImageView facisc = (ImageView) findViewById(R.id.facisc);
        facisc.setOnClickListener(this);

        ImageView scherer = (ImageView) findViewById(R.id.scherer);
        scherer.setOnClickListener(this);

        ImageView sicoob = (ImageView) findViewById(R.id.sicoob);
        sicoob.setOnClickListener(this);

        ImageView estrelatur = (ImageView) findViewById(R.id.estrelatur);
        estrelatur.setOnClickListener(this);

        ImageView zanardo = (ImageView) findViewById(R.id.zanardo);
        zanardo.setOnClickListener(this);

        ImageView limger = (ImageView) findViewById(R.id.limger);
        limger.setOnClickListener(this);

        ImageView crasc = (ImageView) findViewById(R.id.crasc);
        crasc.setOnClickListener(this);*/

        // APOIO
        ImageView pref_joacaba = (ImageView) findViewById(R.id.prefjoacaba);
        pref_joacaba.setOnClickListener(this);

        ImageView pref_luzerna = (ImageView) findViewById(R.id.munluzerna);
        pref_luzerna.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String url;
        Intent it;

        switch (view.getId()) {

            // PATROCINADORES
            case R.id.sebrae:
                url = "http://www.sebrae.com.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            case R.id.unoesc:
                url = "http://www.unoesc.edu.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            case R.id.fiesc:
                url = "https://fiesc.com.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            // APOIO
            case R.id.prefjoacaba:
                url = "http://www.joacaba.sc.gov.br/";
                it = new Intent(Intent.ACTION_VIEW);
                abrirURL(url, it);
                break;

            case R.id.munluzerna:
                url = "http://www.luzerna.sc.gov.br/";
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
