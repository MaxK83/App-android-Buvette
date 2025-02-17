package com.example.hbvabuvette;

import android.os.Parcel;
import android.os.Parcelable;

public class StockList implements Parcelable {

    private static int id, quantite;
    private String produit;
    private float prix;

    public StockList(Parcel in){
        id = in.readInt();
        produit = in.readString();
        quantite = in.readInt();
        prix = in.readFloat();
    }

    public StockList(){

    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }*/

    public static final Creator<StockList> CREATOR = new Creator<StockList>() {
        @Override
        public StockList createFromParcel(Parcel in) {
            return new StockList(in);
        }

        @Override
        public StockList[] newArray(int size) {
            return new StockList[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(quantite);
        parcel.writeString(produit);
        parcel.writeFloat(prix);
    }
}
