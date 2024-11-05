/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package block_de_notasbeans.miControl;

import block_de_notasbeans.misModelos.ModeloConfig;
import block_de_notasbeans.vistas.VentanaH;
import block_de_notasbeans.vistas.VentanaPrincipalBlock;
import java.io.IOException;

/**
 *
 * @author Sergio Teacher
 */
public class Block_de_NotasBeans {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando ...");
        
        ModeloConfig MiConfiguracion = new ModeloConfig();
        VentanaH MiVistaH = new VentanaH();
        VentanaPrincipalBlock MiVistaPrincipal = new VentanaPrincipalBlock();
        ControlBlock Controlando = new ControlBlock(MiConfiguracion, MiVistaPrincipal, MiVistaH);

        Controlando.InicialControl();
    }
    
}
