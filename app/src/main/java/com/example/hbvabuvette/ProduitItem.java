package com.example.hbvabuvette;

public class ProduitItem {

    private String name;
    private int qtt;

    public ProduitItem(String name, int qtt){
        this.name = name;
        this.qtt = qtt;
    }

    public String GetName(){ return name;}

    public int GetQtt(){ return qtt;}

}
