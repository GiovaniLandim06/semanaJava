public class Formiga extends Personagem implements IArmamento {

 
    public Formiga(Integer energia){
        super(energia);
    }
    
    
    @Override
    public void mover() {
       energia -= 2; 
       System.out.println("Movendo... Energia: " + energia);
    }

    @Override
    public void fazerSom(){
        System.out.println("Fzzzzz!");
    }

    
    @Override
    public void comer() {
      energia += 2;
      System.out.println("Comendo...");

    }


    @Override
    public void atacar() {
        System.out.println("A formiga ataca com 4 formas");
    }



}
