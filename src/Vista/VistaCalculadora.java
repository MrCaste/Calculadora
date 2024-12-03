package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaCalculadora extends JFrame{
    private JTextField display;
    private JButton bSuma, bResta, bMultiplicacion, bDivision, bLimpiar, bGuardar, bRecuperar, bIgual;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPunto;
    private JButton[] botones;
    private JPanel panelOperadores, panelNumeros;

    public VistaCalculadora() {
        super("Calculadora");
        /********* Display *********/
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        /********* Botonoes *********/
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPunto = new JButton(".");
        bSuma = new JButton("+");
        bResta = new JButton("-");
        bMultiplicacion = new JButton("*");
        bDivision = new JButton("/");
        bLimpiar = new JButton("AC");
        bGuardar = new JButton("Save");
        bRecuperar = new JButton("Recover");
        bIgual = new JButton("=");
        botones = new JButton[19];
        botones[0] = b0;
        botones[1] = b1;
        botones[2] = b2;
        botones[3] = b3;
        botones[4] = b4;
        botones[5] = b5;
        botones[6] = b6;
        botones[7] = b7;
        botones[8] = b8;
        botones[9] = b9;
        botones[10] = bPunto;
        botones[11] = bSuma;
        botones[12] = bResta;
        botones[13] = bMultiplicacion;
        botones[14] = bDivision;
        botones[15] = bLimpiar;
        botones[16] = bGuardar;
        botones[17] = bRecuperar;
        botones[18] = bIgual;


        /********* Layout *********/
        GridBagLayout GCalculadora = new GridBagLayout();
        GridBagConstraints calculadoraConstraints = new GridBagConstraints();

        /********* Ventana principal *********/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 370);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(GCalculadora);

        calculadoraConstraints.fill = GridBagConstraints.HORIZONTAL;
        calculadoraConstraints.weightx = 0.5;
        calculadoraConstraints.ipady = 40;
        calculadoraConstraints.gridx = 0;
        calculadoraConstraints.gridy = 0;
        calculadoraConstraints.gridwidth = 5;
        getContentPane().add(display, calculadoraConstraints);
        calculadoraConstraints.gridwidth = 1;
        calculadoraConstraints.gridx = 0;
        calculadoraConstraints.gridy = 1;
        getContentPane().add(b1, calculadoraConstraints);
        calculadoraConstraints.gridx = 1;
        calculadoraConstraints.gridy = 1;
        getContentPane().add(b2, calculadoraConstraints);
        calculadoraConstraints.gridx = 2;
        calculadoraConstraints.gridy = 1;
        getContentPane().add(b3, calculadoraConstraints);
        calculadoraConstraints.gridx = 3;
        calculadoraConstraints.gridy = 1;
        getContentPane().add(bSuma, calculadoraConstraints);
        calculadoraConstraints.gridx = 4;
        calculadoraConstraints.gridy = 1;
        getContentPane().add(bLimpiar, calculadoraConstraints);

        calculadoraConstraints.gridx = 0;
        calculadoraConstraints.gridy = 2;
        getContentPane().add(b4, calculadoraConstraints);
        calculadoraConstraints.gridx = 1;
        calculadoraConstraints.gridy = 2;
        getContentPane().add(b5, calculadoraConstraints);
        calculadoraConstraints.gridx = 2;
        calculadoraConstraints.gridy = 2;
        getContentPane().add(b6, calculadoraConstraints);
        calculadoraConstraints.gridx = 3;
        calculadoraConstraints.gridy = 2;
        getContentPane().add(bResta, calculadoraConstraints);
        calculadoraConstraints.gridx = 4;
        calculadoraConstraints.gridy = 2;
        getContentPane().add(bGuardar, calculadoraConstraints);

        calculadoraConstraints.gridx = 0;
        calculadoraConstraints.gridy = 3;
        getContentPane().add(b7, calculadoraConstraints);
        calculadoraConstraints.gridx = 1;
        calculadoraConstraints.gridy = 3;
        getContentPane().add(b8, calculadoraConstraints);
        calculadoraConstraints.gridx = 2;
        calculadoraConstraints.gridy = 3;
        getContentPane().add(b9, calculadoraConstraints);
        calculadoraConstraints.gridx = 3;
        calculadoraConstraints.gridy = 3;
        getContentPane().add(bMultiplicacion, calculadoraConstraints);
        calculadoraConstraints.gridx = 4;
        calculadoraConstraints.gridy = 3;
        calculadoraConstraints.gridheight = 2;
        calculadoraConstraints.ipady = 106;
        getContentPane().add(bRecuperar, calculadoraConstraints);

        calculadoraConstraints.gridx = 0;
        calculadoraConstraints.gridy = 4;
        calculadoraConstraints.gridheight = 1;
        calculadoraConstraints.ipady = 40;
        getContentPane().add(b0, calculadoraConstraints);
        calculadoraConstraints.gridx = 1;
        calculadoraConstraints.gridy = 4;
        getContentPane().add(bPunto, calculadoraConstraints);
        calculadoraConstraints.gridx = 2;
        calculadoraConstraints.gridy = 4;
        getContentPane().add(bIgual, calculadoraConstraints);
        calculadoraConstraints.gridx = 3;
        calculadoraConstraints.gridy = 4;
        getContentPane().add(bDivision, calculadoraConstraints);

        
        setVisible(true);
    }

    public void actualizarResultado(String valor){
        display.setText(valor);
    }

    public JTextField getDisplay() {
        return display;
    }

    public JButton getbIgual() {
        return bIgual;
    }

    public JButton getbSuma() {
        return bSuma;
    }

    public JButton getbResta() {
        return bResta;
    }

    public JButton getbMultiplicacion() {
        return bMultiplicacion;
    }

    public JButton getbDivision() {
        return bDivision;
    }

    public JButton getbLimpiar() {
        return bLimpiar;
    }

    public JButton getbGuardar() {
        return bGuardar;
    }

    public JButton getbRecuperar() {
        return bRecuperar;
    }

    public JButton getB0() {
        return b0;
    }

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }

    public JButton getB4() {
        return b4;
    }

    public JButton getB5() {
        return b5;
    }

    public JButton getB6() {
        return b6;
    }

    public JButton getB7() {
        return b7;
    }

    public JButton getB8() {
        return b8;
    }

    public JButton getB9() {
        return b9;
    }

    public JButton getbPunto() {
        return bPunto;
    }

    public JButton[] getBotones() {
        return botones;
    }

    public JPanel getPanelOperadores() {
        return panelOperadores;
    }

    public JPanel getPanelNumeros() {
        return panelNumeros;
    }

    

}
