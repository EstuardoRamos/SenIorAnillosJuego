package seniorAnillosJ.Bestias;

import seniorAnillosJ.Dado;
import seniorAnillosJ.Criatura;

public class Bestia extends Criatura {
    
    private static int ataqueMaximo = 90;

    public Bestia(int vida, int armadura, String nombre){
        super(vida, armadura, Bestia.ataqueMaximo ,nombre, false);
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0, Bestia.ataqueMaximo , 1, true);
    }
    
}