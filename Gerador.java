import java.util.Random;
public class Gerador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		
		int numTemp = 0;
		
		for(int i =0; i < 50; i++) {
			numTemp=gerador.nextInt(100);
			System.out.println(">"+numTemp);
		}
	}

}
