package seniorAnillosJ.Bestias;

import seniorAnillosJ.Bestias.Bestia;

public class Trasgo extends Bestia{

    private static int contadorInstancias;


    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }


    public Trasgo(String nombre){
        super(325,46,nombre);
    }
    
}
