package pestanias;

import utils.Persona;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaCuatro extends JPanel implements ActionListener {

    JPanel panelSuperior,panelInferior,panelCentro;
    JLabel clave, nombre,apellidos,edad ,calle ,numero, codigoPostal;
    JTextField tfClave, tfNombre, tfApellido, tfEdad,taCalle,taNumero,taCodigo;
    JButton alta, baja;
    JTable table;
    DefaultTableModel modelo;
    TitledBorder datos, direccion;

    public PestaniaCuatro(){
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarContainer();
        acciones();
    }

    private void acciones() {
        alta.addActionListener(this);
        baja.addActionListener(this);
    }

    private void configurarContainer() {
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(configurarSuperior()), BorderLayout.NORTH);
        this.add(configurarCentro(), BorderLayout.CENTER);
        this.add(configurarInferior(), BorderLayout.SOUTH);
    }

    private JPanel configurarCentro() {
        panelCentro.setLayout(new GridLayout(7,2,2,5));
        panelCentro.setBorder(datos);
        panelCentro.add(clave);
        panelCentro.add(tfClave);
        panelCentro.add(nombre);
        panelCentro.add(tfNombre);
        panelCentro.add(apellidos);
        panelCentro.add(tfApellido);
        panelCentro.add(edad);
        panelCentro.add(tfEdad);
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
        panelInferior.add(baja);
        return panelInferior;
    }

    private JPanel configurarSuperior() {
        String [] cols = {"Clave", "Nombre", "Apellido", "Edad"};
        Object [][] info = {{1, "Prueba", "Prueba", "Prueba"}, {2, "Prueba", "Prueba", "Prueba"} };
        modelo = new DefaultTableModel(info, cols);
        table = new JTable(modelo);
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
        taCalle = new JTextField();
        taNumero = new JTextField();
        taCodigo = new JTextField();

        alta = new JButton("Dar de alta");
        baja = new JButton("Dar de baja");

        datos = new TitledBorder("Datos");
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
