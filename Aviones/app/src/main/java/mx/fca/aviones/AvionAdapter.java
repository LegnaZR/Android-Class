package mx.fca.aviones;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AvionAdapter extends RecyclerView.Adapter<AvionAdapter.CeldaViewHolder> {

    private Avion[][] planoMatriz;
    private int rows, cols;

    public AvionAdapter(Avion[][] planoMatriz, int rows, int cols) {
        this.planoMatriz = planoMatriz;
        this.rows = rows;
        this.cols = cols;
    }

    @NonNull
    @Override
    public CeldaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_avion, parent, false);
        return new CeldaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CeldaViewHolder holder, int position) {
        int row = position / cols;
        int col = position % cols;
        Avion avion = planoMatriz[row][col];

        if (avion != null) {
            holder.imageView.setImageResource(R.drawable.ic_avion);
        } else {
            holder.imageView.setImageResource(android.R.color.transparent);
        }
    }

    @Override
    public int getItemCount() {
        return rows * cols;
    }

    public void updatePlano(Avion[][] nuevoPlano, int newRows, int newCols) {
        this.planoMatriz = nuevoPlano;
        this.rows = newRows;
        this.cols = newCols;
        notifyDataSetChanged();
    }

    static class CeldaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        CeldaViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
