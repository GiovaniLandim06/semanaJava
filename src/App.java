import java.util.Scanner;
import javax.swing.JFrame;

import br.com.jkalango.view.JIntro;
import br.com.jkalango.view.JSplash;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        new JIntro();
        
        System.out.print("Quanto de energia a Formiga terá? ");
        int energiaFormiga = sc.nextInt();
        Formiga f = new Formiga(energiaFormiga);

        System.out.println("Formiga Trabalhadora:");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();
        f.verificarEnergia();
        System.out.println("Deseja que o Personagem coma? (s/n)");
        char opcao = sc.next().charAt(0);
        if (opcao == 's') {
            f.comer();
        }

        System.out.println("Energia final: " + f.getEnergia());

        System.out.print("Quanto de energia o Kalango terá? ");
        int energiakalango = sc.nextInt();
        Kalango k = new Kalango(energiakalango);

        System.out.println("Kalango Trabalhador:");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();
        k.verificarEnergia();

        System.out.println("Deseja que o Personagem coma? (s/n)");
         opcao = sc.next().charAt(0);
        if (opcao == 's') {
            k.comer();
        }
      
        System.out.println("Energia final: " + k.getEnergia());


        
        System.out.print("Quanto de energia a Abelinha terá? ");
        int energiaAbelinha = sc.nextInt();
        Abelinha a = new Abelinha(energiaAbelinha);

        System.out.println("Abelinha Trabalhadora:");
        a.mover();                           
        a.mover();                           
        a.mover();
        a.fazerSom();
        a.dormir();
        a.verificarEnergia();

        System.out.println("Deseja que o Personagem coma? (s/n)");
         opcao = sc.next().charAt(0);
        if (opcao == 's') {
            a.comer();
        }
        System.out.println("Energia final: " + a.getEnergia());                           
        
        sc.close();
    }
}
