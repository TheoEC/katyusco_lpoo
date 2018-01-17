import java.util.Scanner;
public class ex09{
		public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		System.out.println("Digite seus numeros");
		Float x1 = inpt.nextFloat(), x2 = inpt.nextFloat(), menor, maior;
		if(x1 > x2){
			maior = x1;
			menor = x2;
		} else {
			maior = x2;
			menor = x1;
		}
		int impares = 0, pares = 0;
		Float soma = x1 + x2;
		System.out.println("soma: " + soma);
		while(maior > (menor+1)){
			if((maior - 1)%2 != 0){
				impares += 1;
			} else {
				pares += 1;
			}
			maior = maior - 1;
		}
		System.out.println("Impares: " + impares + ". Pares: " + pares);
	}
}