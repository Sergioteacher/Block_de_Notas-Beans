/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans.misModelos.fuentes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Una clase que se encarga de gestionar las fuentes personalizadas
 * @author Sergio Teacher
 */
public class FuenteCustomizada {
    private Font Mifuente = null;
    private String fuenteNombre = "HelpMe.ttf" ;
    private InputStream is;

    public FuenteCustomizada() throws IOException {

        try{
                    is =  getClass().getResourceAsStream(fuenteNombre);
                    Mifuente = Font.createFont(Font.TRUETYPE_FONT, is);
                    System.out.println("Sí se ha cargado mi fuente!!!");
        }catch(FontFormatException | IOException ex){
                    //Si existe un error se carga fuente por defecto ARIAL
                    System.err.println(fuenteNombre + " No se cargo la fuente");
                    Mifuente = new Font("Arial", Font.PLAIN, 14);
        }finally{
                    is.close();
        }

    }

    public Font getMifuente(int estilo, float tamanio) {
        Font tfont = Mifuente.deriveFont(estilo, tamanio);
        return tfont;
    }

}
