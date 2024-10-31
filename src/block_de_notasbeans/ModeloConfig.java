/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Sergio Teacher
 */
public class ModeloConfig {
    private String Titulo;
    private int optionArranque;
    private BufferedInputStream myStream;
    private Font fuente;

    public ModeloConfig() throws FontFormatException {
        try{
            myStream = new BufferedInputStream(new FileInputStream("src/media/HelpMe.ttf"));
            fuente = Font.createFont(Font.TRUETYPE_FONT, myStream);
            fuente = fuente.deriveFont(Font.PLAIN, 26);
        } catch (IOException ex) {
            System.out.println("fallo: " + ex.getMessage());
        }

    }

    @Override
    protected void finalize() throws IOException{
    myStream.close();
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }




    public int getOptionArranque() {
        return optionArranque;
    }

    public void setOptionArranque(int optionArranque) {
        this.optionArranque = optionArranque;
    }

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
