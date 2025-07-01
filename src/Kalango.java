public class Kalango extends Personagem implements IArmamento{

    public Kalango(Integer energia){
        super(energia);
    }

    @Override
    public void mover() {
        energia -= 3;
        System.out.println("Movendo... Energia: " + energia);
    }

    @Override
    public void fazerSom(){
        System.out.println("Tsssss!");
    }

    @Override
    public void comer() {
      energia += 5;
      System.out.println("Comendo...");

    }

    @Override
    public void atacar(){
        System.out.println("O Calango ataca com facão");
    }

}
