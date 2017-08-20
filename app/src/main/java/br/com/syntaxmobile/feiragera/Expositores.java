package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

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

        //Mostra uma mensagem na parte inferior da tela para clicar na imagem para abrir o respectivo site do expositor
        Toast.makeText(getApplicationContext(),"Clique na imagem para abrir o site do Expositor", Toast.LENGTH_LONG).show();
    }

    //Criando uma intent para cada logo para abrir sua respectiva página. A ACTION_VIEW mostra direto do navegador padrão do aparelho do usuário

    @Override
    public void onClick(View view) {

        //Expositores

        switch (view.getId()){
            case R.id.ivPref_joacaba:
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.joacaba.sc.gov.br"));
                startActivity(it);
                break;

            case R.id.ivSebrae:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sebrae.com.br/sites/PortalSebrae"));
                startActivity(it);
                break;

            case R.id.ivUnoesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unoesc.edu.br/"));
                startActivity(it);
                break;

            case R.id.ivFiesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fiesc.com.br/"));
                startActivity(it);
                break;

            case R.id.ivIrani:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.irani.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPioneiro:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bateriaspioneiro.com.br/"));
                startActivity(it);
                break;

            case R.id.ivItl:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incubadoraluzerna.com.br/"));
                startActivity(it);
                break;

            case R.id.ivScherer:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.scherer-sa.com.br/"));
                startActivity(it);
                break;

            case R.id.ivSesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sesc.com.br/"));
                startActivity(it);
                break;

            case R.id.ivSenac:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://portal.sc.senac.br/portal/home/default.aspx"));
                startActivity(it);
                break;

            case R.id.ivJrc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/jrcsolucoes/"));
                startActivity(it);
                break;

            case R.id.ivItaliana:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.italianasorvetes.com/"));
                startActivity(it);
                break;

            case R.id.ivVillage:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vilage.com.br/"));
                startActivity(it);
                break;

            case R.id.ivContassesc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.contassesc.com.br/"));
                startActivity(it);
                break;

            case R.id.ivTricam:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tricam.com.br/"));
                startActivity(it);
                break;

            case R.id.ivRedux:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/redux.eng/"));
                startActivity(it);
                break;

            case R.id.ivOdeme:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.odeme.com.br/"));
                startActivity(it);
                break;

            case R.id.ivNewonk:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://newonyk.com/"));
                startActivity(it);
                break;

            case R.id.ivNewmedical:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://newmedicaltec.com.br/"));
                startActivity(it);
                break;

            case R.id.ivEco:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ecotextil.ind.br/"));
                startActivity(it);
                break;

            case R.id.ivUnifique:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unifique.com.br/"));
                startActivity(it);
                break;

            case R.id.ivPortalmed:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.portalmedsst.com/index.php"));
                startActivity(it);
                break;

            case R.id.ivIfc:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ifc.edu.br/"));
                startActivity(it);
                break;

            case R.id.ivInovale:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.poloinovale.com.br/"));
                startActivity(it);
                break;

            case R.id.ivTirol:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tirol.com.br/"));
                startActivity(it);
                break;

            //Gera Gourmet

            case R.id.ivBotequim:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://botequimdobaptista.com/institucional#meio"));
                startActivity(it);
                break;

            case R.id.ivBrollo:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.brollolanches.com/"));
                startActivity(it);
                break;

            case R.id.ivDegustare:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/degustareoficial/"));
                startActivity(it);
                break;

            case R.id.ivDongeraldo:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Don-Geraldo-Ristorante-228915630926611/?rf=122600374489032"));
                startActivity(it);
                break;

            case R.id.ivEspacogourmet:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/egdz9/?rf=158561340952284"));
                startActivity(it);
                break;

            case R.id.ivEstacaocafe:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/estacaocafe.lojasmulti/"));
                startActivity(it);
                break;

            case R.id.ivEstacaopastel:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.estacaopastel.com.br/"));
                startActivity(it);
                break;

            case R.id.ivHoteljaragua:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hoteljaraguareal.com.br/"));
                startActivity(it);
                break;

            case R.id.ivNipon:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/niponsushideliveryemporium/"));
                startActivity(it);
                break;

            case R.id.ivSrbuteco:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Sr.butecojba/"));
                startActivity(it);
                break;

            case R.id.ivTotti:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Restaurante-Totti-Joacaba-394349920676225/"));
                startActivity(it);
                break;

            case R.id.ivVintage:
                it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vintagecontainerbarjba"));
                startActivity(it);
                break;
        }

    }
}
