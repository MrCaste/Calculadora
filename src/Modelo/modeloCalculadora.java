package Modelo;

public class modeloCalculadora {
    private double operando1;
    private double operando2;
    private char operador;

    

    public modeloCalculadora() {
        operando1 = 0;
        operando2 = 0;
        operador = ' ';
    }

    public double calcular(){
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                resultado = operando1 / operando2;
                break;
            default:
                System.err.println("Opcion no valida ");
                break;
        }
        return resultado;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    


}
