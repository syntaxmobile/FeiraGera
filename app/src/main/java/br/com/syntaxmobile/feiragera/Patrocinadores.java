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

        ImageView pref_joacaba = (ImageView) findViewById(R.id.prefjoacaba);
        pref_joacaba.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.prefjoacaba:
                String url = "http://www.joacaba.sc.gov.br/";
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse(url));
                startActivity(it);
        }

    }
}
