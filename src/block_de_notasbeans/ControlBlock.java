/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Sergio Teacher
 */
public class ControlBlock implements ActionListener, WindowListener, ComponentListener {

private ModeloConfig MiConfig;
private VentanaPrincipalBlock MiVentanaPrincipal;

    public ControlBlock(ModeloConfig MiConfig, VentanaPrincipalBlock MiVentanaPrincipal) {
        this.MiConfig = MiConfig;
        this.MiVentanaPrincipal = MiVentanaPrincipal;
        System.out.println("Inicialdo Control");

        MiConfig.setTitulo("Título dinámico");
        MiVentanaPrincipal.ponAreaTextoPrincipal(MiConfig.getGalleta());

        //ManejadorClicks MisClicks = new ManejadorClicks();
        //MiVentanaPrincipal.ClickBtnNuevo(this);
        asociarListenersEscuchadores(this);

    }

/**
*   Una forma compacta de agrupar las llamadas.
*   @param listener Recibe los eventos
*/
    public void asociarListenersEscuchadores (ActionListener listener){
        MiVentanaPrincipal.ClickBtnNuevo(this);
        MiVentanaPrincipal.ClickBtnSalir(this);
        MiVentanaPrincipal.ClickMitemNuevo(this);
        MiVentanaPrincipal.ClickMitemSalir(this);
        MiVentanaPrincipal.ClickMitemCopiar(this);
        MiVentanaPrincipal.ClickMitemCortar(this);
        MiVentanaPrincipal.ClickMitemPegar(this);

        MiVentanaPrincipal.addWindowListener(this);
        MiVentanaPrincipal.addComponentListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("  Se ha producido un click");
//          System.out.print("getSource -> ");  
//          System.out.println( e.getActionCommand() );


        switch (e.getActionCommand()){
        case "Nuevo":
            System.out.println("Has elegido Nuevo");
            MiVentanaPrincipal.ponAreaTextoPrincipal("");
        break;
        case "Salir":
            System.out.println("Has elegido Salir");
            MiVentanaPrincipal.SMS("Vas a salir...", "Salir");
            break;
        case "Copiar":
            System.out.println("Has elegido Copiar");
            MiVentanaPrincipal.SMS("Vas a copiar...", "Copiar");
            break;
        case "Cortar":
            System.out.println("Has elegido Cortar");
            MiVentanaPrincipal.SMS("Vas a cortar...", "Cortar");
            break;
        case "Pegar":
            System.out.println("Has elegido Pegar");
            MiVentanaPrincipal.SMS("Vas a pegar...", "Pegar");
            break;
        default :
            System.out.print("Elegido... ");
            System.out.println( e.getActionCommand() );
        break;
        }
    }

@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Activada    (cambio de estado 1)");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal CERRADA");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Terminado la aplicación: ventana pricipal");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Desactivada (cambio de estado 0)");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("De-iconizada la ventana pricipal");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Iconizada la ventana pricipal");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo ventana pricipal");
	}


        @Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
            System.out.println("Se a ocultado algo ...");
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("Me muevo ...");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("Se ha cambiado su tamaño");
            System.out.println( arg0.getComponent().getSize() );
            System.out.println( arg0.getComponent().getSize().getHeight() );
            System.out.println( arg0.getComponent().getSize().getWidth() );
            MiVentanaPrincipal.Estado("Alto: " + arg0.getComponent().getSize().height + "   Ancho: " + arg0.getComponent().getSize().width);
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("Se muestran los componentes ...");
	}	

    public void InicialControl(){
        MiVentanaPrincipal.setTitle( MiConfig.getTitulo());
        MiVentanaPrincipal.setVisible(true);
    }

    
}

/*
class ManejadorClicks implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("  Se ha producido un click");
        System.out.print("getSource -> ");  
        System.out.println( e.getActionCommand() );
}

}
*/
