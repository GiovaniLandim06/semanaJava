public abstract class Personagem {
   protected Integer energia;

   public Personagem() {
   }

   public Personagem(Integer energia) {
      this.energia = energia;
   }

   public abstract void mover();

   public abstract void fazerSom();

   public void dormir() {
      System.out.println("Dormindo...");
      energia += 10;
   }

   public Integer getEnergia() {
      return energia;
   }

   public abstract void comer();

   public void verificarEnergia() {
      if (energia > 5) {
         System.out.println("Personagem está descansado");
      } else {
         System.out.println("Personagem está cansado, procure comer ou dormir");
      }
   }
}
