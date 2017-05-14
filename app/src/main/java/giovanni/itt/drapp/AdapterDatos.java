package giovanni.itt.drapp;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Gio on 13/05/2017.
 */

public class AdapterDatos extends BaseAdapter {

    protected Activity activity;
    protected ArrayList <Datos> items;

    public AdapterDatos(Activity activity, ArrayList<Datos> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista, null);

        }
        // creamos un objeto de la clase objetos
        Datos datos = items.get(position);
        // rellenamos la fotografia(imagen)
        ImageView foto = (ImageView) v.findViewById(R.id.imageView4);
        foto.setImageDrawable(datos.getFoto());
        //rellenamos nombre
        TextView nombre = (TextView) v.findViewById(R.id.texto);
        nombre.setText(datos.getNombre());
        TextView info = (TextView) v.findViewById(R.id.category);
        info.setText(datos.getInfo());

        return v;
    }
}
