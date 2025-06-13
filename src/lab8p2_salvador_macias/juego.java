/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class juego {

    private String Nombre;
    private String Precio;
    private String Developer;
    private String Genero;

    public juego(String Nombre, String Precio, String Developer, String Genero) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Developer = Developer;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "nombre del juego: " + Nombre
                + "\nprecio del juego: " + Precio
                + "\ndesarrollador del juego: " + Developer
                + "\ngenero del juego: " + Genero;
    }

}
