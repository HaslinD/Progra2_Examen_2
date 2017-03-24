package haslindavidavila_examen2;

import java.util.ArrayList;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Canciones> cancion = new ArrayList();

    public Album() {
    }
    
    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Canciones> cancion) {
        this.cancion = cancion;
    }
    
    public void setSong(Canciones can){
        cancion.add(can);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
