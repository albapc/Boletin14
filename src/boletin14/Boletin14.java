
package boletin14;

import javax.swing.JOptionPane;

public class Boletin14 {

    public static void main(String[] args) {
        ConversorTemperaturas calculo = new ConversorTemperaturas();
        
        try{
            float graosC=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce os graos"));
            System.out.println("Graos Fahrenheit: "+calculo.centigradosAFahrenheit(graosC)+"º F");
            System.out.println("Graos Reamur: "+calculo.centigradosAReamur(graosC)+"º R");
        } catch (TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    
}
