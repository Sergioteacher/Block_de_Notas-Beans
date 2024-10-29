/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans;

/**
 *
 * @author Sergio Teacher
 */
public class ModeloConfig {
    private String Titulo;

    private String galleta ="En un lugar de la Mancha, "
 + "\nde cuyo nombre no quiero acordarme, "
 + "\nno ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, "
 + "\nadarga antigua, rocín flaco y galgo corredor. "
 + "\nUna olla de algo más vaca que carnero, salpicón las más noches, "
 + "\nduelos y quebrantos los sábados, lantejas los viernes, "
 + "\nalgún palomino de añadidura los domingos, consumían las tres partes "
 + "\nde su hacienda. ";
 
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGalleta() {
        return galleta;
    }

}
