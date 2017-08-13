package br.com.syntaxmobile.feiragera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Expositores extends AppCompatActivity {

    ImageView prefeitura, sebrae, unoesc, fiesc, irani, pioneiro, itl, scherer, sesc, senac, jrc, italiana, village, contassesc,
            tricam, redux, odeme, newonk, newmedical, eco, unifique, pormalmed, ifc, inovale, tirol, botequim, brollo, degustare,
            dongeraldo, espaco_gourmet, estacao_cafe, estacao_pastel, hotel_jaragua, nipon, srbuteco, totti, vintage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expositores);

        prefeitura = (ImageView) findViewById(R.id.ivPref_joacaba);
        sebrae = (ImageView) findViewById(R.id.ivSebrae);
        unoesc = (ImageView) findViewById(R.id.ivUnoesc);
        fiesc = (ImageView) findViewById(R.id.ivFiesc);
        irani = (ImageView) findViewById(R.id.ivIrani);
        pioneiro = (ImageView) findViewById(R.id.ivPioneiro);
        itl = (ImageView) findViewById(R.id.ivItl);
        scherer = (ImageView) findViewById(R.id.ivScherer);
    }
}
