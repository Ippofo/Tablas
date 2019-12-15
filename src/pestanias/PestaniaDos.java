package pestanias;

import utils.Persona;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PestaniaDos extends JPanel implements ActionListener {

    JPanel panelSuperior,panelInferior,panelCentro, panelSuperior2;
    JLabel clave, nombre,apellidos,edad ,calle ,numero, codigoPostal;
    JTextArea taCalle,taNumero,taCodigo;
    JTextField  tfNombre, tfApellido, tfEdad;
    JComboBox cClave;
    JButton baja;
    DefaultComboBoxModel defaultComboBoxModel;
    ArrayList<Persona>listaPersonas;
    TitledBorder datos, direccion, seleccion;

    public PestaniaDos(){
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarContainer();
        configurarModeloCombo();
        acciones();
    }

    private void configurarModeloCombo() {
        for (int i = 0; i<Persona.listaPersonas.size();i++){
            defaultComboBoxModel.addElement(i);
        }
    }

    private void acciones() {
        baja.addActionListener(this);
    }

    private void configurarContainer() {
        this.setLayout(new GridLayout(4,1));
        this.add(configurarSuperior2());
        this.add(configurarSuperior());
        this.add(configurarCentro());
        this.add(configurarInferior());
    }

    private JPanel configurarSuperior2() {
        panelSuperior2.setLayout(new GridLayout(1,2, 50, 10));
        panelSuperior2.setBorder(seleccion);
        panelSuperior2.add(clave);
        panelSuperior2.add(cClave);
        return panelSuperior2;
    }

    private JPanel configurarCentro() {
        panelCentro.setLayout(new GridLayout(3,2,50,10));
        panelCentro.setBorder(direccion);
        panelCentro.add(calle);
        panelCentro.add(taCalle);
        panelCentro.add(numero);
        panelCentro.add(taNumero);
        panelCentro.add(codigoPostal);
        panelCentro.add(taCodigo);
        return panelCentro;
    }

    private JPanel configurarInferior() {
        panelInferior.add(baja);
        return panelInferior;
    }

    private JPanel configurarSuperior() {
        panelSuperior.setLayout(new GridLayout(4,2,30,10));
        panelSuperior.setBorder(datos);
        panelSuperior.add(nombre);
        panelSuperior.add(tfNombre);
        panelSuperior.add(apellidos);
        panelSuperior.add(tfApellido);
        panelSuperior.add(edad);
        panelSuperior.add(tfEdad);
        return panelSuperior;
    }

    private void instancias() {
        panelSuperior = new JPanel();
        panelSuperior2 = new JPanel();
        panelCentro = new JPanel();
        panelInferior = new JPanel();
        seleccion = new TitledBorder("Seleccion clave");
        defaultComboBoxModel = new DefaultComboBoxModel();
        clave = new JLabel("Clave");
        nombre = new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        edad = new JLabel("Edad");
        calle = new JLabel("Calle");
        numero = new JLabel("Número");
        codigoPostal = new JLabel("Código Postal");

        cClave = new JComboBox(defaultComboBoxModel);
        tfNombre = new JTextField();
        tfApellido= new JTextField();
        tfEdad = new JTextField();

        taCalle = new JTextArea();
        taNumero = new JTextArea();
        taCodigo = new JTextArea();

        baja = new JButton("Baja");

        datos = new TitledBorder("Datos personales");
        direccion = new TitledBorder("Direccion");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
