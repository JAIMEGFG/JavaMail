import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class VentanaEmail extends JFrame implements ActionListener {

    JLabel para, CC, CCO, Asunto, Archivo;
    JButton Archivo1, enviar, eliminar;
    JTextArea correo;
    JTextField para1,CC1,CCO1,Asunto1;
    Container container;
    Properties properties;



    public void todoEmail(){
    instancias();
    configurarContainer();
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    acciones();
    setVisible(true);

    }

    public void configurarConstraint(int posX, int posY,int fill, int anchor
            ,double pesX, double pesY, int tamX, int tamY, JComponent component){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = posX;
        constraints.gridy = posY;
        constraints.fill = fill ;
        constraints.anchor= anchor;
        constraints.weightx = pesX;
        constraints.weighty = pesY;
        constraints.gridwidth= tamX;
        constraints.gridheight= tamY;
        container.add(component,constraints); //NO ENTIENDO POR QUE

    }
    public void configurarContainer() {
        container.setLayout(new GridBagLayout());
        //fila 001
        configurarConstraint(0, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0, 0, 1, 1, para);
        configurarConstraint(1, 0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.2, 0, 3, 1, para1);
        //fila 2
        configurarConstraint(0, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0, 0, 1, 1, CC);
        configurarConstraint(1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.2, 0, 1, 1, CC1);
        configurarConstraint(2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0, 0, 1, 1, CCO);
        configurarConstraint(3, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST,
                1, 0, 1, 1, CCO1);
        //fila 3
        configurarConstraint(0, 2, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0, 0, 1, 1, Asunto);
        configurarConstraint(1, 2, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.8, 0, 3, 1, Asunto1);
        //fila 4
        configurarConstraint(0, 3, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0, 0, 1, 1, Archivo);
        configurarConstraint(1, 3, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.2, 0, 1, 1, Archivo1);
        //fila 5
        configurarConstraint(0, 4, GridBagConstraints.BOTH, GridBagConstraints.CENTER,
                1, 1, 4, 2, correo);
        //fila 6
        configurarConstraint(1, 6, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.2, 0, 1, 1, enviar);
        configurarConstraint(2, 6, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER,
                0.2, 0, 1, 1, eliminar);
    }

    public void instancias(){
        CC = new JLabel("CC:");
        para = new JLabel("Para:");
        CCO = new JLabel("CCO:");
        Asunto = new JLabel("Asunto");
        Archivo = new JLabel("Adjuntar");
        para1 = new JTextField();
        CC1 = new JTextField();
        CCO1 = new JTextField();
        Asunto1 = new JTextField();
        Archivo1 = new JButton("Seleccionar");
        enviar = new JButton("Enviar");
        eliminar = new JButton("Eliminar");
        correo = new JTextArea("Esribe el cuerpo del correo electrónico");
        container = getContentPane();
    }
    public void acciones(){
        eliminar.addActionListener(this);
        enviar.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
