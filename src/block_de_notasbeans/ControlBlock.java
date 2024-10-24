/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans;

/**
 *
 * @author Sergio Teacher
 */
public class ControlBlock {

private ModeloConfig MiConfig;
private VentanaPrincipalBlock MiVentanaPrincipal;

    public ControlBlock(ModeloConfig MiConfig, VentanaPrincipalBlock MiVentanaPrincipal) {
        this.MiConfig = MiConfig;
        this.MiVentanaPrincipal = MiVentanaPrincipal;

MiConfig.setTitulo("Título dinámico");
    }

    public void InicialControl(){
        MiVentanaPrincipal.setTitle( MiConfig.getTitulo());
        MiVentanaPrincipal.setVisible(true);
    }

    
}
