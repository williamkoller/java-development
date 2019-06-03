import java.util.Scanner;
public class Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner (System.in);
		
		int anos, meses, dias;
		int result;
		
		System.out.println("Anos: ");
		anos = p1.nextInt();
		
		System.out.println("Meses: ");
		meses = p1.nextInt();
		
		System.out.println("Dias: ");
		dias = p1.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		
		result = anos + meses;
		
		System.out.print(+result+(+dias)+" Dias");
		p1.close();
		
		
	}

}
