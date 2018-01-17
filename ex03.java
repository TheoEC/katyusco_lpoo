import java.util.Scanner;
public class ex03{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		System.out.println("Digite sua primeira nota");
		float n1 = inpt.nextFloat();
		System.out.println("Digite sua segunda nota");
		float n2 = inpt.nextFloat();
		System.out.println("Digite sua terceira nota");
		float n3 = inpt.nextFloat();
		float media = ((n1 * 2)/10) + ((n2 * 3)/10) + ((n3 * 5)/10);
		System.out.println(media);
	}
}