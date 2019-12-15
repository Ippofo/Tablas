package pestanias;

import utils.Persona;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PestaniaUno extends JPanel implements ActionListener {

    JPanel panelSuperior,panelInferior,panelCentro;
    JLabel clave, nombre,apellidos,edad ,calle ,numero, codigoPostal;
    JTextArea taCalle,taNumero,taCodigo;
    JTextField tfClave, tfNombre, tfApellido, tfEdad;
    JButton alta;

    TitledBorder datos, direccion;


    public PestaniaUno(){
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarContainer();
        acciones();
    }

    private void acciones() {
        alta.addActionListener(this);
    }

    private void configurarContainer() {
        this.setLayout(new BorderLayout());
        this.add(configurarSuperior(), BorderLayout.NORTH);
        this.add(configurarCentro(), BorderLayout.CENTER);
        this.add(configurarInferior(), BorderLayout.SOUTH);
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
        panelInferior.add(alta);
        return panelInferior;
    }

    private JPanel configurarSuperior() {
        panelSuperior.setLayout(new GridLayout(4,2,30,10));
        panelSuperior.setBorder(datos);
        panelSuperior.add(clave);
        panelSuperior.add(tfClave);
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
        panelCentro = new JPanel();
        panelInferior = new JPanel();

        clave = new JLabel("Clave");
        nombre = new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        edad = new JLabel("Edad");
        calle = new JLabel("Calle");
        numero = new JLabel("Número");
        codigoPostal = new JLabel("Código Postal");

        tfClave = new JTextField();
        tfNombre = new JTextField();
        tfApellido= new JTextField();
        tfEdad = new JTextField();

        taCalle = new JTextArea();
        taNumero = new JTextArea();
        taCodigo = new JTextArea();

        alta = new JButton("Alta");
        datos = new TitledBorder("Datos personales");
        direccion = new TitledBorder("Direccion");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==alta){
            Persona.listaPersonas.add(new Persona(Integer.valueOf(tfClave.getText().toString()),
                    Integer.valueOf(tfEdad.getText().toString()),
                    Integer.valueOf(taNumero.getText().toString()),
                    Integer.valueOf(taCodigo.getText().toString()),
                    tfNombre.getText().toString(),
                    tfApellido.getText().toString(),
                    taCalle.getText().toString()));
                    tfClave.setText("");
                    tfEdad.setText("");
                    taNumero.setText("");
                    taCodigo.setText("");
                    tfNombre.setText("");
                    tfApellido.setText("");
                    taCalle.setText("");
        }
    }
}
