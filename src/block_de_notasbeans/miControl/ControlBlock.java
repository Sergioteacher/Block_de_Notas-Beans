/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans.miControl;

import block_de_notasbeans.vistas.VentanaH;
import block_de_notasbeans.vistas.VentanaPrincipalBlock;
import block_de_notasbeans.misModelos.ModeloConfig;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Teacher
 */
public class ControlBlock implements ActionListener, WindowListener, ComponentListener {

private ModeloConfig MiConfig;
private Font MifuenteH;
private Font MifuenteOp;
private VentanaPrincipalBlock MiVentanaPrincipal;
private VentanaH MiVistaHalloween;
int optionT=0;
String[] optionesHalloween={"Clásico", "  👻 "};

    public ControlBlock(ModeloConfig MiConfig, VentanaPrincipalBlock MiVentanaPrincipal, VentanaH MiVistaHalloween) {
        this.MiConfig = MiConfig;
        MifuenteH = MiConfig.getMiaFuenteH();
        MifuenteOp = MiConfig.getMiaFuenteOp();
        this.MiVentanaPrincipal = MiVentanaPrincipal;
        this.MiVistaHalloween = MiVistaHalloween;
        System.out.println("Inicialdo el Control del Block de Notas");

//optionT = JOptionPane.showOptionDialog(MiVentanaPrincipal, this, title, optionT, optionT, icon, optionesHalloween, optionT);
        optionT = JOptionPane.showOptionDialog(null, "BlockBeans", "Selecione opción de arranque", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionesHalloween, "Clásico");
        MiConfig.setOptionArranque(optionT);
        System.out.println("Salida optionT: " + optionT);

        if (optionT == -1){
        System.exit(0);
        }

        MiConfig.setTitulo("Título dinámico");
        MiVentanaPrincipal.ponAreaTextoPrincipal(MiConfig.getGalleta());
        MiVistaHalloween.ponAreaTextoPrincipal(MiConfig.getGalleta());

        //ManejadorClicks MisClicks = new ManejadorClicks();
        //MiVentanaPrincipal.ClickBtnNuevo(this);
        asociarListenersEscuchadores(this, optionT);
    }

/**
*   Una forma compacta de agrupar las llamadas.
*   @param listener Recibe los eventos
*   @param option   Cual de las 2 ventanas carga
*/
    public void asociarListenersEscuchadores (ActionListener listener, int option){

        if( option == 0){
                MiVentanaPrincipal.getBtnCasiMVC().addActionListener(this);
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
        if( option == 1){
                MiVistaHalloween.ClickBtnNuevo(this);
                MiVistaHalloween.ClickBtnSalir(this);
                MiVistaHalloween.ClickMitemCopiar(this);
                MiVistaHalloween.ClickMitemCortar(this);
                MiVistaHalloween.ClickMitemPegar(this);

                MiVistaHalloween.addWindowListener(this);
                MiVistaHalloween.addComponentListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("  Se ha producido un click");
//          System.out.print("getSource -> ");  
//          System.out.println( e.getActionCommand() );

        switch (e.getActionCommand()){
        case "Nuevo":
            System.out.println("Has elegido Nuevo");
            if( optionT == 0 ){MiVentanaPrincipal.ponAreaTextoPrincipal("");}
            if( optionT == 1 ){MiVistaHalloween.ponAreaTextoPrincipal("");}
        break;
        case "Casi MVC":
            System.out.println("Casi estoy Solo ...   algo MVC");
            if( optionT == 0 ){MiVentanaPrincipal.Estado("Alto: " + MiVentanaPrincipal.getHeight() + "   Ancho: " + MiVentanaPrincipal.getWidth() + "    😕 Casi MVC 🏁");}
            if( optionT == 1 ){MiVistaHalloween.Estado("Alto: " + MiVentanaPrincipal.getHeight() + "   Ancho: " + MiVentanaPrincipal.getWidth() + "    😕 Casi MVC 🏁");}            
        break;
        case "Salir":
            System.out.println("Has elegido Salir");
            if( optionT == 0 ){MiVentanaPrincipal.SMS("Vas a salir...", "Salir");}
            if( optionT == 1 ){MiVistaHalloween.SMS("Vas a salir...", "Salir");}
            System.exit(0);
            break;
        case "Copiar":
            System.out.println("Has elegido Copiar");
            if( optionT == 0 ){MiVentanaPrincipal.SMS("Vas a copiar...", "Copiar");}
            if( optionT == 1 ){MiVistaHalloween.SMS("Vas a copiar...", "Copiar");}
            break;
        case "Cortar":
            System.out.println("Has elegido Cortar");
            if( optionT == 0 ){MiVentanaPrincipal.SMS("Vas a cortar...", "Cortar");}
            if( optionT == 1 ){MiVistaHalloween.SMS("Vas a cortar...", "Cortar");}
            break;
        case "Pegar":
            System.out.println("Has elegido Pegar");
            if( optionT == 0 ){MiVentanaPrincipal.SMS("Vas a pegar...", "Pegar");}
            if( optionT == 1 ){MiVistaHalloween.SMS("Vas a pegar...", "Pegar");}
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
            System.out.print("Me muevo ...");
            System.out.println(" X: " + arg0.getComponent().getX() + " Y: " + arg0.getComponent().getY());
            //System.out.println("--> " + arg0.getComponent().toString());
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("Se ha cambiado su tamaño");
            System.out.println( arg0.getComponent().getSize() );
            System.out.println( arg0.getComponent().getSize().getHeight() );
            System.out.println( arg0.getComponent().getSize().getWidth() );
            if( optionT == 0 ){MiVentanaPrincipal.Estado("Alto: " + arg0.getComponent().getSize().height + "   Ancho: " + arg0.getComponent().getSize().width);}
            if( optionT == 1 ){MiVistaHalloween.Estado("Alto: " + arg0.getComponent().getSize().height + "   Ancho: " + arg0.getComponent().getSize().width);}
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("Se muestran los componentes ...");
	}	

    public void InicialControl() throws IOException{

        if( MiConfig.getOptionArranque()==0 ){
            MiVentanaPrincipal.setTitle( MiConfig.getTitulo() + " Clásico" );
            MiVentanaPrincipal.setVisible(true);
        }else{
            MiVistaHalloween.setTitle( MiConfig.getTitulo() + "  👻" );
            MiVistaHalloween.fuenteAreaTextoPrincipal(MifuenteH);
            MiVistaHalloween.fuenteOpcional(MifuenteOp);
            MiVistaHalloween.setVisible(true);
        }
        
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
