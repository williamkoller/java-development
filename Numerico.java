import java.util.Scanner;
public class Numerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
        
        int inteiro = 0, antecessor = 0, sucessor= 0;
        
        System.out.println("Informe um número: ");
        inteiro = n1.nextInt();
        sucessor = inteiro + 1;
        antecessor = inteiro -1;
        
        System.out.println("O número informado foi "+inteiro);
        System.out.println("O antecessor é "+antecessor);
        System.out.println("O sucessor é "+sucessor);
        
    
	}

}
