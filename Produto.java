import java.util.Scanner;
public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner produto = new Scanner (System.in);
		
		int code, valor1, valor2, qntde1, qntde2;
		float total, total1, ipi;
		
		System.out.println("Informe o código peça 01: ");
		code = produto.nextInt();
		
		System.out.println("Informe o valor peça 01: ");
		valor1 = produto.nextInt();
		
		System.out.println("Informe a quantidade peça 01: ");
		qntde1 = produto.nextInt();
		
		System.out.println("Informe a porcetagem compra: ");
		ipi = produto.nextFloat();
		
		System.out.println("Informe o valor peça 02: ");
		valor2 = produto.nextInt();
		
		System.out.println("Informe a quantidade peça 02: ");
		qntde2 = produto.nextInt();
		
		total = (valor1*qntde1+valor2+qntde2);
		total1 = total*(ipi/100+1);
		System.out.println("Total = "+total1);
		
		produto.close();
	}

}
