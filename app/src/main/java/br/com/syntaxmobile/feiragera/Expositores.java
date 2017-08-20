package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Expositores extends AppCompatActivity implements View.OnClickListener {

    ImageView prefeitura, sebrae, unoesc, fiesc, irani, pioneiro, itl, scherer, sesc, senac, jrc, italiana, village, contassesc,
            tricam, redux, odeme, newonk, newmedical, eco, unifique, portalmed, ifc, inovale, tirol, botequim, brollo, degustare,
            dongeraldo, espaco_gourmet, estacao_cafe, estacao_pastel, hotel_jaragua, nipon, srbuteco, totti, vintage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expositores);

        prefeitura = (ImageView) findViewById(R.id.ivPref_joacaba);
        prefeitura.setOnClickListener(this);
        sebrae = (ImageView) findViewById(R.id.ivSebrae);
        sebrae.setOnClickListener(this);
        unoesc = (ImageView) findViewById(R.id.ivUnoesc);
        unoesc.setOnClickListener(this);
        fiesc = (ImageView) findViewById(R.id.ivFiesc);
        fiesc.setOnClickListener(this);
        irani = (ImageView) findViewById(R.id.ivIrani);
        irani.setOnClickListener(this);
        pioneiro = (ImageView) findViewById(R.id.ivPioneiro);
        pioneiro.setOnClickListener(this);
        itl = (ImageView) findViewById(R.id.ivItl);
        itl.setOnClickListener(this);
        scherer = (ImageView) findViewById(R.id.ivScherer);
        scherer.setOnClickListener(this);
        sesc = (ImageView) findViewById(R.id.ivSesc);
        sesc.setOnClickListener(this);
        senac = (ImageView) findViewById(R.id.ivSenac);
        senac.setOnClickListener(this);
        jrc = (ImageView) findViewById(R.id.ivJrc);
        jrc.setOnClickListener(this);
        italiana = (ImageView) findViewById(R.id.ivItaliana);
        italiana.setOnClickListener(this);
        village = (ImageView) findViewById(R.id.ivVillage);
        village.setOnClickListener(this);
        contassesc = (ImageView) findViewById(R.id.ivContassesc);
        contassesc.setOnClickListener(this);
        tricam= (ImageView) findViewById(R.id.ivTricam);
        tricam.setOnClickListener(this);
        redux = (ImageView) findViewById(R.id.ivRedux);
        redux.setOnClickListener(this);
        odeme = (ImageView) findViewById(R.id.ivOdeme);
        odeme.setOnClickListener(this);
        newonk = (ImageView) findViewById(R.id.ivNewonk);
        newonk.setOnClickListener(this);
        newmedical = (ImageView) findViewById(R.id.ivNewmedical);
        newmedical.setOnClickListener(this);
        eco = (ImageView) findViewById(R.id.ivEco);
        eco.setOnClickListener(this);
        unifique = (ImageView) findViewById(R.id.ivUnifique);
        unifique.setOnClickListener(this);
        portalmed = (ImageView) findViewById(R.id.ivPortalmed);
        portalmed.setOnClickListener(this);
        ifc = (ImageView) findViewById(R.id.ivIfc);
        ifc.setOnClickListener(this);
        inovale = (ImageView) findViewById(R.id.ivInovale);
        inovale.setOnClickListener(this);
        tirol= (ImageView) findViewById(R.id.ivTirol);
        tirol.setOnClickListener(this);
        botequim = (ImageView) findViewById(R.id.ivBotequim);
        botequim.setOnClickListener(this);
        brollo = (ImageView) findViewById(R.id.ivBrollo);
        brollo.setOnClickListener(this);
        degustare = (ImageView) findViewById(R.id.ivDegustare);
        degustare.setOnClickListener(this);
        dongeraldo = (ImageView) findViewById(R.id.ivDongeraldo);
        dongeraldo.setOnClickListener(this);
        espaco_gourmet = (ImageView) findViewById(R.id.ivEspacogourmet);
        espaco_gourmet.setOnClickListener(this);
        estacao_cafe = (ImageView) findViewById(R.id.ivEstacaocafe);
        estacao_cafe.setOnClickListener(this);
        estacao_pastel = (ImageView) findViewById(R.id.ivEstacaopastel);
        estacao_pastel.setOnClickListener(this);
        hotel_jaragua = (ImageView) findViewById(R.id.ivHoteljaragua);
        hotel_jaragua.setOnClickListener(this);
        nipon = (ImageView) findViewById(R.id.ivNipon);
        nipon.setOnClickListener(this);
        srbuteco = (ImageView) findViewById(R.id.ivSrbuteco);
        srbuteco.setOnClickListener(this);
        totti = (ImageView) findViewById(R.id.ivTotti);
        totti.setOnClickListener(this);
        vintage = (ImageView) findViewById(R.id.ivVintage);
        vintage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ivPref_joacaba:
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.joacaba.sc.gov.br"));
                startActivity(it);
                break;

            case R.id.ivSebrae:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sebrae.com.br/sites/PortalSebrae"));
                startActivity(it);
                break;
        }

    }
}
