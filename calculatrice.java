package calculatrice;
import java.util.Scanner;

public class app2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la premiere valeur");
        int a = sc.nextInt();
        System.out.println("Veuillez saisir la deuxieme valeur");
        int b = sc.nextInt();
        
        System.out.println("1__Addition");
        System.out.println("2__soustraction");
        System.out.println("3__division");
        System.out.println("4__multiplication");
        System.out.println("5__quitter");
        System.out.println("fait ton choix");
        char ch = sc.next().charAt(0);
        switch(ch){
              case'1':
                  System.out.println(+(a+b));
                  break;
              case'2':
                  System.out.println(+(a-b));
                  break;
              case'3':
                  System.out.println(+(a/b));
                  break;
              case'4':
                  System.out.println(+(a*b));
                  break;
              case'5':
                  System.out.println("Aurevoir!!!!");
                  break;

	}

}
}