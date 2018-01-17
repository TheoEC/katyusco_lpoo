import java.util.Scanner;
public class ex01{
	public static void main(String[] args){
		Scanner tst = new Scanner(System.in);
		System.out.println("Digitem um valor em m/s");
		float metros = tst.nextFloat();
		metros = (float)metros * (float)3.6;
		System.out.println(metros);
	}
}