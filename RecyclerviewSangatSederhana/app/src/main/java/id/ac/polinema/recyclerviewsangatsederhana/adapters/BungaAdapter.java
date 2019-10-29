package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.bunga;

public class BungaAdapter extends RecyclerView.Adapter<BungaAdapter.MyView>{
    List<bunga> bungaList;

    public BungaAdapter(List<bunga> bungaList){
        this.bungaList = bungaList;
    }

    @NonNull
    @Override
    public BungaAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View bungaView = layoutInflater.inflate(R.layout.item_bunga,parent,false);
        MyView viewHolder = new MyView(bungaView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BungaAdapter.MyView holder, int position){
        bunga bunga=bungaList.get(position);
        holder.nama.setText(bunga.getNamaBunga());
        holder.detail.setText(bunga.getDetailBunga());
        holder.gambar.setImageResource(bunga.getBunga());
    }
    @Override
    public int getItemCount(){
        return (bungaList != null ? bungaList.size() : 0);
    }

    public class MyView extends RecyclerView.ViewHolder{
        public TextView nama;
        public TextView detail;
        public ImageView gambar;
        public MyView(@NonNull View itemView) {
            super(itemView);
            nama =itemView.findViewById(R.id.namaBunga);
            detail=itemView.findViewById(R.id.detailBunga);
            gambar=itemView.findViewById(R.id.gambarBunga);
        }
    }

}
