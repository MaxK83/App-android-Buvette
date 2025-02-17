package com.example.hbvabuvette;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper {

    private static final String DMName ="HBVA.db";

    public static final String TABLE_NAME = "StockHBVA";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "PRODUIT";
    public static final String COL_3 = "QUANTITE";
    public static final String COL_4 = "PRIX";

    public static final String TABLE2_NAME = "CaisseHBVA";
    public static final String COL2_1 = "ID";
    public static final String COL2_2 = "Date";
    public static final String COL2_3 = "SOMME";

    public static final String TABLE3_NAME = "HistoriqueHBVA";
    public static final String COL3_1 = "ID";
    public static final String COL3_2 = "Date";
    public static final String COL3_3 = "PRODUIT";
    public static final String COL3_4 = "QUANTITE";

    private static final int DBVers = 14;
    //private final SQLiteDatabase db = this.getWritableDatabase();
    public static final String ReqQtt = "select "+ COL_3 + " from "+ TABLE_NAME +" WHERE "+ COL_2 +"= ?";
    public static final String ReqPrix = "select "+ COL_4 + " from "+ TABLE_NAME +" WHERE "+ COL_2 +"= ?";
    //public static final String ReqCaisse = "select "+ COL2_3 + " from "+ TABLE2_NAME +" WHERE "+ COL2_2 +"= ?";
    public static final String ReqCaisse2 = "select "+ COL2_3 + " from "+ TABLE2_NAME +" WHERE "+ COL2_2 +" BETWEEN ? AND ?";
    public static final String ReqHist = "select "+COL3_4 +" from "+TABLE3_NAME +" where "+ COL3_3 +" = ? AND " + COL3_2 +" BETWEEN ? AND ?" ;
    public static final String ReqUpHist = "select "+ COL3_4+ " from " + TABLE3_NAME +" where "+ COL3_2 +" = ? and " + COL3_3 +" = ? ";


    public static final String ResetPrix = "replace " + COL2_3 +" and " + COL2_3 +", 0 AS " + TABLE2_NAME + " Where " + COL3_2 +" BETWEEN 01-01-2024 AND 14-01-2024";
    public static final String ResetQtt = "replace " + COL3_4 +" and " + COL3_4 +", 0 AS " + TABLE3_NAME + " Where " + COL3_2 +" BETWEEN 01-01-2024 AND 14-01-2024";

    public DBManager(Context context) { super(context, DMName, null, DBVers ); }

        @Override
    public void onCreate(SQLiteDatabase db) {
            String StrSQL;
        // creation premiere table
        StrSQL = " Create table "+TABLE_NAME+" ("
                +"ID integer primary key autoincrement, "+ COL_2 +" text not null, "+ COL_3 +" integer not null, "+ COL_4 +" numeric not null)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +") values ('coca', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('coca0', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('cocaCherry', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('iceTea', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('eau', 0, 1.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('eauGaz', 0, 1.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('oasis', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('7Up', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('liptonic', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('schweppes', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('orangina', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('heineken', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('despe', 0, 2.50)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('maid', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('perrier', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('fanta', 0, 2.00)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('chips', 0, 0.50)";
        db.execSQL(StrSQL);
        StrSQL= "insert into StockHBVA ("+ COL_2 +", "+ COL_3 +", "+ COL_4 +")  values ('pain', 0, 0.00)";
        db.execSQL(StrSQL);

        //creation deuxieme table
        StrSQL = " Create table "+TABLE2_NAME+" ("
                +"ID integer primary key autoincrement, "+ COL2_2 +" text not null, "+ COL2_3 +" text not null)";
        db.execSQL(StrSQL);

        //creation troisieme table
            StrSQL = " Create table "+TABLE3_NAME+" ("
                    +"ID integer primary key autoincrement, "+ COL3_2 +" text, "+ COL3_3 +" text,"+ COL3_4+" int)";
            db.execSQL(StrSQL);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
       db.execSQL("DROP TABLE IF EXISTS " +TABLE2_NAME);
       db.execSQL("DROP TABLE IF EXISTS " +TABLE3_NAME);
       onCreate(db);
    }

    public boolean UpdateQtt(int qtt, String Nom){

        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_3,qtt);

        this.getWritableDatabase().update(TABLE_NAME, contentValues, COL_2 + " = ?", new String[] { Nom });
        close();
        return true;
    }

    public int SelectQtt(String Nom){
       int Qtt = 0;
       Cursor resQ = this.getWritableDatabase().rawQuery(ReqQtt,new String[] {Nom});
       if(resQ.moveToFirst()) {
           while (!resQ.isAfterLast()) {
               Qtt = resQ.getInt(resQ.getColumnIndex(COL_3));
               resQ.moveToNext();
           }
           close();
           resQ.close();
       }
        return Qtt;
   }

   public float SelectPrix(String Nom){
       float val = 0;
       Cursor resP = this.getWritableDatabase().rawQuery(ReqPrix,new String[] {Nom});
       if(resP.moveToFirst()){
           while(!resP.isAfterLast()) {
               val = resP.getFloat(resP.getColumnIndex(COL_4));
               resP.moveToNext();
           }
           close();
           resP.close();
       }
       return val;
   }


    public float SelectCaisse2(String dateC, String date){
        float val = 0;
        Cursor resC = this.getWritableDatabase().rawQuery(ReqCaisse2,new String[] {dateC, date});
        if(resC.moveToFirst()){
            while(!resC.isAfterLast()) {
                val = val + resC.getFloat(resC.getColumnIndex(COL2_3));
                resC.moveToNext();
            }
            close();
            resC.close();
        }
        return val;
    }

   public boolean UpdateVente(String date, float somme){
       /*String ReqVente = "insert into "+ TABLE2_NAME +" ("+ COL2_2 +", "+ COL2_3 +") values ("+ date +","+ somme +")";
       this.getWritableDatabase().execSQL(ReqVente);
       close();
       return true;*/

       ContentValues contentValues = new ContentValues();
       contentValues.put(COL2_2,date);
       contentValues.put(COL2_3,somme);

       this.getWritableDatabase().insert(TABLE2_NAME, null, contentValues);
       close();
       return true;
   }

    public boolean UpdateHistorique(String date, String prod, int somme){

        Cursor resUH = this.getWritableDatabase().rawQuery(ReqUpHist,new String[] {date, prod});
        ContentValues contentValues = new ContentValues();
        if(resUH != null){
            contentValues.put(COL3_2,date);
            contentValues.put(COL3_3,prod);
            contentValues.put(COL3_4,somme);

            this.getWritableDatabase().insert(TABLE3_NAME, null, contentValues);
        }
        else{
            int Somme = resUH.getInt(resUH.getColumnIndex(COL3_4)) + somme;
            contentValues.put(COL3_4,Somme);

            this.getWritableDatabase().update(TABLE3_NAME, contentValues, COL3_2 +" = ? and "+ COL3_3 +" = ?",new String[] {date, prod});
        }
        close();
        resUH.close();
        return true;
    }

    public int SelectHist(String Nom, String dateC, String date){
        int val = 0;
        Cursor resP = this.getWritableDatabase().rawQuery(ReqHist,new String[] {Nom, dateC, date});
        if(resP.moveToFirst()){
            while(!resP.isAfterLast()) {
                val = val + resP.getInt(resP.getColumnIndex(COL3_4));
                resP.moveToNext();
            }
            close();
            resP.close();
        }
        return val;
    }

    public void Reset(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " +TABLE2_NAME);
        db.execSQL("DROP TABLE IF EXISTS " +TABLE3_NAME);


        //creation deuxieme table
        String StrSQL = " Create table "+TABLE2_NAME+" ("
                +"ID integer primary key autoincrement, "+ COL2_2 +" text not null, "+ COL2_3 +" text not null)";
        db.execSQL(StrSQL);

        //creation troisieme table
        StrSQL = " Create table "+TABLE3_NAME+" ("
                +"ID integer primary key autoincrement, "+ COL3_2 +" text, "+ COL3_3 +" text,"+ COL3_4+" int)";
        db.execSQL(StrSQL);

    }


}
