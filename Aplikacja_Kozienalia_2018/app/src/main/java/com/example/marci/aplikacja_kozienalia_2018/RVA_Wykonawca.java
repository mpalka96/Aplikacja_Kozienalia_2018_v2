package com.example.marci.aplikacja_kozienalia_2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Date;
import java.util.List;

/**
 * Created by marci on 06.04.2018.
 */

public class RVA_Wykonawca extends RecyclerView.Adapter<RVA_Wykonawca.MyViewHolder> {

    Context mContext;
    List<Wykonawca> mData;


    public RVA_Wykonawca(Context mContext, List<Wykonawca> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.wykonawcy_item, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tv_nazwa.setText(mData.get(position).getNazwa());
        holder.img_wykonawca.setImageResource(mData.get(position).getPhoto());


        holder.item_wykonawca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Test Click"+String.valueOf(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, wykonawca_opis.class);
                intent.putExtra("Obrazek", mData.get(position).getPhoto());
                intent.putExtra("Nazwa", mData.get(position).getNazwa());
                intent.putExtra("Obrazek Opis", mData.get(position).getPhoto_opis());
                intent.putExtra("Data", mData.get(position).getData());
                intent.putExtra("Link", mData.get(position).getLink());
                intent.putExtra("Opis", mData.get(position).getOpis());

                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_nazwa;
        private ImageView img_wykonawca;
        private RelativeLayout item_wykonawca;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_nazwa = (TextView) itemView.findViewById(R.id.image_name_wykon);
            img_wykonawca = (ImageView) itemView.findViewById(R.id.image_wykonawcy);
            item_wykonawca = (RelativeLayout) itemView.findViewById(R.id.wykonawca_item);
        }
    }
}
