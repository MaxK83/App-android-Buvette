package com.example.hbvabuvette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StockActivity extends AppCompatActivity {

    //private final Context context = this;
    DBManager MyDB2 = new DBManager(this);


    private TextView SCoca, SCoca0, SCocaCherry, SIcetea, SEau, SEauGaz;
    private TextView S7Up, SSchweppes, SOrangina, SLiptonic, SHeineken;
    private TextView SDespe, SMaid, SPerrier, SFanta,SChips, SOasis, SPain;

    private EditText ETCoca, ETCocaZ, ETCocaCherry, ETIcetea, ETEau, ETPain;
    private EditText ETEauGaz, ETOasis, ET7Up, ETSchweppes, ETOrangina, ETLiptonic;
    private EditText ETHeineken, ETDespe, ETMaid, ETPerrier, ETFanta, ETChips;

    private EditText ETCoca2, ETCocaZ2, ETCocaCherry2, ETIcetea2, ETEau2, ETPain2;
    private EditText ETEauGaz2, ETOasis2, ET7Up2, ETSchweppes2, ETOrangina2, ETLiptonic2;
    private EditText ETHeineken2, ETDespe2, ETMaid2, ETPerrier2, ETFanta2, ETChips2;

    private Button BtnValide;

    private int Coca, Coca0, CocaCherry, Icetea, Eau, EauGaz, Oasis, SevUp, Schweppes, Orangina;
    private int Liptonic, Heineken, Despe, Maid, Perrier, Fanta, Chips, Pain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);
        Coca = Coca0 = CocaCherry = Icetea = Eau = EauGaz = Oasis = SevUp = Orangina = 0;
        Liptonic = Heineken = Despe = Fanta = Chips = Maid = Perrier = Schweppes = Pain = 0;

        BtnValide = (Button) findViewById(R.id.BtnValide);

        SCoca0 = (TextView) findViewById(R.id.QttCoca0);            SCocaCherry = (TextView) findViewById(R.id.QttCocaCherry);
        SCoca = (TextView) findViewById(R.id.QttCoca);              SIcetea = (TextView) findViewById(R.id.QttIceTea);
        SEau = (TextView) findViewById(R.id.QttEau);                SEauGaz = (TextView) findViewById(R.id.QttEauGaz);
        SOasis = (TextView) findViewById(R.id.QttOasis);            S7Up = (TextView) findViewById(R.id.Qtt7Up);
        SSchweppes = (TextView) findViewById(R.id.QttSchweppes);    SChips = (TextView) findViewById(R.id.qttChips3);
        SOrangina = (TextView) findViewById(R.id.QttOrangina);      SLiptonic = (TextView) findViewById(R.id.QttLiptonic);
        SHeineken = (TextView) findViewById(R.id.QttBierre2);        SDespe = (TextView) findViewById(R.id.QttDespe);
        SMaid = (TextView) findViewById(R.id.QttMaid);              SPerrier = (TextView) findViewById(R.id.QttPerrier);
        SFanta = (TextView) findViewById(R.id.QttFanta);            SPain = (TextView) findViewById(R.id.QttPain);

        ETCocaZ = (EditText) findViewById(R.id.ETCocaZ);            ETCocaCherry = (EditText) findViewById(R.id.ETCocaCherry);
        ETCoca = (EditText) findViewById(R.id.ETCoca);              ETIcetea = (EditText) findViewById(R.id.ETIceTea);
        ETEau = (EditText) findViewById(R.id.ETEau);                ETEauGaz = (EditText) findViewById(R.id.ETEauGaz);
        ETOasis = (EditText) findViewById(R.id.ETOasis);            ET7Up = (EditText) findViewById(R.id.ET7Up);
        ETSchweppes = (EditText) findViewById(R.id.ETSchweppes);    ETOrangina = (EditText) findViewById(R.id.ETOrangina);
        ETLiptonic = (EditText) findViewById(R.id.ETLiptonic);      ETHeineken = (EditText) findViewById(R.id.ETBierre);
        ETDespe = (EditText) findViewById(R.id.ETDespe);            ETMaid = (EditText) findViewById(R.id.ETMaid);
        ETPerrier = (EditText) findViewById(R.id.ETPerrier);        ETFanta = (EditText) findViewById(R.id.ETFanta);
        ETChips = (EditText) findViewById(R.id.ETChips);            ETPain = (EditText) findViewById(R.id.ETPain);

        ETCocaZ2 = (EditText) findViewById(R.id.ETCocaZ2);          ETCocaCherry2 = (EditText) findViewById(R.id.ETCocaCherry2);
        ETCoca2 = (EditText) findViewById(R.id.ETCoca2);            ETIcetea2 = (EditText) findViewById(R.id.ETIceTea2);
        ETEau2 = (EditText) findViewById(R.id.ETEau2);              ETEauGaz2 = (EditText) findViewById(R.id.ETEauGaz2);
        ETOasis2 = (EditText) findViewById(R.id.ETOasis2);          ET7Up2 = (EditText) findViewById(R.id.ET7Up2);
        ETSchweppes2 = (EditText) findViewById(R.id.ETSchweppes2);  ETOrangina2 = (EditText) findViewById(R.id.ETOrangina2);
        ETLiptonic2 = (EditText) findViewById(R.id.ETLiptonic2);    ETHeineken2 = (EditText) findViewById(R.id.ETBierre2);
        ETDespe2 = (EditText) findViewById(R.id.ETDespe2);          ETMaid2 = (EditText) findViewById(R.id.ETMaid2);
        ETPerrier2 = (EditText) findViewById(R.id.ETPerrier2);      ETFanta2 = (EditText) findViewById(R.id.ETFanta2);
        ETChips2 = (EditText) findViewById(R.id.ETChips2);          ETPain2 = (EditText) findViewById(R.id.ETPain2);


        Coca = MyDB2.SelectQtt("coca");                     SCoca.setText(String.valueOf(Coca));
        Coca0 = MyDB2.SelectQtt("coca0");                   SCoca0.setText(String.valueOf(Coca0));
        CocaCherry = MyDB2.SelectQtt("cocaCherry");         SCocaCherry.setText(String.valueOf(CocaCherry));
        Icetea = MyDB2.SelectQtt("iceTea");                 SIcetea.setText(String.valueOf(Icetea));
        Eau = MyDB2.SelectQtt("eau");                       SEau.setText(String.valueOf(Eau));
        EauGaz = MyDB2.SelectQtt("eauGaz");                 SEauGaz.setText(String.valueOf(EauGaz));
        Oasis = MyDB2.SelectQtt("oasis");                   SOasis.setText(String.valueOf(Oasis));
        SevUp = MyDB2.SelectQtt("7Up");                     S7Up.setText(String.valueOf(SevUp));
        Orangina = MyDB2.SelectQtt("orangina");             SOrangina.setText(String.valueOf(Orangina));
        Schweppes = MyDB2.SelectQtt("schweppes");           SSchweppes.setText(String.valueOf(Schweppes));
        Liptonic = MyDB2.SelectQtt("liptonic");             SLiptonic.setText(String.valueOf(Liptonic));
        Heineken = MyDB2.SelectQtt("heineken");             SHeineken.setText(String.valueOf(Heineken));
        Despe = MyDB2.SelectQtt("despe");                   SDespe.setText(String.valueOf(Despe));
        Fanta = MyDB2.SelectQtt("fanta");                   SFanta.setText(String.valueOf(Fanta));
        Chips = MyDB2.SelectQtt("chips");                   SChips.setText(String.valueOf(Chips));
        Perrier = MyDB2.SelectQtt("perrier");               SPerrier.setText(String.valueOf(Perrier));
        Maid = MyDB2.SelectQtt("maid");                     SMaid.setText(String.valueOf(Maid));
        Pain = MyDB2.SelectQtt("pain");                     SPain.setText(String.valueOf(Pain));

        BtnValide.setOnClickListener(this::OnBtnValideClick);
    }

    private void OnBtnValideClick(View view) {
        /*if(ETCoca.getText().toString() != null){
            Coca = Coca + Integer.valueOf(ETCoca.getText().toString());
            SCoca.setText(String.valueOf(Coca));
            ETCoca.setText("");
        }
        else if(ETCoca2.getText().toString() != null){
            Coca = Integer.valueOf(ETCoca2.getText().toString());
            SCoca.setText(String.valueOf(Coca));
            ETCoca2.setText("");
        }
        else SCoca.setText(String.valueOf(Coca));*/

        if(Integer.valueOf(ETPain2.getText().toString()) != 0){
            Pain = Integer.valueOf(ETPain2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Pain, "pain");
            SPain.setText(String.valueOf(MyDB2.SelectQtt("pain")));
            ETPain2.setText("0");
        }
        else
        {
            Pain = Pain + Integer.valueOf(ETPain.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Pain, "pain");
            SPain.setText(String.valueOf(MyDB2.SelectQtt("pain")));
            ETPain.setText("0");
        }

        if(Integer.valueOf(ETCoca2.getText().toString()) != 0){
            Coca = Integer.valueOf(ETCoca2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Coca, "coca");
            SCoca.setText(String.valueOf(MyDB2.SelectQtt("coca")));
            ETCoca2.setText("0");
        }
        else
        {
            Coca = Coca + Integer.valueOf(ETCoca.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Coca, "coca");
            SCoca.setText(String.valueOf(MyDB2.SelectQtt("coca")));
            ETCoca.setText("0");
        }

        if(Integer.valueOf(ETCocaZ2.getText().toString()) != 0){
            Coca0 = Integer.valueOf(ETCocaZ2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Coca0, "coca0");
            SCoca0.setText(String.valueOf(MyDB2.SelectQtt("coca0")));
            ETCocaZ2.setText("0");
        }
        else
        {
            Coca0 = Coca0 + Integer.valueOf(ETCocaZ.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Coca0, "coca0");
            SCoca0.setText(String.valueOf(MyDB2.SelectQtt("coca0")));
            ETCocaZ.setText("0");
        }

        if(Integer.valueOf(ETCocaCherry2.getText().toString()) != 0){
            CocaCherry = Integer.valueOf(ETCocaCherry2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(CocaCherry, "cocaCherry");
            SCocaCherry.setText(String.valueOf(MyDB2.SelectQtt("cocaCherry")));
            ETCocaCherry2.setText("0");
        }
        else
        {
            CocaCherry = CocaCherry + Integer.valueOf(ETCocaCherry.getText().toString());
            Boolean res = MyDB2.UpdateQtt(CocaCherry, "cocaCherry");
            SCocaCherry.setText(String.valueOf(MyDB2.SelectQtt("cocaCherry")));
            ETCocaCherry.setText("0");
        }

        if(Integer.valueOf(ETIcetea2.getText().toString()) != 0){
            Icetea = Integer.valueOf(ETIcetea2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Icetea, "iceTea");
            SIcetea.setText(String.valueOf(MyDB2.SelectQtt("iceTea")));
            ETIcetea2.setText("0");
        }
        else
        {
            Icetea = Icetea + Integer.valueOf(ETIcetea.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Icetea, "iceTea");
            SIcetea.setText(String.valueOf(MyDB2.SelectQtt("iceTea")));
            ETIcetea.setText("0");
        }

        if(Integer.valueOf(ETOasis2.getText().toString()) != 0){
            Oasis = Integer.valueOf(ETOasis2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Oasis, "oasis");
            SOasis.setText(String.valueOf(MyDB2.SelectQtt("oasis")));
            ETOasis2.setText("0");
        }
        else
        {
            Oasis = Oasis +Integer.valueOf(ETOasis.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Oasis, "oasis");
            SOasis.setText(String.valueOf(MyDB2.SelectQtt("oasis")));
            ETOasis.setText("0");
        }

        if(Integer.valueOf(ET7Up2.getText().toString()) != 0){
            SevUp = Integer.valueOf(ET7Up2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(SevUp, "7Up");
            S7Up.setText(String.valueOf(MyDB2.SelectQtt("7Up")));
            ET7Up2.setText("0");
        }
        else
        {
            SevUp = SevUp + Integer.valueOf(ET7Up.getText().toString());
            Boolean res = MyDB2.UpdateQtt(SevUp, "7Up");
            S7Up.setText(String.valueOf(MyDB2.SelectQtt("7Up")));
            ET7Up.setText("0");
        }

        if(Integer.valueOf(ETSchweppes2.getText().toString()) != 0){
            Schweppes = Integer.valueOf(ETSchweppes2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Schweppes, "schweppes");
            SSchweppes.setText(String.valueOf(MyDB2.SelectQtt("schweppes")));
            ETSchweppes2.setText("0");
        }
        else
        {
            Schweppes = Schweppes +Integer.valueOf(ETSchweppes.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Schweppes, "schweppes");
            SSchweppes.setText(String.valueOf(MyDB2.SelectQtt("schweppes")));
            ETSchweppes.setText("0");
        }

        if(Integer.valueOf(ETOrangina2.getText().toString()) != 0){
            Orangina = Integer.valueOf(ETOrangina2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Orangina, "orangina");
            SOrangina.setText(String.valueOf(MyDB2.SelectQtt("orangina")));
            ETOrangina2.setText("0");
        }
        else
        {
            Orangina = Orangina + Integer.valueOf(ETOrangina.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Orangina, "orangina");
            SOrangina.setText(String.valueOf(MyDB2.SelectQtt("orangina")));
            ETOrangina.setText("0");
        }

        if(Integer.valueOf(ETLiptonic2.getText().toString()) != 0){
            Liptonic = Integer.valueOf(ETLiptonic2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Liptonic, "liptonic");
            SLiptonic.setText(String.valueOf(MyDB2.SelectQtt("liptonic")));
            ETLiptonic2.setText("0");
        }
        else
        {
            Liptonic= Liptonic + Integer.valueOf(ETLiptonic.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Liptonic, "liptonic");
            SLiptonic.setText(String.valueOf(MyDB2.SelectQtt("liptonic")));
            ETLiptonic.setText("0");
        }

        if(Integer.valueOf(ETFanta2.getText().toString()) != 0){
            Fanta = Integer.valueOf(ETFanta2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Fanta, "fanta");
            SFanta.setText(String.valueOf(MyDB2.SelectQtt("fanta")));
            ETFanta2.setText("0");
        }
        else
        {
            Fanta = Fanta + Integer.valueOf(ETFanta.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Fanta, "fanta");
            SFanta.setText(String.valueOf(MyDB2.SelectQtt("fanta")));
            ETFanta.setText("0");
        }

        if(Integer.valueOf(ETMaid2.getText().toString()) != 0){
            Maid = Integer.valueOf(ETMaid2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Maid, "maid");
            SMaid.setText(String.valueOf(MyDB2.SelectQtt("maid")));
            ETMaid2.setText("0");
        }
        else
        {
            Maid = Maid + Integer.valueOf(ETMaid.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Maid, "maid");
            SMaid.setText(String.valueOf(MyDB2.SelectQtt("maid")));
            ETMaid.setText("0");
        }

        if(Integer.valueOf(ETPerrier2.getText().toString()) != 0){
            Perrier = Integer.valueOf(ETPerrier2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Perrier, "perrier");
            SPerrier.setText(String.valueOf(MyDB2.SelectQtt("perrier")));
            ETPerrier2.setText("0");
        }
        else
        {
            Perrier = Perrier+ Integer.valueOf(ETPerrier.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Perrier, "perrier");
            SPerrier.setText(String.valueOf(MyDB2.SelectQtt("perrier")));
            ETPerrier.setText("0");
        }

        if(Integer.valueOf(ETEau2.getText().toString()) != 0){
            Eau = Integer.valueOf(ETEau2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Eau, "eau");
            SEau.setText(String.valueOf(MyDB2.SelectQtt("eau")));
            ETEau2.setText("0");
        }
        else
        {
            Eau = Eau + Integer.valueOf(ETEau.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Eau, "eau");
            SEau.setText(String.valueOf(MyDB2.SelectQtt("eau")));
            ETEau.setText("0");
        }

        if(Integer.valueOf(ETEauGaz2.getText().toString()) != 0){
            EauGaz = Integer.valueOf(ETEauGaz2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(EauGaz, "eauGaz");
            SEauGaz.setText(String.valueOf(MyDB2.SelectQtt("eauGaz")));
            ETEauGaz2.setText("0");
        }
        else
        {
            EauGaz = EauGaz + Integer.valueOf(ETEauGaz.getText().toString());
            Boolean res = MyDB2.UpdateQtt(EauGaz, "eauGaz");
            SEauGaz.setText(String.valueOf(MyDB2.SelectQtt("eauGaz")));
            ETEauGaz.setText("0");
        }

        if(Integer.valueOf(ETHeineken2.getText().toString()) != 0){
            Heineken = Integer.valueOf(ETHeineken2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Heineken, "heineken");
            SHeineken.setText(String.valueOf(MyDB2.SelectQtt("heineken")));
            ETHeineken2.setText("0");
        }
        else
        {
            Heineken = Heineken + Integer.valueOf(ETHeineken.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Heineken, "heineken");
            SHeineken.setText(String.valueOf(MyDB2.SelectQtt("heineken")));
            ETHeineken.setText("0");
        }

        if(Integer.valueOf(ETDespe2.getText().toString()) != 0){
            Despe = Integer.valueOf(ETDespe2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Despe, "despe");
            SDespe.setText(String.valueOf(MyDB2.SelectQtt("despe")));
            ETDespe2.setText("0");
        }
        else
        {
            Despe = Despe + Integer.valueOf(ETDespe.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Despe, "despe");
            SDespe.setText(String.valueOf(MyDB2.SelectQtt("despe")));
            ETDespe.setText("0");
        }

        if(Integer.valueOf(ETChips2.getText().toString()) != 0){
            Chips = Integer.valueOf(ETChips2.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Chips, "chips");
            SChips.setText(String.valueOf(MyDB2.SelectQtt("chips")));
            ETChips2.setText("0");
        }
        else
        {
            Chips = Chips + Integer.valueOf(ETChips.getText().toString());
            Boolean res = MyDB2.UpdateQtt(Chips, "chips");
            SChips.setText(String.valueOf(MyDB2.SelectQtt("chips")));
            ETChips.setText("0");
        }
    }
}

