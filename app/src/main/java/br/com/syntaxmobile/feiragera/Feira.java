package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Parte extends AppCompatActivity implements View.OnClickListener {

    TextView telefone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte);

        telefone = (TextView) findViewById(R.id.tvTelefone);
        telefone.setOnClickListener(this);
        email = (TextView) findViewById(R.id.tvEmail);
        email.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvTelefone:
                String telefone = "4935211333";
                Uri uri = Uri.parse("tel:"+telefone);

                Intent it = new Intent(Intent.ACTION_DIAL);
                startActivity(it);

                break;

            case R.id.tvEmail:
                break;
        }
    }
}
