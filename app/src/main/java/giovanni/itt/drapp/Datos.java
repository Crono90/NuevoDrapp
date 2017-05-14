package giovanni.itt.drapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Gio on 13/05/2017.
 */

public class Datos {
    //Declaramos los siguientes atributos
    protected Drawable foto;
    protected String nombre;
    protected String info;
    protected int id;


    public Datos(Drawable foto, String nombre, String info, int id) {
        // A los atributos les asignamos los parametros correspondientes
        this.foto = foto;
        this.nombre = nombre;
        this.info = info;
        this.id = id;
    }

    //Metodo Get

    public Drawable getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public long getId() {
        return id;
    }


}
