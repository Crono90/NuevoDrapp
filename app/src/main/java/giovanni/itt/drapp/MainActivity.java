package giovanni.itt.drapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int[] LogoId = new int[]{1,2,3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listView);
        ArrayList<Datos> arraydatos = new ArrayList<Datos>();
        Datos datos;

        datos = new Datos(getResources().getDrawable(R.drawable.microorganisms_50), "Foto numero 1", "Imagen de tipo png",1);
        arraydatos.add(datos);

        datos = new Datos(getResources().getDrawable(R.drawable.microorganisms_50), "Foto numero 2", "Imagen de tipo png",2);
        arraydatos.add(datos);


        // creamos el adapter personalizado

        AdapterDatos adapter = new AdapterDatos(this, arraydatos);

        //Lo aplico
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int posicion = position;
                String itemValue = (String) lista.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("logo",LogoId[position]);
                startActivity(intent);
            }
        });

    }

}
