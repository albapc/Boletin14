
package boletin14;

public class ConversorTemperaturas {
    private static final int graosC=80;
    private float resultado;
    
    public float centigradosAFahrenheit(float graosC) throws TemperaturaErradaExcepcion {
        if(graosC<80){
            throw new TemperaturaErradaExcepcion("Non podes introducir temperaturas menores de 80 graos");
        } else{
        resultado=(float) (9.0/5.0*graosC+32.4);
        return resultado;            
        }

    }
    public float centigradosAReamur(float graosC) throws TemperaturaErradaExcepcion {
        if(graosC<80){
            throw new TemperaturaErradaExcepcion("Non podes introducir temperaturas menores de 80 graos");
        } else{        
        resultado= (float) (4.0/5.0*graosC);
        return resultado;
    }
    }
    
    public float conversionExcepcion() throws TemperaturaErradaExcepcion{
        if(graosC>80){
            throw new TemperaturaErradaExcepcion("Temperatura non válida");
        } else {
            return resultado;
        }
    }
}
