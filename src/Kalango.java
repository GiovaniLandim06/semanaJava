public class Kalango extends Personagem {

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

    

}
