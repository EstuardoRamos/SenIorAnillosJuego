package seniorAnillosJ.Heroes;

import seniorAnillosJ.Bestias.*;
import seniorAnillosJ.Heroes.Heroe;
import seniorAnillosJ.Criatura;

public class Hobbit extends Heroe {

    private static int contadorInstancias;


    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }

    /** constructor */
    public Hobbit(String nombre){
        super(200, 40, nombre);
        Hobbit.contadorInstancias++;
    }
    @Override
    public int obtenerAtaque(Criatura defensor){
        if (defensor instanceof Trasgo){
            System.out.println(" "+ this.getNombre() + " furia elfica ");
            return this.getAtaque() - 5 ;

        }
        
        return this.getAtaque();
    }

    @Override
    public void saludar(){
        System.out.println("Hobbit  " + this.nombre);
    }

    
    
}