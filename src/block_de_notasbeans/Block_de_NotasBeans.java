/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package block_de_notasbeans;

import java.awt.FontFormatException;
import java.io.IOException;

/**
 *
 * @author Sergio Teacher
 */
public class Block_de_NotasBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FontFormatException, IOException {
        System.out.println("Iniciando ...");
        
        ModeloConfig MiConfiguracion = new ModeloConfig();
        VentanaH MiVistaH = new VentanaH();
        VentanaPrincipalBlock MiVistaPrincipal = new VentanaPrincipalBlock();
        ControlBlock Controlando = new ControlBlock(MiConfiguracion, MiVistaPrincipal, MiVistaH);

        Controlando.InicialControl();
    }
    
}
