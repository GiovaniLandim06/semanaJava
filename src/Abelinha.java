public class Abelinha extends Personagem{

    
    public Abelinha(Integer energia){
        super(energia);
    }
    
    @Override
    public void mover() {
        energia -= 1;
        System.out.println("Movendo... Energia: " + energia);
    }

    @Override
    public void fazerSom(){
        System.out.println("Bzzzz!");
    }

    
    @Override
    public void comer() {
      energia += 3;
      System.out.println("Comendo...");

    }
}
