package com.niyagrace.narikmateri;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.niyagrace.narikmateri.response.DataItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterMateri extends RecyclerView.Adapter<AdapterMateri.MyViewHolder> {

    Context context;
    List<DataItem> materi;
    public AdapterMateri(Context context, List<DataItem> data_materi) {
        // Inisialisasi
        this.context = context;
        this.materi = data_materi;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Layout inflater
        View view = LayoutInflater.from(context).inflate(R.layout.materi_item, parent, false);

        // Hubungkan dengan MyViewHolder
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // Set widget
        holder.tvJudul.setText(materi.get(position).getJudulMateri());
        // Dapatkan url gambar
        final String urlGambarMateri = "http://192.168.1.4/materi-rest-server/images/" + materi.get(position).getGambar();
        // Set image ke widget dengna menggunakan Library Piccasso
        // krena imagenya dari internet
        Picasso.with(context).load(urlGambarMateri).into(holder.ivGambarMateri);

        // Event klik ketika item list nya di klik
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mulai activity Detail
                Intent varIntent = new Intent(context, DetailActivity.class);
                // sisipkan data ke intent
                varIntent.putExtra("JDL_BERITA", materi.get(position).getJudulMateri());
                varIntent.putExtra("FTO_BERITA", urlGambarMateri);

                // method startActivity cma bisa di pake di activity/fragment
                // jadi harus masuk ke context dulu
                context.startActivity(varIntent);
            }
        });
    }
    // Menentukan Jumlah item yang tampil
    @Override
    public int getItemCount() {
        return materi.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // Deklarasi widget
        ImageView ivGambarMateri;
        TextView tvJudul, tvTglTerbit, tvPenulis;
        public MyViewHolder(View itemView) {
            super(itemView);
            // inisialisasi widget
            ivGambarMateri = (ImageView) itemView.findViewById(R.id.ivPosterMateri);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulMateri);
        }
    }
}
