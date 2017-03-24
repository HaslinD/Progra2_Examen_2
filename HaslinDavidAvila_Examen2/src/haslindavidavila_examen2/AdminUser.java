package haslindavidavila_examen2;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class AdminUser {
    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;

    public AdminUser() {
    }

    public AdminUser(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaPersonas() {
        return listaUsuarios;
    }

    public void setListaPersonas(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaUsuarios + "";
    }

    public void setUsuarios(Usuarios p) {
        this.listaUsuarios.add(p);
    }

    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : listaUsuarios) {
                bw.writeObject(listaUsuarios);
                bw.flush();
            }
            bw.flush();
        } catch (Exception ex) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void cargarArchivoBinario(){
        try {
            listaUsuarios = new ArrayList();
            
            Usuarios temp;
            if (archivo.exists()){
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Usuarios) objeto.readObject())!=null){
                        listaUsuarios = (ArrayList<Usuarios>)objeto.readObject();
                    }
                } catch (EOFException e) {
       
                }
                objeto.close();
                entrada.close();       
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
}
