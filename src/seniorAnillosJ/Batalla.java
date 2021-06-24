package seniorAnillosJ;

import seniorAnillosJ.Bestias.Orco;
import seniorAnillosJ.Bestias.Trasgo;
import seniorAnillosJ.Heroes.Elfo;
import seniorAnillosJ.Heroes.Hobbit;
import seniorAnillosJ.Heroes.Humano;
import seniorAnillosJ.Heroes.Heroe;
import seniorAnillosJ.Bestias.Bestia;

public class Batalla {

    private Bestia ejercitoBestias[];
    private Heroe ejercitoHeroes[];

    private final int CANTIDAD = 5;

    //private int contadorHumanos;
    
    public Batalla(){
        ejercitoBestias = new Bestia[CANTIDAD];
        ejercitoHeroes = new Heroe[CANTIDAD];
    }

    public void presentarPersonajes(Criatura ejercito[]){

        if (ejercito.length> 0 ){
            String name = "";
            if (ejercito[0] instanceof Bestia){
                name = "Bestia";
            }
            else{
                name = "Heroe";
            }

            System.out.println("\nEjercito de "+name);
            //ejemplo con operador ternario
            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar(){
        System.out.println("Bienvenido  a la batalla \n\n");
        
        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        System.out.println("\n\n\n");
        this.pelea();
        System.out.println("");
        Bestia b= new Orco("orco 1");
        Bestia b1= new Trasgo("Trasgo 1");
        Heroe h = new Elfo("Elfo 1");
        Heroe h1 = new Hobbit("Hobbit 1");
        b.recibirAtaque(h);
        h.recibirAtaque(b);
        System.out.println("");
        b1.recibirAtaque(h1);
        h1.recibirAtaque(b1);
        
    }

    public void pelea(){
        do{
        ejercitoBestias[0].recibirAtaque(ejercitoHeroes[0]);
        ejercitoHeroes[0].recibirAtaque(ejercitoBestias[0]);
        }while(ejercitoHeroes[0].getVida()>=0 ||ejercitoBestias[0].getVida()>=0 );
        System.out.println("El ganador es "+ejercitoHeroes[0].getNombre());
    }

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano "+Humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit "+Hobbit.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgo("Trasgo "+Trasgo.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
            }
        }
    }
}