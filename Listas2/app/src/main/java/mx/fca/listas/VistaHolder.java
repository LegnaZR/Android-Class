package mx.fca.listas;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolder extends RecyclerView.ViewHolder {

    TextView txvNombre;
    TextView txvTelefono;

    ImageView imgFotografia;
    Contacto contacto;
    public VistaHolder( @NonNull View itemView, Contacto contacto) {
        super(itemView);
        this.contacto = contacto;
        txvNombre = itemView.findViewById(R.id.nombre);
        txvTelefono = itemView.findViewById(R.id.telefono);
        imgFotografia = itemView.findViewById(R.id.fotografia);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = new Intent(v.getContext(), DetalleActivity.class);
                i.putExtra("Contacto_ID", contacto.id);
            }
        });
    }
}
