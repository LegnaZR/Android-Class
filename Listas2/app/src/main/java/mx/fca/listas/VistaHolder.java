package mx.fca.listas;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolder extends RecyclerView.ViewHolder {

    TextView txvNombre;
    TextView txvTelefono;

    ImageView imgFotografia;
    public VistaHolder( @NonNull View itemView ) {
        super(itemView);
        txvNombre = itemView.findViewById(R.id.nombre);
        txvTelefono = itemView.findViewById(R.id.telefono);
        imgFotografia = itemView.findViewById(R.id.fotografia);
    }
}
