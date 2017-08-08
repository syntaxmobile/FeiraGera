package br.com.syntaxmobile.feiragera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class Feira extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feira);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.vfImagens);
        viewFlipper.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        viewFlipper.startFlipping();
        //viewFlipper.setFlipInterval(3000); //intervalo de transição de imagens em milisegundos
        //viewFlipper.showNext(); //ao clicar na imagem vai para a próxima
    }
}
