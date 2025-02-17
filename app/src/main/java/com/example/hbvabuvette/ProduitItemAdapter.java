package com.example.hbvabuvette;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ProduitItemAdapter extends BaseAdapter{

    private Context context;
    private List<ProduitItem> produitItemList;
    private LayoutInflater inflater;

    public ProduitItemAdapter(Context context, List<ProduitItem> produitItemList){
        this.context = context;
        this.produitItemList = produitItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return produitItemList.size();
    }

    @Override
    public ProduitItem getItem(int position) {
        return produitItemList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_item, null);
        ProduitItem currentItem = getItem(i);
        String name = currentItem.GetName();
        int qtt = currentItem.GetQtt();

        TextView itemName = view.findViewById(R.id.ItemName);
        itemName.setText(name);

        TextView itemQtt = view.findViewById(R.id.ItemQtt);
        itemQtt.setText(qtt + "€");

        return view;
    }
}
