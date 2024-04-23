package com.example.pmdm_2324.ut06.zoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2324.R;

import java.util.ArrayList;

public class ut06AdapterAnimales extends RecyclerView.Adapter<ut06AdapterAnimales.ObjetoConLosControlesGraficos> {

    /*
    * Coge el layout y crea un elemento por cada fila que contenga los controles gráficos "onCreateViewHolder"
    * */
    @NonNull
    @Override
    public ObjetoConLosControlesGraficos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.u6a_zoo_row, parent, false);

        return new ObjetoConLosControlesGraficos(view);
    }

    // ViewHolder -> LLamado en este ejemplo ObjetoConLosControlesGraficos
    public static class ObjetoConLosControlesGraficos extends RecyclerView.ViewHolder {

        TextView nombre;
        TextView tipo;
        TextView color;

        public ObjetoConLosControlesGraficos(@NonNull View vista) {
            super(vista);
            nombre = vista.findViewById(R.id.ut06zoo_nombre);
            color = vista.findViewById(R.id.ut06zoo_color);
            tipo = vista.findViewById(R.id.ut06zoo_tipo);
        }

        public void pinta(Animal animal){
            nombre.setText(animal.getNombre());
            color.setText(animal.getColor());
            tipo.setText(animal.getTipo());
        }
    }

    ArrayList<Animal> datos;

    public ut06AdapterAnimales(){
        //datos = Animal.generarDatos(); // Simula acceso a API o base de datos
        datos = new ArrayList<Animal>();
    }

    public void add(ArrayList<Animal> nuevos) {
        datos.addAll(nuevos);
        notifyDataSetChanged();
    }

    /*
    * Coge un elemento de los datos y lo pinta en el objeto que alberga las vistas.
    * */
    @Override
    public void onBindViewHolder(@NonNull ObjetoConLosControlesGraficos holder, int position) {
        Animal a = datos.get(position);
        holder.pinta(a);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
