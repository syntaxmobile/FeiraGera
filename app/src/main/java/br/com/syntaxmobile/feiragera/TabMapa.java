package br.com.syntaxmobile.feiragera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by Paulo on 31/07/2017.
 */

public class TabMapa extends Fragment implements OnMapReadyCallback {

    MapView mapView;
    GoogleMap map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mapa, container, false);

        mapView = (MapView) rootView.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);


        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng unoesc = new LatLng(-27.166153, -51.518098);
        map.addMarker(new MarkerOptions().position(unoesc).title("Feira Gera"));
        map.setTrafficEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-27.166153, -51.518098), 18));

    }
}