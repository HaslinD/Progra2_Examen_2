package haslindavidavila_examen2;

import java.util.ArrayList;

public class Usuarios {
    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList<PlayList> playlist = new ArrayList(); 
    private ArrayList<Canciones> favoritos =  new ArrayList();

    public Usuarios() {
    }
    
    public Usuarios(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<PlayList> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<PlayList> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Canciones> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Canciones> favoritos) {
        this.favoritos = favoritos;
    }

    public void setPlay (PlayList play){
        playlist.add(play);
    }
    
    public void setFavs (Canciones fav){
        favoritos.add(fav);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
