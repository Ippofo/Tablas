import pestanias.PestaniaCuatro;
import pestanias.PestaniaDos;
import pestanias.PestaniaTres;
import pestanias.PestaniaUno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    Container container;
    JTabbedPane pestanias;
    PestaniaUno pestaniaUno;
    PestaniaDos pestaniaDos;
    PestaniaTres pestaniaTres;
    PestaniaCuatro pestaniaCuatro;

    public void initGUI(){
        instancias();
        configurarContainer();
        acciones();
        setLocationRelativeTo(null);
        setTitle("Proyecto elementos");
        setSize(new Dimension(400,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void configurarContainer() {
        container.add(pestanias);
        pestanias.add("Altas", pestaniaUno);
        pestanias.add("Bajas", pestaniaDos);
        pestanias.add("Modificaciones", pestaniaTres);
        pestanias.add("Resumen", pestaniaCuatro);
    }

    private void acciones() {

    }

    private void instancias() {
        container = this.getContentPane();
        pestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();
        pestaniaDos = new PestaniaDos();
        pestaniaTres = new PestaniaTres();
        pestaniaCuatro = new PestaniaCuatro();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
