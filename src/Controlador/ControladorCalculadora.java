package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modelo.modeloCalculadora;
import Vista.VistaCalculadora;

public class ControladorCalculadora implements ActionListener{
    private modeloCalculadora modelo;
    private VistaCalculadora vista;
    private double save;

    public ControladorCalculadora(modeloCalculadora modelo, VistaCalculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
        save = 0;

        JButton botones[] = vista.getBotones();
        System.out.println(botones.length);
        for (int i = 0; i < botones.length; i++) {
            System.out.println(i+"-"+botones[i]);
            ((JButton)(botones[i])).addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.getB0() || e.getSource() == vista.getB1() || e.getSource() == vista.getB2()
                || e.getSource() == vista.getB3() || e.getSource() == vista.getB4() || e.getSource() == vista.getB5()
                || e.getSource() == vista.getB6() || e.getSource() == vista.getB7() || e.getSource() == vista.getB8()
                || e.getSource() == vista.getB9() || e.getSource() == vista.getbPunto()){
                    vista.actualizarResultado(vista.getDisplay().getText() + ((JButton)e.getSource()).getText());
                }
        if(e.getSource() == vista.getbSuma()){
            modelo.setOperando1(Double.parseDouble(vista.getDisplay().getText()));
            modelo.setOperador('+');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getbResta()){
            modelo.setOperando1(Double.parseDouble(vista.getDisplay().getText()));
            modelo.setOperador('-');
            vista.actualizarResultado(""); 
        } else if(e.getSource() == vista.getbMultiplicacion()){
            modelo.setOperando1(Double.parseDouble(vista.getDisplay().getText()));
            modelo.setOperador('*');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getbDivision()){
            modelo.setOperando1(Double.parseDouble(vista.getDisplay().getText()));
            modelo.setOperador('/');
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getbIgual()){
            modelo.setOperando2(Double.parseDouble(vista.getDisplay().getText()));
            Double resultado = modelo.calcular();
            vista.actualizarResultado(Double.toString(resultado));
        } else if(e.getSource() == vista.getbLimpiar()){
            modelo.setOperador(' ');
            modelo.setOperando1(0);
            modelo.setOperando2(0);
            vista.actualizarResultado("");
        } else if(e.getSource() == vista.getbGuardar()){
            save = Double.parseDouble(vista.getDisplay().getText());
        } else if(e.getSource() == vista.getbRecuperar()){
            vista.actualizarResultado(Double.toString(save));
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }



}
