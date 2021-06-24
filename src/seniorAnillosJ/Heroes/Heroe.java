package seniorAnillosJ.Heroes;

import seniorAnillosJ.Dado;
import seniorAnillosJ.Criatura;

public class Heroe extends Criatura {

    private static int ataqueMaximo = 100;

    private static int instanciasHeroes;

    public Heroe(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, true);
        Heroe.instanciasHeroes++;
    }

    public static int getInstancias(){
        return Heroe.instanciasHeroes;
    }

    @Override
    public int getAtaque(){
        return Dado.tirarDado(0, Heroe.ataqueMaximo, 2, true);
    }
    
}