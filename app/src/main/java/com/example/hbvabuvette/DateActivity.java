package com.example.hbvabuvette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class DateActivity extends Activity {

    private static String DateD;
    private static String DateA;
    DBManager MyDB = new DBManager(this);
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activity= this;
        setContentView(R.layout.activity_date);
        Button Btn = findViewById(R.id.button);
        Btn.setOnClickListener(this::OnBtnClick);

    }

    private void OnBtnClick(View view) {
        DateD = SelectDateD();
        DateA = SelectDateA();
        Intent Lancer = new Intent(DateActivity.this, CaisseActivity.class);
        // On lance l'activité
        startActivity(Lancer);


        /*PopUpActivity PopUp = new PopUpActivity(activity,Date);
        //PopUpActivity PopUp = new PopUpActivity(activity,1);
        PopUp.show();
        setContentView(R.layout.activity_casse_historique);*/

    }

    public static String GetDateD(){
        return DateD;
    }

    public static String GetDateA(){
        return DateA;
    }

    private String SelectDateD() {
        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.simpleDatePickerD); // initiate a date picker
        // get the values for day of month , month and year from a date picker
        String day = String.valueOf(simpleDatePicker.getDayOfMonth());
        String month = String.valueOf((simpleDatePicker.getMonth() + 1));
        String year = String.valueOf(simpleDatePicker.getYear());
        if(Integer.parseInt(month)<10){ month = "0" + month; }
        if(Integer.parseInt(day)<10){ day = "0" + day; }
        String dateD = day + "-" + month + "-" + year;
        return dateD;
    }

    private String SelectDateA() {
        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.simpleDatePickerA); // initiate a date picker
        // get the values for day of month , month and year from a date picker
        String day = String.valueOf(simpleDatePicker.getDayOfMonth());
        String month = String.valueOf((simpleDatePicker.getMonth() + 1));
        String year = String.valueOf(simpleDatePicker.getYear());
        if(Integer.parseInt(month)<10){ month = "0" + month; }
        if(Integer.parseInt(day)<10){ day = "0" + day; }
        String dateA = day + "-" + month + "-" + year;
        return dateA;
    }


}
