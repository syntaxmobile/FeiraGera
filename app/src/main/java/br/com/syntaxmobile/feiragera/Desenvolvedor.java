package br.com.syntaxmobile.feiragera;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Desenvolvedor extends AppCompatActivity implements View.OnClickListener {

    //Decidi não recuperar por aqui pois acho mais fácil fazer tudo junto logo após. Não sei se isso é uma boa prática mas ta valendo ;)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desenvolvedor);

        //Recuperando o parâmetro do textview do site
        TextView site = (TextView) findViewById(R.id.site);
        site.setOnClickListener(this);
        TextView email = (TextView) findViewById(R.id.email);
        email.setOnClickListener(this);
        TextView fone_paulo = (TextView) findViewById(R.id.telefone1);
        fone_paulo.setOnClickListener(this);
        TextView fone_chris = (TextView) findViewById(R.id.telefone2);
        fone_chris.setOnClickListener(this);

/*
        // Fazendo o evento de click do TexView
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Este código abre o navegador nativo configurado no Android.
                Intent getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.syntaxmobile.com.br"));
                startActivity(getintent);
            }
        });

        */
    }


    //Ou fazer deste jeito, para poder utilizar os outros id recuperados como telefones e o e-mail
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.site:
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.syntaxmobile.com.br"));
                startActivity(it);
                break;

            case R.id.email:
                break;

            case R.id.telefone1:
                //Esse intent é para chamar o a ligação nativa do Android. Já faz a ligação direta
                it = new Intent(Intent.ACTION_CALL);
                //Aqui colocamos o telefone desejado
                it.setData(Uri.parse("tel:49988369625"));

                /*Esta linha de codigo até o final o próprio Android Studio colocou. Estou estudando a documentação dela
                Este código verifica se o usuário já concedeu a permissão do aplicativo realizar ligação, se o status for diferente da permissão
                concedida ele vai retornar e nao vai retornar o startActivity

                Se o usuário não concedeu a permissão podemos solicitar a permissão pelo seguinte comando:

                "ActivityCompat.requestPermissions(Desenvolvedor.this, new String[]{Manifest.permission.CALL_PHONE},1);"

                O número 1 é um request code para solicitar.

                */

                if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Desenvolvedor.this, new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(it);
                break;

            case R.id.telefone2:
                /*Este segundo modo irá pegar o número em uma string e abrir no telefone e aguardar para clicar no botão ligar.
                Discutir qual dos dois fica melhor */

                String telefone = "49988021340";

                Uri uri = Uri.parse("tel:"+telefone);

                it = new Intent(Intent.ACTION_DIAL);
                startActivity(it);

                break;
        }
    }
}
