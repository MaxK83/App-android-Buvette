package com.example.hbvabuvette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private MainActivity activity;
    //DBManager MyDB = new DBManager(this);

    private Button BtnStock, BtnVente, BtnCaisse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MyDB.Reset();

        this.activity= this;
        BtnStock = (Button) findViewById(R.id.BtnStock);
        BtnVente = (Button) findViewById(R.id.BtnVente);
        BtnCaisse = (Button) findViewById(R.id.BtnCaisse);

        BtnStock.setOnClickListener(this::OnBtnStockClick);
        BtnVente.setOnClickListener(this::OnBtnVenteClick);
        BtnCaisse.setOnClickListener(this::OnBtnCaisseClick);
    }

    private void OnBtnCaisseClick(View view) {
        Intent Lancer = new Intent(MainActivity.this, DateActivity.class);
        // On lance l'activité
        startActivity(Lancer);
    }

    private void OnBtnStockClick(View v) {
        Intent Lancer = new Intent(MainActivity.this, StockActivity.class);
        // On lance l'activité
        startActivity(Lancer);
    }

    private void OnBtnVenteClick(View v) {
        Intent Lancer = new Intent(MainActivity.this, VenteActivity.class);
        // On lance l'activité
        startActivity(Lancer);
    }

}
