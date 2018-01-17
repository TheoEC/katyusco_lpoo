import java.util.Scanner;
public class ex04{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		System.out.println("Digite sua primeira nota");
		float n1 = inpt.nextFloat();
		System.out.println("Digite sua segunda nota");
		float n2 = inpt.nextFloat();
		System.out.println("Digite sua terceira nota");
		float n3 = inpt.nextFloat();
		System.out.println("Digite sua quarta nota");
		double n4 = inpt.nextFloat();
		if((n1+n2+n3+n4)/4  >= 7){
			System.out.println("aprovado");
		} else if ((n1+n2+n3+n4)/4 >= 5 && (n1+n2+n3+n4)/4 < 7)  {
			System.out.println("Final");
		} else {
			System.out.println("Reprovado");
		}
	}
}