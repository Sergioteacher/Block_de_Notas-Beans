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
    private Font MifuenteH = null;
    private Font MifuenteOp = null;
    private String fuenteHelpMe = "HelpMe.ttf" ;
    private String fuenteRunic = "runic_sans_plainwebfont.ttf" ;
    private InputStream is;

    public FuenteCustomizada() throws IOException {

        try{
                    is =  getClass().getResourceAsStream(fuenteHelpMe);
                    MifuenteH = Font.createFont(Font.TRUETYPE_FONT, is);
                    System.out.println("Sí se ha cargado mi fuente HelpMe!!!");
        }catch(FontFormatException | IOException ex){
                    //Si existe un error se carga fuente por defecto ARIAL
                    System.err.println(fuenteHelpMe + " No se cargo la fuente HelpMe");
                    MifuenteH = new Font("Arial", Font.PLAIN, 14);
        }finally{
                    is.close();
        }

try{
                    is =  getClass().getResourceAsStream(fuenteRunic);
                    MifuenteOp = Font.createFont(Font.TRUETYPE_FONT, is);
                    System.out.println("Sí se ha cargado mi fuente Runic!!!");
        }catch(FontFormatException | IOException ex){
                    //Si existe un error se carga fuente por defecto ARIAL
                    System.err.println(fuenteHelpMe + " No se cargo la fuente Runic");
                    MifuenteOp = new Font("Arial", Font.PLAIN, 14);
        }finally{
                    is.close();
        }

    }

    public Font getMifuenteH(int estilo, float tamanio) {
        Font tfont = MifuenteH.deriveFont(estilo, tamanio);
        return tfont;
    }
    public Font getMifuenteOp(int estilo, float tamanio) {
        Font tfont = MifuenteOp.deriveFont(estilo, tamanio);
        return tfont;
    }
}
