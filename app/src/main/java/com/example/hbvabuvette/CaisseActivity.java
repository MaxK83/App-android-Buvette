package com.example.hbvabuvette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaisseActivity extends AppCompatActivity {

    //private final Context context = this;
    private CaisseActivity activity;
    private DateActivity DateAct;
    DBManager MyDB2 = new DBManager(this);

    //private DateFormat df= new SimpleDateFormat("dd-MM-yyyy");

    String DateD = DateAct.GetDateD();
    String DateA = DateAct.GetDateA();

    private TextView TVCafe, TVThe, TVChoco, TVSchweppes, TVCappu, TVOrangina, TVMinMaid, TVOasis, TVIceTea, TVFanta;
    private TextView TVSUp, TVDespe, TVLiptonic, TVBierre, TVB1664, TVLait, TVSucette, TVCrepeChoco, TVCrepe;
    private TextView TVPerrier, TVEau, TVCoca0, TVCoca, TVCocaC, TVEauGaz, TVConsigne, TVCarte, TV;
    private TextView TVViennoiserie, TVChips, TVPaniniC, TVPanini, TVSandwhich, TVFriandise, TVGFriandise;


    private Button BtnMaj;

    private int Cafe, The, Choco, Schweppes, Cappu, Orangina, MinMaid, Oasis, IceTea;
    private int SUp, Despe, Liptonic, Bierre, B1664, Lait, Fruit, Coca, CocaC, Coca0;
    private int Eau, EauGaz, Perrier, Fanta, Consigne, Carte, CrepeChoco, Chips, Crepe;
    private int Viennoiserie, PaniniC, Panini, Sandwhich, Friandise, GFriandise, Sucette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity= this;
        setContentView(R.layout.activity_casse_historique);
        Cafe = The = Choco = Schweppes = Cappu = Orangina = MinMaid = Oasis = IceTea = Fanta = 0;
        SUp = Despe = Liptonic = Bierre = B1664 = Lait = Fruit = Sucette = Carte = 0;
        Coca = CocaC = Coca0 = Eau = EauGaz = Perrier = CrepeChoco = Consigne = 0;
        Viennoiserie = Chips = PaniniC = Panini = Sandwhich = Friandise = GFriandise = Crepe = 0;

        TV = findViewById(R.id.textView2);

        Prix();

        //Boisson
        TVCafe = (TextView) findViewById(R.id.QttCafe2);           TVThe = (TextView) findViewById(R.id.QttThe2);
        TVChoco = (TextView) findViewById(R.id.QttChoco2);         TVSchweppes = (TextView) findViewById(R.id.QttSchweppes2);
        TVCappu = (TextView) findViewById(R.id.QttCappu2);         TVOrangina = (TextView) findViewById(R.id.QttOrangina2);
        TVMinMaid = (TextView) findViewById(R.id.QttJus2);         TVIceTea = (TextView) findViewById(R.id.QttIceTea2);
        TVOasis = (TextView) findViewById(R.id.QttOasis2);         TVSUp = (TextView) findViewById(R.id.QttSUp2);
        TVFanta = (TextView) findViewById(R.id.QttFanta2);         TVDespe = (TextView) findViewById(R.id.QttDespe2);
        TVLiptonic = (TextView) findViewById(R.id.QttLiptonic2);   TVB1664 = (TextView) findViewById(R.id.QttB1664_2);
        TVBierre = (TextView) findViewById(R.id.QttBierre2);       TVLait = (TextView) findViewById(R.id.QttLait2);
        TVPerrier = (TextView) findViewById(R.id.QttPerrier2);     TVEau = (TextView) findViewById(R.id.QttEau2);
        TVCoca0 = (TextView) findViewById(R.id.QttCoca02);         TVCoca = (TextView) findViewById(R.id.QttCoca2);
        TVCocaC = (TextView) findViewById(R.id.QttCocaC2);         TVEauGaz = (TextView) findViewById(R.id.QttEauGaz2);

        
        Cafe = MyDB2.SelectHist("cafe", DateD, DateA);                       TVCafe.setText(String.valueOf(Cafe));
        The = MyDB2.SelectHist("the", DateD, DateA);                         TVThe.setText(String.valueOf(The));
        Choco = MyDB2.SelectHist("chocolat chaud", DateD, DateA);            TVChoco.setText(String.valueOf(Choco));
        Cappu = MyDB2.SelectHist("Cappuccino", DateD, DateA);                TVCappu.setText(String.valueOf(Cappu));
        MinMaid = MyDB2.SelectHist("minute maid", DateD, DateA);             TVMinMaid.setText(String.valueOf(MinMaid));
        Oasis = MyDB2.SelectHist("oasis", DateD, DateA);                     TVOasis.setText(String.valueOf(Oasis));
        Liptonic = MyDB2.SelectHist("liptonic", DateD, DateA);               TVLiptonic.setText(String.valueOf(Liptonic));
        Orangina = MyDB2.SelectHist("orangina", DateD, DateA);               TVOrangina.setText(String.valueOf(Orangina));
        IceTea = MyDB2.SelectHist("ice tea", DateD, DateA);                  TVIceTea.setText(String.valueOf(IceTea));
        Schweppes = MyDB2.SelectHist("schweppes", DateD, DateA);             TVSchweppes.setText(String.valueOf(Schweppes));
        SUp = MyDB2.SelectHist("7up", DateD, DateA);                         TVSUp.setText(String.valueOf(SUp));
        Bierre = MyDB2.SelectHist("Heineken", DateD, DateA);                 TVBierre.setText(String.valueOf(Bierre));
        Despe = MyDB2.SelectHist("despe", DateD, DateA);                     TVDespe.setText(String.valueOf(Despe));
        B1664 = MyDB2.SelectHist("1664", DateD, DateA);                      TVB1664.setText(String.valueOf(B1664));
        Fanta = MyDB2.SelectHist("fanta", DateD, DateA);                     TVFanta.setText(String.valueOf(Fanta));
        Lait = MyDB2.SelectHist("lait", DateD, DateA);                       TVLait.setText(String.valueOf(Lait));
        Coca = MyDB2.SelectHist("coca", DateD, DateA);                       TVCoca.setText(String.valueOf(Coca));
        CocaC = MyDB2.SelectHist("cocaCherry", DateD, DateA);                TVCocaC.setText(String.valueOf(CocaC));
        Coca0 = MyDB2.SelectHist("coca0", DateD, DateA);                     TVCoca0.setText(String.valueOf(Coca0));
        Eau = MyDB2.SelectHist("eau", DateD, DateA);                         TVEau.setText(String.valueOf(Eau));
        EauGaz = MyDB2.SelectHist("Eau gazeuse", DateD, DateA);              TVEauGaz.setText(String.valueOf(EauGaz));
        Perrier = MyDB2.SelectHist("perrier", DateD, DateA);                 TVPerrier.setText(String.valueOf(Perrier));


        //Nouriture
        TVViennoiserie = (TextView) findViewById(R.id.QttViennoiserie2);     TVFriandise = (TextView) findViewById(R.id.QttFriandise2);
        TVChips = (TextView) findViewById(R.id.QttChips2);                   TVGFriandise = (TextView) findViewById(R.id.QttGFriandise2);
        TVPaniniC = (TextView) findViewById(R.id.QttPaniniC2);               TVSucette = (TextView) findViewById(R.id.QttSucette2);
        TVPanini = (TextView) findViewById(R.id.QttPanini2);                 TVCrepeChoco = (TextView) findViewById(R.id.QttCrepeC2);
        TVSandwhich = (TextView) findViewById(R.id.QttSandwhich2);           TVCrepe = (TextView) findViewById(R.id.QttCrepe2);


        Viennoiserie = MyDB2.SelectHist("viennoiserie", DateD, DateA);       TVViennoiserie.setText(String.valueOf(Viennoiserie));
        Chips = MyDB2.SelectHist("chips", DateD, DateA);                     TVChips.setText(String.valueOf(Chips));
        PaniniC = MyDB2.SelectHist("panini choco", DateD, DateA);            TVPaniniC.setText(String.valueOf(PaniniC));
        Panini = MyDB2.SelectHist("panini salé", DateD, DateA);              TVPanini.setText(String.valueOf(Panini));
        Sandwhich = MyDB2.SelectHist("sandwich", DateD, DateA);              TVSandwhich.setText(String.valueOf(Sandwhich));
        Friandise = MyDB2.SelectHist("friandise", DateD, DateA);             TVFriandise.setText(String.valueOf(Friandise));
        GFriandise = MyDB2.SelectHist("grande friandise", DateD, DateA);     TVGFriandise.setText(String.valueOf(GFriandise));
        Sucette = MyDB2.SelectHist("sucette", DateD, DateA);                 TVSucette.setText(String.valueOf(Sucette));
        Crepe = MyDB2.SelectHist("crepe sucré", DateD, DateA);               TVCrepe.setText(String.valueOf(Crepe));
        CrepeChoco = MyDB2.SelectHist("crepe choco", DateD, DateA);          TVCrepeChoco.setText(String.valueOf(CrepeChoco));

        //Autre
        TVConsigne = (TextView) findViewById(R.id.QttConsigne2);                 TVCarte = (TextView) findViewById(R.id.QttCarte2);
        Consigne = MyDB2.SelectHist("consigne", DateD, DateA);               TVConsigne.setText(String.valueOf(Consigne));
        Carte = MyDB2.SelectHist("Carte", DateD, DateA);                     TVCarte.setText(String.valueOf(Carte));
    }


    private void Prix() {
        float TTCaisse = MyDB2.SelectCaisse2(DateD, DateA);
        TV.setText("Prix total:"+ TTCaisse + "€");
    }
}
