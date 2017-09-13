package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Patrocinadores extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patrocinadores);

        ImageView pref_joacaba = (ImageView) findViewById(R.id.ivPat_Prefjoacaba);
        pref_joacaba.setOnClickListener(this);

        ImageView sebrae = (ImageView) findViewById(R.id.ivPat_Sebrae);
        sebrae.setOnClickListener(this);

        ImageView unoesc = (ImageView) findViewById(R.id.ivPat_unoesc);
        unoesc.setOnClickListener(this);

        ImageView fiesc = (ImageView) findViewById(R.id.ivPat_Fiesc);
        fiesc.setOnClickListener(this);

        ImageView irani = (ImageView) findViewById(R.id.ivPat_Irani);
        irani.setOnClickListener(this);

        ImageView pioneiro = (ImageView) findViewById(R.id.ivPat_Pioneiro);
        pioneiro.setOnClickListener(this);

        ImageView itl = (ImageView) findViewById(R.id.ivPat_Itl);
        itl.setOnClickListener(this);

        ImageView senior = (ImageView) findViewById(R.id.ivPat_Senior);
        senior.setOnClickListener(this);

        ImageView aurora = (ImageView) findViewById(R.id.ivPat_Aurora);
        aurora.setOnClickListener(this);

        ImageView elevacar = (ImageView) findViewById(R.id.ivPat_Elevacar);
        elevacar.setOnClickListener(this);

        ImageView tirol = (ImageView) findViewById(R.id.ivPat_Tirol);
        tirol.setOnClickListener(this);

        ImageView ifc = (ImageView) findViewById(R.id.ivPat_Ifc);
        ifc.setOnClickListener(this);

        ImageView jrc = (ImageView) findViewById(R.id.ivPat_Jrc);
        jrc.setOnClickListener(this);

        ImageView inovale = (ImageView) findViewById(R.id.ivPat_Inovale);
        inovale.setOnClickListener(this);

        ImageView brde = (ImageView) findViewById(R.id.ivPat_Brde);
        brde.setOnClickListener(this);

        ImageView facisc = (ImageView) findViewById(R.id.ivPat_Facisc);
        facisc.setOnClickListener(this);

        ImageView scherer = (ImageView) findViewById(R.id.ivPat_Scherer);
        scherer.setOnClickListener(this);

        ImageView sicoob = (ImageView) findViewById(R.id.ivPat_Sicoob);
        sicoob.setOnClickListener(this);

        ImageView estrelatur = (ImageView) findViewById(R.id.ivPat_Estrelatur);
        estrelatur.setOnClickListener(this);

        ImageView zanardo = (ImageView) findViewById(R.id.ivPat_Zanardo);
        zanardo.setOnClickListener(this);

        ImageView limger = (ImageView) findViewById(R.id.ivPat_Limger);
        limger.setOnClickListener(this);

        ImageView crasc = (ImageView) findViewById(R.id.ivPat_Crasc);
        crasc.setOnClickListener(this);

        ImageView pref_luzerna = (ImageView) findViewById(R.id.ivPat_PrefLuzerna);
        pref_luzerna.setOnClickListener(this);

        Toast.makeText(getApplicationContext(), "Clique na logomarca para abrir o site do patrocinador.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.ivPat_Prefjoacaba:
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.joacaba.sc.gov.br"));
                startActivity(it);
                break;

            case R.id.ivPat_Sebrae:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sebrae.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_unoesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unoesc.edu.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Fiesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fiesc.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Irani:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.irani.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Pioneiro:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bateriaspioneiro.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Itl:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incubadoraluzerna.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Senior:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.senior.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Aurora:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.auroraalimentos.com.br/sobre/cooperativismo"));
                startActivity(it);
                break;

            case R.id.ivPat_Elevacar:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.elevacar.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Tirol:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tirol.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Ifc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ifc.edu.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Jrc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt-br.facebook.com/jrcsolucoes/"));
                startActivity(it);
                break;

            case R.id.ivPat_Inovale:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.poloinovale.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Brde:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.brde.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Facisc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facisc.org.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_PrefLuzerna:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.luzerna.sc.gov.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Scherer:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.scherer-sa.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Sicoob:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sicoob.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Estrelatur:
                //it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.br/"));
                //startActivity(it);
                break;

            case R.id.ivPat_Zanardo:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.grupozanardo.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Limger:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.organizacoeslimger.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPat_Crasc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.crasc.org.br/crasc/portal/default.php"));
                startActivity(it);
                break;
        }
    }
}
