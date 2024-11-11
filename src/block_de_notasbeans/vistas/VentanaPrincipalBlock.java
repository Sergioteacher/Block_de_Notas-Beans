/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package block_de_notasbeans.vistas;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Sergio Teacher
 */
public class VentanaPrincipalBlock extends javax.swing.JFrame {

private VentanaConfig Vconf;

    /**
     * Creates new form VentanaPrincipalBlock
     */
    public VentanaPrincipalBlock() {
        initComponents();
        this.setLocationRelativeTo(null);
        System.out.println("Iniciando Ventana Principal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEstado = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        PanelBotonera = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtFlecha = new javax.swing.JLabel();
        btnNoMVC = new javax.swing.JButton();
        btnCasiMVC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTextoPrincipal = new javax.swing.JTextArea();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MitemNuevo = new javax.swing.JMenuItem();
        MitemSalir = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        MitemCopiar = new javax.swing.JMenuItem();
        MitemCortar = new javax.swing.JMenuItem();
        MitemPegar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEstado.setText("Iniciando ...");
        getContentPane().add(txtEstado, java.awt.BorderLayout.PAGE_END);

        PanelCentral.setLayout(new java.awt.BorderLayout());

        PanelBotonera.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnNuevo.setText("Nuevo");
        PanelBotonera.add(btnNuevo);

        btnSalir.setText("Salir");
        PanelBotonera.add(btnSalir);

        txtFlecha.setText("          ETO son botones  👽  -->");
        PanelBotonera.add(txtFlecha);

        btnNoMVC.setBackground(new java.awt.Color(255, 51, 51));
        btnNoMVC.setText("NoMVC");
        btnNoMVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoMVCActionPerformed(evt);
            }
        });
        PanelBotonera.add(btnNoMVC);

        btnCasiMVC.setBackground(new java.awt.Color(255, 255, 0));
        btnCasiMVC.setText("Casi MVC");
        PanelBotonera.add(btnCasiMVC);

        PanelCentral.add(PanelBotonera, java.awt.BorderLayout.PAGE_START);

        AreaTextoPrincipal.setColumns(20);
        AreaTextoPrincipal.setRows(5);
        jScrollPane1.setViewportView(AreaTextoPrincipal);

        PanelCentral.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");

        MitemNuevo.setText("Nuevo");
        MenuArchivo.add(MitemNuevo);

        MitemSalir.setText("Salir");
        MenuArchivo.add(MitemSalir);

        BarraMenu.add(MenuArchivo);

        MenuEditar.setText("Editar");

        MitemCopiar.setText("Copiar");
        MenuEditar.add(MitemCopiar);

        MitemCortar.setText("Cortar");
        MenuEditar.add(MitemCortar);

        MitemPegar.setText("Pegar");
        MenuEditar.add(MitemPegar);

        BarraMenu.add(MenuEditar);

        setJMenuBar(BarraMenu);

        setBounds(0, 0, 620, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoMVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoMVCActionPerformed
        System.out.println("Estoy Solo.................sin MVC");
        txtEstado.setText( "Alto: " + this.getHeight() + "   Ancho: " + this.getWidth() + "       ⛔ NO soy  MVC! 😠😠😠 " );
        System.out.println("Evento: " + evt);
        System.out.println("ventanaaaaaaaaaaaaaaaa C");
Vconf = new VentanaConfig(this);
Vconf.setVisible(true);
this.setEnabled(false);
    }//GEN-LAST:event_btnNoMVCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTextoPrincipal;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenuItem MitemCopiar;
    private javax.swing.JMenuItem MitemCortar;
    private javax.swing.JMenuItem MitemNuevo;
    private javax.swing.JMenuItem MitemPegar;
    private javax.swing.JMenuItem MitemSalir;
    private javax.swing.JPanel PanelBotonera;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton btnCasiMVC;
    private javax.swing.JButton btnNoMVC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFlecha;
    // End of variables declaration//GEN-END:variables

    public void ClickBtnNuevo(ActionListener l) {
        btnNuevo.addActionListener(l);
    }

    public void ClickBtnSalir(ActionListener l) {
        btnSalir.addActionListener(l);
    }

    public void ClickMitemNuevo(ActionListener l) {
        MitemNuevo.addActionListener(l);
    }

    public void ClickMitemSalir(ActionListener l) {
        MitemSalir.addActionListener(l);
    }

    public void ClickMitemCopiar(ActionListener l) {
        MitemCopiar.addActionListener(l);
    }

    public void ClickMitemCortar(ActionListener l) {
        MitemCortar.addActionListener(l);
    }

    public void ClickMitemPegar(ActionListener l) {
        MitemPegar.addActionListener(l);
    }

    public void SMS(String MSM, String Titulo) {
        JOptionPane.showMessageDialog(null,MSM,Titulo, JOptionPane.WARNING_MESSAGE);
    }

    public void Estado(String MSM) {
        txtEstado.setText(MSM);
    }

    public void ponAreaTextoPrincipal(String Cosa) {
        AreaTextoPrincipal.setText(Cosa);
    }

    public JButton getBtnCasiMVC() {
        return btnCasiMVC;
    }


}
