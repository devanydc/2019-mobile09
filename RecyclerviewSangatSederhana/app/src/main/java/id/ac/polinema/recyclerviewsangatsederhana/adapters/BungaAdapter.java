package id.ac.polinema.recyclerviewsangatsederhana.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.w3c.dom.Text;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;

public class BungaAdapter {
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
        holder.namaBunga.setText(bunga.getBunga());
        holder.detail.setText(bunga.getNambahBuah());
        holder.gambar.setImageResource(bunga.getBuah());
    }
    @Override
    public int getItemCount(){
        return
    }

}
