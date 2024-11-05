/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans.misModelos;

import block_de_notasbeans.misModelos.fuentes.FuenteCustomizada;
import java.awt.Font;
import java.io.IOException;

/**
 * Una clase puente entre los datos que usaremos.
 * @author Sergio Teacher
 */
public class ModeloConfig {
    private String Titulo;
    private int optionArranque;

    private FuenteCustomizada fcuston;
    private Font MiaFuenteH=null;
    private Font MiaFuenteOp=null;


    private final String galleta ="En un lugar de la Mancha, "
 + "\nde cuyo nombre no quiero acordarme, "
 + "\nno ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, "
 + "\nadarga antigua, rocín flaco y galgo corredor. "
 + "\nUna olla de algo más vaca que carnero, salpicón las más noches, "
 + "\nduelos y quebrantos los sábados, lantejas los viernes, "
 + "\nalgún palomino de añadidura los domingos, consumían las tres partes "
 + "\nde su hacienda. ";


/**
*Inicializando mi fuente customizada.
*/
    public ModeloConfig() {
        System.out.println("Iniciando Mi Modelo ...");

        try{
            fcuston = new FuenteCustomizada();
            System.out.println("Creado objeto FuenteCustomizada");
        }catch(IOException e){
            System.out.println("--> e: " + e.getMessage());
            System.out.println("NO se ha creado un objeto FuenteCustomizada");
        }

        System.out.println("directorio de ejecución-> "+ System.getProperty("user.dir"));
        MiaFuenteH = fcuston.getMifuenteH(Font.PLAIN, 18);
        MiaFuenteOp = fcuston.getMifuenteOp(Font.PLAIN, 16);
    }

    public Font getMiaFuenteH() {
        return MiaFuenteH;
    }

    public Font getMiaFuenteOp() {
        return MiaFuenteOp;
    }




    public int getOptionArranque() {
        return optionArranque;
    }

    public void setOptionArranque(int optionArranque) {
        this.optionArranque = optionArranque;
    }

    
 
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
