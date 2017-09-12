package br.com.syntaxmobile.feiragera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Paulo on 31/07/2017.
 */

public class TabFarmacias extends Fragment{

    TextView tel_farm_joacaba, tel_farm_herval, tel_sesi, tel_taxi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.utilidades_farmacias_taxis_fragment, container, false);
        //a linha return rootView; estará aqui. Antes de recuperar os widgets sempre deixar o return rootView no final.
/*
        tel_farm_joacaba = (TextView) rootView.findViewById(R.id.txvTel_farmacia_joacaba);
        tel_farm_joacaba.setOnClickListener(this);
        tel_farm_herval = (TextView) rootView.findViewById(R.id.txvTel_farmacia_herval);
        tel_farm_herval.setOnClickListener(this);
        tel_sesi = (TextView) rootView.findViewById(R.id.txvTel_sesi);
        tel_sesi.setOnClickListener(this);
        tel_taxi = (TextView) rootView.findViewById(R.id.txvTel_taxi);
        tel_taxi.setOnClickListener(this);

*/
        return rootView;
    }
}
