import java.util.Scanner;
public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner veiculo = new Scanner (System.in);
		
		int carroNovo, custoFabrica;
		int perceDistrobuidor, impostos;
		float result, result1;
		
		System.out.println("Informe o valor do seu veículo: ");
		carroNovo = veiculo.nextInt();
		
		System.out.println("Informe o valor do custo do carro de fábrica: ");
		custoFabrica = veiculo.nextInt();
		
		System.out.println("informe o valor do percentual do distribuidor: ");
		perceDistrobuidor = veiculo.nextInt();
		
		System.out.println("Informe o valor dos impostos: ");
		impostos = veiculo.nextInt();
		
		result = (custoFabrica*perceDistrobuidor)/100;
		result1 = (carroNovo*impostos)/100;
		
		
		
		System.out.print("Custo de fábrica: "+result+" Custo do consumidor: "+result1);
	}

}
