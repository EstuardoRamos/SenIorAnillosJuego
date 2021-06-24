package seniorAnillosJ;

public class Criatura {

    protected int vida;
    protected int armadura=(int) (Math.random()*(70-50)+50);;
    protected int ataque;
    protected String nombre;
    protected boolean esHeroe;

    private static int instanciasPersonajes;

    public Criatura(int vida, int armadura, int ataque, String nombre, boolean esHeroe) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
        instanciasPersonajes++;
    }

    public int obtenerArmadura(Criatura atacante) {
        return this.getArmadura();
    }

    public int obtenerAtaque(Criatura defensor) {
        return this.getAtaque();
    }

    public void recibirAtaque(Criatura atacante) {
        System.out.println("Batalla " + atacante.getNombre() + "-- Vida: " + atacante.getVida() + "-- Armadura: " + atacante.getArmadura() + "-- vs --" + this.getNombre() + "-- Vida: " + this.getVida() + "-- Armadura: " + this.getArmadura());

        int danyoRecibido = this.obtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (danyoRecibido <= 0) {
            this.vida += danyoRecibido;
        } else {
            danyoRecibido = 0;
        }
        System.out.println(" " + atacante.getNombre() + " ataco a  " + this.getNombre() + " le hizo daño: " + danyoRecibido + " le redujola vida a " + this.getVida());
    }

    public void saludar() {
        System.out.println("Peleador " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean get() {
        return this.esHeroe;
    }

    public static int getInstancias(){
        return Criatura.instanciasPersonajes;
    }

}