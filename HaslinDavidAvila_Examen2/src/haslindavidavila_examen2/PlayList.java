package haslindavidavila_examen2;

import java.util.ArrayList;

public class PlayList {
    private String nombre;
    private ArrayList<Canciones> canciones = new ArrayList();

    public PlayList() {
    }
    
    public PlayList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
    
    public void setCancion (Canciones ca){
        canciones.add(ca);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
