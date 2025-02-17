/*package com.example.hbvabuvette;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


/*CrepeChoco=Increment(CrepeChoco);
        float prix = prix3;
        SCrepeChoco.setText("Crepe Choco: \t\t\t"+ String.valueOf(CrepeChoco));
        IncrePrix(prix);

public class VenteActivity extends AppCompatActivity {

    private VenteActivity activity;
    DBManager MyDB = new DBManager(this);

    private ImageButton BtnCoca, BtnCoca0, BtnCocaCherry,BtnCancel, BtnIcetea, BtnEau, BtnEauGaz, BtnOasis, BtnPanini;
    private ImageButton Btn7Up, BtnSchweppes, BtnCafe, BtnThe, BtnChoco, BtnOrangina, BtnLiptonic, BtnHeineken;
    private ImageButton BtnDespe, BtnMaid, BtnPerrier, BtnFanta, BtnCappu, BtnChips, BtnSucette, BtnFriandise, BtnCarte;
    private ImageButton BtnViennoiserie, BtnSandwich, BtnCrepeChoco, BtnPaniniChoco, BtnCrepe, BtnValide, BtnReste;

    private TextView SCoca, SCoca0, SCocaCherry, SIcetea, SEau, SEauGaz, SOasis, SPanini, SCarte;
    private TextView S7Up, SSchweppes, SCafe, SThe, SChoco, SOrangina, SLiptonic, SHeineken;
    private TextView SDespe, SMaid, SPerrier, SFanta, SCappu, SChips, SSucette, SFriandise;
    private TextView SViennoiserie, SSandwich, SCrepeChoco, SPaniniChoco, SCrepe, STotal;

    private int Coca, Coca0, CocaCherry, Icetea, Eau, EauGaz, Oasis, SevUp, Schweppes, Cafe, The, Choco, Orangina;
    private int Liptonic, Heineken, Despe, Maid, Perrier, Fanta, Cappu, Chips, Sucette, Friandise, Viennoiserie;
    private int Sandwich, CrepeChoco, PaniniChoco, Crepe, Panini, Carte;

    private float Total = 0.000F;
    private float prix1 = 1.00F;
    private float prix2 = 2.00F;
    private float prix3 = 3.00F;
    private float prix05 = 0.50F;
    private float prix15 = 1.50F;
    private float prix25 = 2.50F;
    private float prix35 = 3.50F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activity= this;
        setContentView(R.layout.activity_vente2);
        Coca = Coca0 = CocaCherry = Icetea = Eau = EauGaz = Oasis = SevUp = Cafe = The = Choco = Orangina = 0;
        Liptonic = Heineken = Despe = Fanta = Cappu = Chips = Sucette = Friandise = Viennoiserie = 0;
        Sandwich = CrepeChoco = PaniniChoco = Crepe = Maid = Perrier = Schweppes = Panini = Carte = 0;

        SCoca0 = (TextView) findViewById(R.id.TVCoca0);               SCocaCherry = (TextView) findViewById(R.id.TVCocaCherry);
        SCoca = (TextView) findViewById(R.id.TVCoca);                 SIcetea = (TextView) findViewById(R.id.TVIceTea);
        SEau = (TextView) findViewById(R.id.TVEau);                   SEauGaz = (TextView) findViewById(R.id.TVEauGaz);
        SOasis = (TextView) findViewById(R.id.TVOasis);               S7Up = (TextView) findViewById(R.id.TV7up);
        SSchweppes = (TextView) findViewById(R.id.TVSchweppes);       SCafe = (TextView) findViewById(R.id.TVcafe);
        SThe = (TextView) findViewById(R.id.TVThe);                   SChoco = (TextView) findViewById(R.id.TVChocolat);
        SOrangina = (TextView) findViewById(R.id.TVOrangina);         SLiptonic = (TextView) findViewById(R.id.TVLiptonic);
        SHeineken = (TextView) findViewById(R.id.TVheineken);         SDespe = (TextView) findViewById(R.id.TVDespe);
        SMaid = (TextView) findViewById(R.id.TVMaid);                 SPerrier = (TextView) findViewById(R.id.TVPerrier);
        SFanta = (TextView) findViewById(R.id.TVFanta);               SCappu = (TextView) findViewById(R.id.TVCappuccino);
        SChips = (TextView) findViewById(R.id.TVChips);               SSucette = (TextView) findViewById(R.id.TVSucette);
        SFriandise = (TextView) findViewById(R.id.TVFriandise);       SViennoiserie = (TextView) findViewById(R.id.TVViennoiserie);
        SSandwich = (TextView) findViewById(R.id.TVSandwich);         SCrepeChoco = (TextView) findViewById(R.id.TVCrepeChoco);
        SPaniniChoco = (TextView) findViewById(R.id.TVPaniniChoco);   SCrepe = (TextView) findViewById(R.id.TVCrepe);
        STotal = (TextView) findViewById(R.id.TVTotal);               SPanini = (TextView) findViewById(R.id.TVPanini);
        SCarte = (TextView) findViewById(R.id.TVCarte);

        SCoca.setText("Coca: \t\t\t\t" + String.valueOf(Coca));                         SCoca0.setText("Coca 0: \t\t\t\t" + String.valueOf(Coca0));
        SCocaCherry.setText("Coca Cherry: \t\t" + String.valueOf(CocaCherry));          SIcetea.setText("Ice Tea: \t\t\t\t" + String.valueOf(Icetea));
        SEau.setText("Eau: \t\t\t\t\t" + String.valueOf(Eau));                          SEauGaz.setText("Eau Petillante: \t" + String.valueOf(EauGaz));
        SOasis.setText("Oasis: \t\t\t\t" + String.valueOf(Oasis));                      S7Up.setText("7Up: \t\t\t\t\t" + String.valueOf(SevUp));
        SCafe.setText("Cafe: \t\t\t\t\t" + String.valueOf(Cafe));                       SThe.setText("The: \t\t\t\t\t" + String.valueOf(The));
        SChoco.setText("Chocolat: \t\t\t" + String.valueOf(Choco));                     SOrangina.setText("Orangina: \t\t\t" + String.valueOf(Orangina));
        SLiptonic.setText("Liptonic: \t\t\t" + String.valueOf(Liptonic));               SHeineken.setText("Hieneken: \t\t\t" + String.valueOf(Heineken));
        SDespe.setText("Despe: \t\t\t\t" + String.valueOf(Despe));                      SFanta.setText("Fanta: \t\t\t\t" + String.valueOf(Fanta));
        SCappu.setText("Cappuccino: \t\t" + String.valueOf(Cappu));                     SChips.setText("Chips: \t\t\t\t" + String.valueOf(Chips));
        SSucette.setText("Sucette: \t\t\t\t" + String.valueOf(Sucette));                SFriandise.setText("Friandise: \t\t\t" + String.valueOf(Friandise));
        SViennoiserie.setText("Viennoiserie: \t\t" + String.valueOf(Viennoiserie));     SSandwich.setText("Sandwich: \t\t\t" + String.valueOf(Sandwich));
        SCrepeChoco.setText("Crepe Choco: \t\t" + String.valueOf(CrepeChoco));          SPaniniChoco.setText("Panini Choco: \t\t" + String.valueOf(PaniniChoco));
        SPanini.setText("Panini: \t\t\t\t" + String.valueOf(Panini));                     SCrepe.setText("Crepe: \t\t\t\t" + String.valueOf(Crepe));
        SCarte.setText("Carte: \t\t\t\t" + String.valueOf(Carte));                      SMaid.setText("Min. Maid: \t\t\t" + String.valueOf(Maid));
        SPerrier.setText("Perrier: \t\t\t\t" + String.valueOf(Perrier));                SSchweppes.setText("Schweppes: \t\t" + String.valueOf(Schweppes));

        BtnCancel = (ImageButton) findViewById(R.id.btnCancel);                 BtnValide = (ImageButton) findViewById(R.id.btnDone);
        BtnCoca = (ImageButton) findViewById(R.id.btnCoca);                     BtnPaniniChoco = (ImageButton) findViewById(R.id.btnPaniniChoco3);
        BtnCocaCherry = (ImageButton) findViewById(R.id.btnCocaCherry3);        BtnEau = (ImageButton) findViewById(R.id.btnEau3);
        BtnIcetea = (ImageButton) findViewById(R.id.btnIceTea3);                BtnCrepeChoco = (ImageButton) findViewById(R.id.btnCrepeChoco3);
        BtnEauGaz = (ImageButton) findViewById(R.id.btnEauGaz3);                BtnOasis= (ImageButton) findViewById(R.id.btnOasis3);
        Btn7Up = (ImageButton) findViewById(R.id.btn7Up3);                      BtnSchweppes = (ImageButton) findViewById(R.id.btnSchweppes3);
        BtnCafe = (ImageButton) findViewById(R.id.btnCafe3);                    BtnThe = (ImageButton) findViewById(R.id.btnThe3);
        BtnChoco = (ImageButton) findViewById(R.id.btnChoco3);                  BtnOrangina = (ImageButton) findViewById(R.id.btnOrangina3);
        BtnLiptonic = (ImageButton) findViewById(R.id.btnLiptonic3);            BtnDespe = (ImageButton) findViewById(R.id.btnDespe3);
        BtnHeineken = (ImageButton) findViewById(R.id.btnBierre3);              BtnMaid = (ImageButton) findViewById(R.id.btnMaid3);
        BtnPerrier = (ImageButton) findViewById(R.id.btnPerrier3);              BtnFanta = (ImageButton) findViewById(R.id.btnFanta3);
        BtnCappu = (ImageButton) findViewById(R.id.btnCappu3);                  BtnSucette = (ImageButton) findViewById(R.id.btnSucette3);
        BtnFriandise = (ImageButton) findViewById(R.id.btnFriandise3);          BtnCrepe = (ImageButton) findViewById(R.id.btnCrepe3);
        BtnViennoiserie = (ImageButton) findViewById(R.id.btnVienoiserie3);     BtnChips = (ImageButton) findViewById(R.id.btnChips3);
        BtnSandwich = (ImageButton) findViewById(R.id.btnSandwich3);            BtnCoca0 = (ImageButton) findViewById(R.id.btnCoca0);
        BtnReste = (ImageButton) findViewById(R.id.btnReste);                   BtnCarte = (ImageButton) findViewById(R.id.btnCarte);
        BtnPanini = (ImageButton) findViewById(R.id.btnPanini);


        BtnCancel.setOnClickListener(this::OnBtnCancelClick);               //BtnValide.setOnClickListener(this::OnBtnValideClick);
        BtnCoca.setOnClickListener(this::OnBtnCocaClick);                   BtnCoca0.setOnClickListener(this::OnBtnCoca0Click);
        BtnCocaCherry.setOnClickListener(this::OnBtnCocaCherryClick);       BtnIcetea.setOnClickListener(this::OnBtnIceTeaClick);
        BtnPaniniChoco.setOnClickListener(this::OnBtnPaniniChocoClick);     BtnEauGaz.setOnClickListener(this::OnBtnEauGazClick);
        BtnEau.setOnClickListener(this::OnBtnEauClick);                     BtnCrepeChoco.setOnClickListener(this::OnBtnCrepeChocoClick);
        BtnOasis.setOnClickListener(this::OnBtnOasisClick);                 Btn7Up.setOnClickListener(this::OnBtn7UpClick);
        BtnSchweppes.setOnClickListener(this::OnBtnSchweppesClick);         BtnCafe.setOnClickListener(this::OnBtnCafeClick);
        BtnThe.setOnClickListener(this::OnBtnTheClick);                     BtnChoco.setOnClickListener(this::OnBtnChocoClick);
        BtnOrangina.setOnClickListener(this::OnBtnOranginaClick);           BtnLiptonic.setOnClickListener(this::OnBtnLiptonicClick);
        BtnDespe.setOnClickListener(this::OnBtnDespeClick);                 BtnHeineken.setOnClickListener(this::OnBtnHeinekenClick);
        BtnMaid.setOnClickListener(this::OnBtnMaidClick);                   BtnPerrier.setOnClickListener(this::OnBtnPerrierClick);
        BtnFanta.setOnClickListener(this::OnBtnFantaClick);                 BtnCappu.setOnClickListener(this::OnBtnCappuccinoClick);
        BtnSucette.setOnClickListener(this::OnBtnSucetteClick);             BtnFriandise.setOnClickListener(this::OnBtnFriandiseClick);
        BtnCrepe.setOnClickListener(this::OnBtnCrepeClick);                 BtnViennoiserie.setOnClickListener(this::OnBtnViennoiserieClick);
        BtnChips.setOnClickListener(this::OnBtnChipsClick);                 BtnSandwich.setOnClickListener(this::OnBtnSandwichClick);
        BtnReste.setOnClickListener(this::OnBtnResteClick);                 BtnPanini.setOnClickListener(this::OnBtnPaniniClick);
        BtnCarte.setOnClickListener(this::OnBtnCarteClick);
    }

    private void OnBtnPaniniClick(View view) {
        Panini=Increment(Panini);
        float prix = prix3;
        SPanini.setText("Panini: \t\t\t\t" + String.valueOf(Panini));
        IncrePrix(prix);
    }

    private void OnBtnCarteClick(View view) {
        Carte=Increment(Carte);
        float prix = 20;
        SCarte.setText("Carte: \t\t\t\t" + String.valueOf(Carte));
        IncrePrix(prix);
    }

    private void OnBtnResteClick(View view) {
        PopUpActivity PopUp = new PopUpActivity(activity);
        PopUp.SetTotal(Total);
        PopUp.show();
    }

    private void OnBtnSandwichClick(View view) {
        Sandwich=Increment(Sandwich);
        float prix = prix3;
        SSandwich.setText("Sandwich: \t\t\t" + String.valueOf(Sandwich));
        IncrePrix(prix);
    }

    private void OnBtnChipsClick(View view) {
        Chips=Increment(Chips);
        float prix = MyDB.SelectPrix("chips");
        prix += 0.50;
        SChips.setText("Chips: \t\t\t\t" + String.valueOf(Chips));
        IncrePrix(prix);
    }

    private void OnBtnViennoiserieClick(View view) {
        Viennoiserie=Increment(Viennoiserie);
        float prix = prix15;
        SViennoiserie.setText("Viennoiserie: \t\t" + String.valueOf(Viennoiserie));
        IncrePrix(prix);
    }

    private void OnBtnCrepeClick(View view) {
        Crepe=Increment(Crepe);
        float prix = prix25;
        SCrepe.setText("Crepe: \t\t\t\t" + String.valueOf(Crepe));
        IncrePrix(prix);
    }

    private void OnBtnFriandiseClick(View view) {
        Friandise = Increment(Friandise);
        float prix = prix1;
        SFriandise.setText("Friandise: \t\t\t" + String.valueOf(Friandise));
        IncrePrix(prix);
    }

    private void OnBtnSucetteClick(View view) {
        Sucette = Increment(Sucette);
        float prix =prix05;
        SSucette.setText("Sucette: \t\t\t\t" + String.valueOf(Sucette));
        IncrePrix(prix);
    }

    private void OnBtnCappuccinoClick(View view) {
        Cappu=Increment(Cappu);
        float prix = prix2;
        SCappu.setText("Cappuccino: \t\t" + String.valueOf(Cappu));
        IncrePrix(prix);
    }

    private void OnBtnFantaClick(View view) {
        Fanta=Increment(Fanta);
        float prix = MyDB.SelectPrix("fanta");
        SFanta.setText("Fanta: \t\t\t\t" + String.valueOf(Fanta));
        IncrePrix(prix);
    }

    private void OnBtnPerrierClick(View view) {
        Perrier=Increment(Perrier);
        float prix = MyDB.SelectPrix("perrier");
        SPerrier.setText("Perrier: \t\t\t\t" + String.valueOf(Perrier));
        IncrePrix(prix);
    }

    private void OnBtnMaidClick(View view) {
        Maid=Increment(Maid);
        float prix = MyDB.SelectPrix("maid");
        SMaid.setText("Min. Maid: \t\t\t" + String.valueOf(Maid));
        IncrePrix(prix);
    }

    private void OnBtnHeinekenClick(View view) {
        Heineken=Increment(Heineken);
        float prix = MyDB.SelectPrix("heineken");
        SHeineken.setText("Hieneken: \t\t\t" + String.valueOf(Heineken));
        IncrePrix(prix);
    }

    private void OnBtnDespeClick(View view) {
        Despe=Increment(Despe);
        float prix = MyDB.SelectPrix("despe");
        prix += 0.50;;
        SDespe.setText("Despe: \t\t\t\t" + String.valueOf(Despe));
        IncrePrix(prix);
    }

    private void OnBtnLiptonicClick(View view) {
        Liptonic=Increment(Liptonic);
        float prix = MyDB.SelectPrix("liptonic");
        SLiptonic.setText("Liptonic: \t\t\t" + String.valueOf(Liptonic));
        IncrePrix(prix);
    }

    private void OnBtnOranginaClick(View view) {
        Orangina=Increment(Orangina);
        float prix = MyDB.SelectPrix("orangina");
        SOrangina.setText("Orangina: \t\t\t" + String.valueOf(Orangina));
        IncrePrix(prix);
    }

    private void OnBtnChocoClick(View view) {
        Choco=Increment(Choco);
        float prix= prix2;
        SChoco.setText("Chocolat: \t\t\t" + String.valueOf(Choco));
        IncrePrix(prix);
    }

    private void OnBtnTheClick(View view) {
        The=Increment(The);
        float prix= prix15;
        SThe.setText("The: \t\t\t\t\t" + String.valueOf(The));
        IncrePrix(prix);
    }

    private void OnBtnCafeClick(View view) {
        Cafe=Increment(Cafe);
        float prix =prix1;
        SCafe.setText("Cafe: \t\t\t\t\t" + String.valueOf(Cafe));
        IncrePrix(prix);
    }

    private void OnBtnSchweppesClick(View view) {
        Schweppes=Increment(Schweppes);
        float prix = MyDB.SelectPrix("schweppes");
        SSchweppes.setText("Schweppes: \t\t" + String.valueOf(Schweppes));
        IncrePrix(prix);
    }

    private void OnBtn7UpClick(View view) {
        SevUp=Increment(SevUp);
        float prix = MyDB.SelectPrix("7Up");
        S7Up.setText("7Up: \t\t\t\t\t" + String.valueOf(SevUp));
        IncrePrix(prix);
    }

    private void OnBtnOasisClick(View view) {
        Oasis=Increment(Oasis);
        float prix = MyDB.SelectPrix("oasis");
        SOasis.setText("Oasis: \t\t\t\t" + String.valueOf(Oasis));
        IncrePrix(prix);
    }

    private void OnBtnCrepeChocoClick(View view) {
        CrepeChoco=Increment(CrepeChoco);
        float prix = prix3;
        SCrepeChoco.setText("Crepe Choco: \t\t"+ String.valueOf(CrepeChoco));
        IncrePrix(prix);
    }

    private void OnBtnEauClick(View view) {
        Eau=Increment(Eau);
        float prix = MyDB.SelectPrix("eau");
        SEau.setText("eau: \t\t\t\t\t" + String.valueOf(Icetea));
        IncrePrix(prix);
    }

    private void OnBtnEauGazClick(View view) {
        EauGaz=Increment(EauGaz);
        float prix = MyDB.SelectPrix("eauGaz");
        SEauGaz.setText("Eau Petillante: \t" + String.valueOf(EauGaz));
        IncrePrix(prix);
    }

    private void OnBtnPaniniChocoClick(View view) {
        PaniniChoco=Increment(PaniniChoco);
        float prix = prix25;
        SPaniniChoco.setText("Panini Choco: \t\t" + String.valueOf(PaniniChoco));
        IncrePrix(prix);
    }

    private void OnBtnIceTeaClick(View view) {
        Icetea=Increment(Icetea);
        float prix = MyDB.SelectPrix("iceTea");
        SIcetea.setText("Ice Tea: \t\t\t\t" + String.valueOf(Icetea));
        IncrePrix(prix);
    }
    private void OnBtnCocaClick(View v) {
        Coca=Increment(Coca);
        float prix = MyDB.SelectPrix("coca");
        SCoca.setText("Coca: \t\t\t\t" + String.valueOf(Coca));
        IncrePrix(prix);
    }
    private void OnBtnCoca0Click(View v) {
        Coca0=Increment(Coca0);
        float prix = MyDB.SelectPrix("coca0");
        SCoca0.setText("Coca 0: \t\t\t\t" + String.valueOf(Coca0));
        IncrePrix(prix);
    }
    private void OnBtnCocaCherryClick(View v) {
        CocaCherry=Increment(CocaCherry);
        float prix = MyDB.SelectPrix("cocaCherry");
        SCocaCherry.setText("Coca Cherry: \t\t" + String.valueOf(CocaCherry));
        IncrePrix(prix);
    }
    private int Increment(int Valeur){
        int Val=Valeur+1;
        return Val;
    }
    private void IncrePrix(float valeur){
        Total= Total + valeur;
        STotal.setText("Total: \t\t" + String.valueOf(Total));
    }

    private void OnBtnCancelClick(View view) {
        Coca = Coca0 = CocaCherry = Icetea = Eau = EauGaz = Oasis = SevUp = Cafe = The = Choco = Orangina = 0;
        Liptonic = Heineken = Despe = Fanta = Cappu = Chips = Sucette = Friandise = Viennoiserie = 0;
        Sandwich = CrepeChoco = PaniniChoco = Crepe = Maid = Perrier = Schweppes = Panini = Carte = 0;
        Total=0.00F;
        SCoca.setText("Coca: \t\t\t\t" + String.valueOf(Coca));
        SCoca0.setText("Coca 0: \t\t\t\t" + String.valueOf(Coca0));
        SCocaCherry.setText("Coca Cherry: \t\t" + String.valueOf(CocaCherry));
        SIcetea.setText("Ice Tea: \t\t\t\t" + String.valueOf(Icetea));
        SEau.setText("Eau: \t\t\t\t\t" + String.valueOf(Eau));
        SEauGaz.setText("Eau Petillante: \t" + String.valueOf(EauGaz));
        SOasis.setText("Oasis: \t\t\t\t" + String.valueOf(Oasis));
        S7Up.setText("7Up: \t\t\t\t\t" + String.valueOf(SevUp));
        SCafe.setText("Cafe: \t\t\t\t\t" + String.valueOf(Cafe));
        SThe.setText("The: \t\t\t\t\t" + String.valueOf(The));
        SChoco.setText("Chocolat: \t\t\t" + String.valueOf(Choco));
        SOrangina.setText("Orangina: \t\t\t" + String.valueOf(Orangina));
        SLiptonic.setText("Liptonic: \t\t\t" + String.valueOf(Liptonic));
        SHeineken.setText("Hieneken: \t\t\t" + String.valueOf(Heineken));
        SDespe.setText("Despe: \t\t\t\t" + String.valueOf(Despe));
        SFanta.setText("Fanta: \t\t\t\t" + String.valueOf(Fanta));
        SCappu.setText("Cappuccino: \t\t" + String.valueOf(Cappu));
        SChips.setText("Chips: \t\t\t\t" + String.valueOf(Chips));
        SSucette.setText("Sucette: \t\t\t\t" + String.valueOf(Sucette));
        SFriandise.setText("Friandise: \t\t\t" + String.valueOf(Friandise));
        SViennoiserie.setText("Viennoiserie: \t\t" + String.valueOf(Viennoiserie));
        SSandwich.setText("Sandwich: \t\t\t" + String.valueOf(Sandwich));
        SCrepeChoco.setText("Crepe Choco: \t\t" + String.valueOf(CrepeChoco));
        SPaniniChoco.setText("Panini Choco: \t\t" + String.valueOf(PaniniChoco));
        SCrepe.setText("Crepe: \t\t\t\t" + String.valueOf(Crepe));
        SMaid.setText("Min. Maid: \t\t\t" + String.valueOf(Maid));
        SPerrier.setText("Perrier: \t\t\t\t" + String.valueOf(Perrier));
        SSchweppes.setText("Schweppes: \t\t" + String.valueOf(Schweppes));
        SPanini.setText("Panini: \t\t\t\t" + String.valueOf(Panini));
        SCarte.setText("Carte: \t\t\t\t" + String.valueOf(Carte));
        STotal.setText("Total: \t\t" + String.valueOf(Total));
    }
}*/


package com.example.hbvabuvette;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/*CrepeChoco=Increment(CrepeChoco);
        float prix = prix3;
        SCrepeChoco.setText("Crepe Choco: \t\t\t"+ String.valueOf(CrepeChoco));
        IncrePrix(prix);*/

public class VenteActivity extends AppCompatActivity {

    private VenteActivity activity;
    DBManager MyDB = new DBManager(this);

    String date;
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    private ImageButton BtnCoca, BtnCoca0, BtnCocaCherry,BtnCancel, BtnIcetea, BtnEau, BtnEauGaz, BtnOasis, BtnPanini, BtnLait;
    private ImageButton Btn7Up, BtnSchweppes, BtnCafe, BtnThe, BtnChoco, BtnOrangina, BtnLiptonic, BtnHeineken, BtnCsgn, Btn1664;
    private ImageButton BtnDespe, BtnMaid, BtnPerrier, BtnFanta, BtnCappu, BtnChips, BtnSucette, BtnFriandise, BtnCarte, BtnKinder;
    private ImageButton BtnViennoiserie, BtnSandwich, BtnCrepeChoco, BtnPaniniChoco, BtnCrepe, BtnValide, BtnReste, BtnCsgnR;

    private TextView Liste;

    private int Coca, Coca0, CocaCherry, Icetea, Eau, EauGaz, Oasis, SevUp, Schweppes, Cafe, The, Choco, Orangina;
    private int Liptonic, Heineken, Despe, Maid, Perrier, Fanta, Cappu, Chips, Sucette, Friandise, Viennoiserie;
    private int Sandwich, CrepeChoco, PaniniChoco, Crepe, Panini, Carte, Consigne, ConsigneR, Lait, B1664, Kinder;

    private float Total = 0.00F;
    private float prix1 = 1.00F;
    private float prix2 = 2.00F;
    private float prix3 = 3.00F;
    private float prix05 = 0.50F;
    private float prix15 = 1.50F;
    private float prix25 = 2.50F;
    private float prix35 = 3.50F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activity= this;
        setContentView(R.layout.activity_vente);

        date = df.format(Calendar.getInstance().getTime());

        Coca = Coca0 = CocaCherry = Icetea = Eau = EauGaz = Oasis = SevUp = Cafe = The = Choco = Orangina = Lait = 0;
        Liptonic = Heineken = Despe = Fanta = Cappu = Chips = Sucette = Friandise = Viennoiserie = Consigne = B1664 =0;
        Sandwich = CrepeChoco = PaniniChoco = Crepe = Maid = Perrier = Schweppes = Panini = Carte = ConsigneR = Kinder = 0;


        Liste = (TextView) findViewById(R.id.TVProd);

        Liste.setText("");

        BtnCancel = (ImageButton) findViewById(R.id.btnCancel);                 BtnValide = (ImageButton) findViewById(R.id.btnDone);
        BtnCoca = (ImageButton) findViewById(R.id.btnCoca);                     BtnPaniniChoco = (ImageButton) findViewById(R.id.btnPaniniChoco3);
        BtnCocaCherry = (ImageButton) findViewById(R.id.btnCocaCherry3);        BtnEau = (ImageButton) findViewById(R.id.btnEau3);
        BtnIcetea = (ImageButton) findViewById(R.id.btnIceTea3);                BtnCrepeChoco = (ImageButton) findViewById(R.id.btnCrepeChoco3);
        BtnEauGaz = (ImageButton) findViewById(R.id.btnEauGaz3);                BtnOasis= (ImageButton) findViewById(R.id.btnOasis3);
        Btn7Up = (ImageButton) findViewById(R.id.btn7Up3);                      BtnSchweppes = (ImageButton) findViewById(R.id.btnSchweppes3);
        BtnCafe = (ImageButton) findViewById(R.id.btnCafe3);                    BtnThe = (ImageButton) findViewById(R.id.btnThe3);
        BtnChoco = (ImageButton) findViewById(R.id.btnChoco3);                  BtnOrangina = (ImageButton) findViewById(R.id.btnOrangina3);
        BtnLiptonic = (ImageButton) findViewById(R.id.btnLiptonic3);            BtnDespe = (ImageButton) findViewById(R.id.btnDespe3);
        BtnHeineken = (ImageButton) findViewById(R.id.btnBierre3);              BtnMaid = (ImageButton) findViewById(R.id.btnMaid3);
        BtnPerrier = (ImageButton) findViewById(R.id.btnPerrier3);              BtnFanta = (ImageButton) findViewById(R.id.btnFanta3);
        BtnCappu = (ImageButton) findViewById(R.id.btnCappu3);                  BtnSucette = (ImageButton) findViewById(R.id.btnSucette3);
        BtnFriandise = (ImageButton) findViewById(R.id.btnFriandise3);          BtnCrepe = (ImageButton) findViewById(R.id.btnCrepe3);
        BtnViennoiserie = (ImageButton) findViewById(R.id.btnVienoiserie3);     BtnChips = (ImageButton) findViewById(R.id.btnChips3);
        BtnSandwich = (ImageButton) findViewById(R.id.btnSandwich3);            BtnCoca0 = (ImageButton) findViewById(R.id.btnCoca0);
        BtnReste = (ImageButton) findViewById(R.id.btnReste);                   BtnCarte = (ImageButton) findViewById(R.id.btnCarte);
        BtnPanini = (ImageButton) findViewById(R.id.btnPanini);                 BtnCsgn = (ImageButton) findViewById(R.id.btnCsgn);
        BtnCsgnR = (ImageButton) findViewById(R.id.btnCsgnR);                   BtnLait = (ImageButton) findViewById(R.id.btnLait);
        Btn1664 = (ImageButton) findViewById(R.id.btn1664);                     BtnKinder = (ImageButton) findViewById(R.id.btnKinder);

        BtnCancel.setOnClickListener(this::OnBtnCancelClick);               BtnValide.setOnClickListener(this::OnBtnValideClick);
        BtnCoca.setOnClickListener(this::OnBtnCocaClick);                   BtnCoca0.setOnClickListener(this::OnBtnCoca0Click);
        BtnCocaCherry.setOnClickListener(this::OnBtnCocaCherryClick);       BtnIcetea.setOnClickListener(this::OnBtnIceTeaClick);
        BtnPaniniChoco.setOnClickListener(this::OnBtnPaniniChocoClick);     BtnEauGaz.setOnClickListener(this::OnBtnEauGazClick);
        BtnEau.setOnClickListener(this::OnBtnEauClick);                     BtnCrepeChoco.setOnClickListener(this::OnBtnCrepeChocoClick);
        BtnOasis.setOnClickListener(this::OnBtnOasisClick);                 Btn7Up.setOnClickListener(this::OnBtn7UpClick);
        BtnSchweppes.setOnClickListener(this::OnBtnSchweppesClick);         BtnCafe.setOnClickListener(this::OnBtnCafeClick);
        BtnThe.setOnClickListener(this::OnBtnTheClick);                     BtnChoco.setOnClickListener(this::OnBtnChocoClick);
        BtnOrangina.setOnClickListener(this::OnBtnOranginaClick);           BtnLiptonic.setOnClickListener(this::OnBtnLiptonicClick);
        BtnDespe.setOnClickListener(this::OnBtnDespeClick);                 BtnHeineken.setOnClickListener(this::OnBtnHeinekenClick);
        BtnMaid.setOnClickListener(this::OnBtnMaidClick);                   BtnPerrier.setOnClickListener(this::OnBtnPerrierClick);
        BtnFanta.setOnClickListener(this::OnBtnFantaClick);                 BtnCappu.setOnClickListener(this::OnBtnCappuccinoClick);
        BtnSucette.setOnClickListener(this::OnBtnSucetteClick);             BtnFriandise.setOnClickListener(this::OnBtnFriandiseClick);
        BtnCrepe.setOnClickListener(this::OnBtnCrepeClick);                 BtnViennoiserie.setOnClickListener(this::OnBtnViennoiserieClick);
        BtnChips.setOnClickListener(this::OnBtnChipsClick);                 BtnSandwich.setOnClickListener(this::OnBtnSandwichClick);
        BtnReste.setOnClickListener(this::OnBtnResteClick);                 BtnPanini.setOnClickListener(this::OnBtnPaniniClick);
        BtnCarte.setOnClickListener(this::OnBtnCarteClick);                 BtnCsgn.setOnClickListener(this::OnBtnConsigneClick);
        BtnCsgnR.setOnClickListener(this::OnBtnRetourConsigneClick);        BtnLait.setOnClickListener(this::OnBtnLaitClick);
        Btn1664.setOnClickListener(this::OnBtn1664Click);                   BtnKinder.setOnClickListener(this::OnBtnKinderClick);
    }

    private void OnBtnKinderClick(View view) {
        Kinder=Increment(Kinder);
        float prix = prix15;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtn1664Click(View view) {
        B1664=Increment(B1664);
        float prix = prix2;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnLaitClick(View view) {
        Lait=Increment(Lait);
        float prix = prix05;
        IncrePrix(prix);
        AfficherListeProd();
    }


    private void OnBtnPaniniClick(View view) {
        Panini=Increment(Panini);
        float prix = prix3;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnCarteClick(View view) {
        Carte=Increment(Carte);
        float prix = 20;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnResteClick(View view) {
        PopUpActivity PopUp = new PopUpActivity(activity);
        PopUp.SetTotal(Total);
        PopUp.show();
    }

    private void OnBtnSandwichClick(View view) {
        Sandwich=Increment(Sandwich);
        float prix = prix3;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnChipsClick(View view) {
        Chips=Increment(Chips);
        float prix = MyDB.SelectPrix("chips");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnViennoiserieClick(View view) {
        Viennoiserie=Increment(Viennoiserie);
        float prix = prix15;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnCrepeClick(View view) {
        Crepe=Increment(Crepe);
        float prix = prix25;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnFriandiseClick(View view) {
        Friandise = Increment(Friandise);
        float prix = prix1;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnSucetteClick(View view) {
        Sucette = Increment(Sucette);
        float prix =prix05;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnCappuccinoClick(View view) {
        Cappu=Increment(Cappu);
        float prix = prix2;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnFantaClick(View view) {
        Fanta=Increment(Fanta);
        float prix = MyDB.SelectPrix("fanta");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnPerrierClick(View view) {
        Perrier=Increment(Perrier);
        float prix = MyDB.SelectPrix("perrier");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnMaidClick(View view) {
        Maid=Increment(Maid);
        float prix = MyDB.SelectPrix("maid");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnHeinekenClick(View view) {
        Heineken=Increment(Heineken);
        float prix = MyDB.SelectPrix("heineken");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnDespeClick(View view) {
        Despe=Increment(Despe);
        float prix = MyDB.SelectPrix("despe");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnLiptonicClick(View view) {
        Liptonic=Increment(Liptonic);
        float prix = MyDB.SelectPrix("liptonic");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnOranginaClick(View view) {
        Orangina=Increment(Orangina);
        float prix = MyDB.SelectPrix("orangina");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnChocoClick(View view) {
        Choco=Increment(Choco);
        float prix= prix2;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnTheClick(View view) {
        The=Increment(The);
        float prix= prix15;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnCafeClick(View view) {
        Cafe=Increment(Cafe);
        float prix =prix1;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnRetourConsigneClick(View view) {
        ConsigneR = Increment(ConsigneR);
        float prix = -1;
        IncrePrix(prix);
        AfficherListeProd();
    }
    private void OnBtnConsigneClick(View view) {
        Consigne = Increment(Consigne);
        float prix =prix1;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnSchweppesClick(View view) {
        Schweppes=Increment(Schweppes);
        float prix = MyDB.SelectPrix("schweppes");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtn7UpClick(View view) {
        SevUp=Increment(SevUp);
        float prix = MyDB.SelectPrix("7Up");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnOasisClick(View view) {
        Oasis=Increment(Oasis);
        float prix = MyDB.SelectPrix("oasis");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnCrepeChocoClick(View view) {
        CrepeChoco=Increment(CrepeChoco);
        float prix = prix3;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnEauClick(View view) {
        Eau=Increment(Eau);
        float prix = MyDB.SelectPrix("eau");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnEauGazClick(View view) {
        EauGaz=Increment(EauGaz);
        float prix = MyDB.SelectPrix("eauGaz");
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnPaniniChocoClick(View view) {
        PaniniChoco=Increment(PaniniChoco);
        float prix = prix25;
        IncrePrix(prix);
        AfficherListeProd();
    }

    private void OnBtnIceTeaClick(View view) {
        Icetea=Increment(Icetea);
        float prix = MyDB.SelectPrix("iceTea");
        IncrePrix(prix);
        AfficherListeProd();
    }
    private void OnBtnCocaClick(View v) {
        Coca=Increment(Coca);
        float prix = MyDB.SelectPrix("coca");
        IncrePrix(prix);
        AfficherListeProd();
    }
    private void OnBtnCoca0Click(View v) {
        Coca0=Increment(Coca0);
        float prix = MyDB.SelectPrix("coca0");
        IncrePrix(prix);
        AfficherListeProd();
    }
    private void OnBtnCocaCherryClick(View v) {
        CocaCherry=Increment(CocaCherry);
        float prix = MyDB.SelectPrix("cocaCherry");
        IncrePrix(prix);
        AfficherListeProd();
    }
    private int Increment(int Valeur){
        int Val=Valeur+1;
        return Val;
    }
    private void IncrePrix(float valeur){
        Total= Total + valeur;
        //STotal.setText("Total: \t\t" + String.valueOf(Total));
    }

    private void OnBtnCancelClick(View view) {
        Coca = Coca0 = CocaCherry = Icetea = Eau = EauGaz = Oasis = SevUp = Cafe = The = Choco = Orangina = Kinder= 0;
        Liptonic = Heineken = Despe = Fanta = Cappu = Chips = Sucette = Friandise = Viennoiserie = Consigne = B1664 = 0;
        Sandwich = CrepeChoco = PaniniChoco = Crepe = Maid = Perrier = Schweppes = Panini = Carte = ConsigneR = Lait = 0;
        Total=0.00F;
        Liste.setText("");
    }

    private void OnBtnValideClick(View view) {
        PopUpActivity PopUp = new PopUpActivity(activity, Total);
        PopUp.show();
        if(Coca > 0) {
            int NewCoca = MyDB.SelectQtt("coca") - Coca;
            Boolean res = MyDB.UpdateQtt(NewCoca, "coca");
            res = MyDB.UpdateHistorique(date, "coca", Coca);
        }
        if(Coca0 > 0) {
            int NewCoca0 = MyDB.SelectQtt("coca0") - Coca0;
            Boolean res = MyDB.UpdateQtt(NewCoca0, "coca0");
            res = MyDB.UpdateHistorique(date, "coca0", Coca0);
        }
        if(CocaCherry > 0) {
            int NewCocaCherry = MyDB.SelectQtt("cocaCherry") - CocaCherry;
            Boolean res = MyDB.UpdateQtt(NewCocaCherry, "cocaCherry");
            res = MyDB.UpdateHistorique(date, "cocaCherry", CocaCherry);
        }
        if(Icetea > 0) {
            int NewIcetea = MyDB.SelectQtt("iceTea") - Icetea;
            Boolean res = MyDB.UpdateQtt(NewIcetea, "iceTea");
            res = MyDB.UpdateHistorique(date, "ice tea", Icetea);
        }
        if(Eau > 0) {
            int NewEau = MyDB.SelectQtt("eau") - Eau;
            Boolean res = MyDB.UpdateQtt(NewEau, "eau");
            res = MyDB.UpdateHistorique(date, "eau", Eau);
        }
        if(EauGaz > 0) {
            int NewEauGaz = MyDB.SelectQtt("eauGaz") - EauGaz;
            Boolean res = MyDB.UpdateQtt(NewEauGaz, "eauGaz");
            res = MyDB.UpdateHistorique(date, "Eau gazeuse", EauGaz);
        }
        if(Oasis > 0) {
            int NewOasis = MyDB.SelectQtt("oasis") - Oasis;
            Boolean res = MyDB.UpdateQtt(NewOasis, "oasis");
            res = MyDB.UpdateHistorique(date, "oasis", Oasis);
        }
        if(SevUp > 0) {
            int NewSevUp = MyDB.SelectQtt("7Up") - SevUp;
            Boolean res = MyDB.UpdateQtt(NewSevUp, "7Up");
            res = MyDB.UpdateHistorique(date, "7up", SevUp);
        }
        if(Orangina > 0) {
            int NewOrangina = MyDB.SelectQtt("orangina") - Orangina;
            Boolean res = MyDB.UpdateQtt(NewOrangina, "orangina");
            res = MyDB.UpdateHistorique(date, "orangina", Orangina);
        }
        if(Schweppes > 0){
            int NewSchweppes = MyDB.SelectQtt("schweppes") - Schweppes;
            Boolean res = MyDB.UpdateQtt(NewSchweppes, "schweppes");
            res = MyDB.UpdateHistorique(date, "schweppes", Schweppes);
        }
        if(Liptonic > 0){
            int NewLiptonic = MyDB.SelectQtt("liptonic") - Liptonic;
            Boolean res = MyDB.UpdateQtt(NewLiptonic, "liptonic");
            res = MyDB.UpdateHistorique(date, "liptonic", Liptonic);
        }
        if(Heineken > 0){
            int NewHeineken = MyDB.SelectQtt("heineken") - Heineken;
            Boolean res = MyDB.UpdateQtt(NewHeineken, "heineken");
            res = MyDB.UpdateHistorique(date, "Heineken", Heineken);
        }
        if(Despe > 0){
            int NewDespe = MyDB.SelectQtt("despe") - Despe;
            Boolean res = MyDB.UpdateQtt(NewDespe, "despe");
            res = MyDB.UpdateHistorique(date, "despe", Despe);
        }
        if(Fanta > 0){
            int NewFanta = MyDB.SelectQtt("fanta") - Fanta;
            Boolean res = MyDB.UpdateQtt(NewFanta, "fanta");
            res = MyDB.UpdateHistorique(date, "fanta", Fanta);
        }
        if(Chips > 0){
            int NewChips = MyDB.SelectQtt("chips") - Chips;
            Boolean res = MyDB.UpdateQtt(NewChips, "chips");
            res = MyDB.UpdateHistorique(date, "chips", Chips);
        }
        if(Perrier > 0){
            int NewPerrier = MyDB.SelectQtt("perrier") - Perrier;
            Boolean res = MyDB.UpdateQtt(NewPerrier, "perrier");
            res = MyDB.UpdateHistorique(date, "perrier", Perrier);
        }
        if(Maid > 0){
            int NewMaid = MyDB.SelectQtt("maid") - Maid;
            Boolean res = MyDB.UpdateQtt(NewMaid, "maid");
            res = MyDB.UpdateHistorique(date, "minute maid", Maid);
        }
        /*if(B1664 > 0){
            int New1664 = MyDB.SelectQtt("1664") - B1664;
            Boolean res = MyDB.UpdateQtt(New1664, "1664");
            res = MyDB.UpdateHistorique(date, "1664", B1664);
        }*/
        if(Panini > 0 || PaniniChoco > 0) {
            int Pain = MyDB.SelectQtt("pain") - Panini - PaniniChoco;
            Boolean res = MyDB.UpdateQtt(Pain, "pain");
            res = MyDB.UpdateHistorique(date, "panini salé", Panini);
            res = MyDB.UpdateHistorique(date, "panini choco", PaniniChoco);
        }
        Boolean res = MyDB.UpdateHistorique(date, "crepe sucré", Crepe);
        res = MyDB.UpdateHistorique(date, "crepe choco", CrepeChoco);
        res = MyDB.UpdateHistorique(date, "friandise", Friandise);
        res = MyDB.UpdateHistorique(date, "grande friandise", Kinder);
        res = MyDB.UpdateHistorique(date, "viennoiserie", Viennoiserie);
        res = MyDB.UpdateHistorique(date, "sandwich", Sandwich);
        res = MyDB.UpdateHistorique(date, "sucette", Sucette);
        res = MyDB.UpdateHistorique(date, "carte", Carte);
        res = MyDB.UpdateHistorique(date, "cafe", Cafe);
        res = MyDB.UpdateHistorique(date, "Cappuccino", Cappu);
        res = MyDB.UpdateHistorique(date, "chocolat chaud", Choco);
        res = MyDB.UpdateHistorique(date, "the", The);
        res = MyDB.UpdateHistorique(date, "lait", Lait);
        res = MyDB.UpdateHistorique(date, "1664", B1664);
        res = MyDB.UpdateHistorique(date, "Carte", Carte);
        res = MyDB.UpdateHistorique(date, "consigne", Consigne);
        res = MyDB.UpdateHistorique(date, "consigne", -ConsigneR);

        OnBtnCancelClick(view);
    }

    private void AfficherListeProd(){
        String listeP ="";

        if(Coca > 0){
            listeP +="Coca: \t\t\t\t\t\t\t\t\t" + String.valueOf(Coca) + "\n";
        }
        if(Coca0 > 0){
            listeP +="Coca 0: \t\t\t\t\t\t\t" + String.valueOf(Coca0) + "\n";
        }
        if(CocaCherry > 0){
            listeP +="Coca Cherry: \t\t\t" + String.valueOf(CocaCherry) + "\n";
        }
        if(Fanta > 0){
            listeP +="Fanta: \t\t\t\t\t\t\t\t" + String.valueOf(Fanta) + "\n";
        }
        if(Icetea > 0){
            listeP +="Ice Tea: \t\t\t\t\t\t\t" + String.valueOf(Icetea) + "\n";
        }
        if(Liptonic > 0){
            listeP +="Liptonic: \t\t\t\t\t\t" + String.valueOf(Liptonic) + "\n";
        }
        if(Maid > 0){
            listeP +="Min. Maid: \t\t\t\t\t" + String.valueOf(Maid) + "\n";
        }
        if(Oasis > 0){
            listeP +="Oasis: \t\t\t\t\t\t\t\t" + String.valueOf(Oasis) + "\n";
        }
        if(Orangina > 0){
            listeP +="Orangina: \t\t\t\t\t\t" + String.valueOf(Orangina) + "\n";
        }
        if(Schweppes > 0){
            listeP +="Schweppes: \t\t\t\t" + String.valueOf(Schweppes) + "\n";
        }
        if(SevUp > 0){
            listeP +="7Up: \t\t\t\t\t\t\t\t\t" + String.valueOf(SevUp) + "\n";
        }
        if(Eau > 0){
            listeP +="eau: \t\t\t\t\t\t\t\t\t\t" + String.valueOf(Eau) + "\n";
        }
        if(EauGaz > 0){
            listeP +="Eau Petillante: \t\t" + String.valueOf(EauGaz) + "\n";
        }
        if(Perrier > 0){
            listeP +="Perrier: \t\t\t\t\t\t\t" + String.valueOf(Perrier) + "\n";
        }
        if(Despe > 0){
            listeP +="Despe: \t\t\t\t\t\t\t\t" + String.valueOf(Despe) + "\n";
        }
        if(Heineken > 0){
            listeP +="Hieneken: \t\t\t\t\t" + String.valueOf(Heineken) + "\n";
        }
        if(B1664 > 0){
            listeP += "1664: \t\t\t\t\t\t\t\t\t" + String.valueOf(B1664) + "\n";
        }
        if(Cafe > 0){
            listeP +="Cafe: \t\t\t\t\t\t\t\t\t" + String.valueOf(Cafe) + "\n";
        }
        if(Cappu > 0){
            listeP +="Cappuccino: \t\t\t" + String.valueOf(Cappu) + "\n";
        }
        if(Choco > 0){
            listeP +="Chocolat: \t\t\t\t\t\t" + String.valueOf(Choco) + "\n";
        }
        if(The > 0){
            listeP +="The: \t\t\t\t\t\t\t\t\t\t" + String.valueOf(The) + "\n";
        }
        if(Lait > 0){
            listeP += "Dosette de lait: \t\t\t\t\t" + String.valueOf(Lait) + "\n";
        }
        if(Crepe > 0){
            listeP +="Crepe: \t\t\t\t\t\t\t\t" + String.valueOf(Crepe) + "\n";
        }
        if(CrepeChoco > 0){
            listeP +="Crepe Choco: \t\t\t"+ String.valueOf(CrepeChoco) + "\n";
        }
        if(Friandise > 0){
            listeP +="Friandise: \t\t\t\t\t" + String.valueOf(Friandise) + "\n";
        }
        if(Kinder > 0){
            listeP +="Gr. Friandise: \t\t\t\t" + String.valueOf(Kinder) + "\n";
        }
        if(PaniniChoco > 0){
            listeP +="Panini Choco: \t\t" + String.valueOf(PaniniChoco) + "\n";
        }
        if(Sucette > 0){
            listeP +="Sucette: \t\t\t\t\t\t\t" + String.valueOf(Sucette) + "\n";
        }
        if(Viennoiserie > 0){
            listeP +="Viennoiserie: \t\t\t" + String.valueOf(Viennoiserie) + "\n";
        }
        if(Chips > 0){
            listeP +="Chips: \t\t\t\t\t\t\t\t" + String.valueOf(Chips) + "\n";
        }
        if(Panini > 0){
            listeP +="Panini: \t\t\t\t\t\t\t\t" + String.valueOf(Panini) + "\n";
        }
        if(Sandwich > 0){
            listeP +="Sandwich: \t\t\t\t\t" + String.valueOf(Sandwich) + "\n";
        }
        if(Carte > 0){
            listeP += "Carte: \t\t\t\t\t\t\t\t" + String.valueOf(Carte) + "\n";
        }
        if(Consigne > 0){
            listeP += "Gobelet: \t\t\t\t\t\t\t\t" + String.valueOf(Consigne) + "\n";
        }
        if(ConsigneR > 0){
            listeP += "Gobelet rendu: \t\t\t\t\t\t" + String.valueOf(ConsigneR) + "\n";
        }

        listeP += "\t\t\t\t\t\tTotal: \t\t\t" + String.valueOf(Total);
        Liste.setText(listeP);
    }
}

