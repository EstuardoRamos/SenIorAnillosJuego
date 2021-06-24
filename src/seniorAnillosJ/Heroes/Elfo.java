package seniorAnillosJ.Heroes;

import seniorAnillosJ.Heroes.Heroe;
import seniorAnillosJ.Bestias.Orco;
import seniorAnillosJ.Criatura;



public class Elfo extends Heroe {

    public Elfo(String nombre){
        super(250, 60, nombre);
    }

    @Override
    public void saludar(){
        System.out.println("Elfo  " + this.nombre);
    }

    @Override
    public int obtenerAtaque(Criatura defensor){
        if (defensor instanceof Orco){
            System.out.println(" "+ this.getNombre() + " furia elfica ");
            return this.getAtaque() + 10;

        }
        
        return this.getAtaque();
    }
}