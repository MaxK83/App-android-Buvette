package com.example.hbvabuvette;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PopUpActivity extends Dialog {

    private Context context = getContext();

    DBManager MyDB = new DBManager(context);

    private EditText ETMonnaie;
    private float Total, TTL;
    int Consigne;
    //String date;
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    public PopUpActivity(@NonNull Activity activity) {
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.activity_popup);
        Button button;

        ETMonnaie = findViewById(R.id.ETMonnaie);
        button = (Button) findViewById(R.id.Btn);
        button.setOnClickListener(this::OnClick);
    }

    public PopUpActivity(@NonNull Activity activity, Float tt ) {
        //valide commande
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.activity_popup_caisse);

        TTL= tt;
        Button btnEspece= (Button) findViewById(R.id.BtnEspece),
               btnCarte= (Button) findViewById(R.id.BtnCarte),
               btnArbitre= (Button) findViewById(R.id.BtnArbitre);

        btnEspece.setOnClickListener(this::OnEspeceClick);
        btnCarte.setOnClickListener(this::OnCarteClick);
        btnArbitre.setOnClickListener(this::OnCarteClick);

    }

    /*public PopUpActivity(Activity activity, int i){
        //Total casse
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_DayNight_Dialog);
        if(i == 1){
            setContentView(R.layout.activity_popup_somme_caisse);

            TextView TV = findViewById(R.id.SubTitle);
            Date = df.format(Calendar.getInstance().getTime());
            float TTCaisse = MyDB.SelectCaisse(Date);

            TV.setText(TTCaisse + "€");
        }


        /*if(i == 2){
            setContentView(R.layout.activity_date);
            PopUpDate();
        }*/
    /*}*/

    public PopUpActivity(Activity activity, String date){
        //Total casse
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_DayNight_Dialog);

        setContentView(R.layout.activity_popup_somme_caisse);
        String DateC = date;
        TextView TV = findViewById(R.id.SubTitle);
        String Date = df.format(Calendar.getInstance().getTime());
        float TTCaisse = MyDB.SelectCaisse2(DateC, Date);
        TV.setText(TTCaisse + "€");
    }

    /*private void OnBtnRetourClick(View view) {
        Consigne = 0;
    }

    private void OnBtnCsngClick(View view) {
        Consigne = 1;
    }

    public int GetConsigne(){
        return Consigne;
    }*/

    private void OnCarteClick(View view) {
        dismiss();
    }

    private void OnEspeceClick(View view) {
        /*TTCaisse = TTCaisse + TTL;
        //String msg = "Total en caisse: " + TTCaisse;
        //Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        Caisse = true;*/

        String date = df.format(Calendar.getInstance().getTime());
        boolean res = MyDB.UpdateVente(date, TTL);
        dismiss();
    }

    public void SetTotal(float total){this.Total = total;}

    private void OnClick(View view) {
        TextView SubTitle, SubTitle2;
        float Monnaie;
        Monnaie = Float.valueOf(ETMonnaie.getText().toString());
        setContentView(R.layout.activity_popup_final);
        SubTitle = (TextView) findViewById(R.id.SubTitle1);
        SubTitle2 = (TextView) findViewById(R.id.SubTitle2);
        SubTitle.setText("Total: " + String.valueOf(Total));
        float Reste = Monnaie - Total;
        SubTitle2.setText("A rendre: " + String.valueOf(Reste));
    }

}