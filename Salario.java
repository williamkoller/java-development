import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salario = new Scanner (System.in);
		
		double salario_min, salario_real;
		double result_salario;
		
		System.out.println("Informe o salário minimo: ");
		salario_min = salario.nextInt();
		
		System.out.println("Informe seu salário: ");
		salario_real = salario.nextInt();
		
				
		result_salario = salario_real / salario_min;
		
		System.out.print("Quantidade de salários: "+result_salario);
		
		salario.close();
		
	}


}
