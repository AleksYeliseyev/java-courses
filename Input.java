import java.util.Scanner;

public class Input{

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input x: ");

		int x = scan.nextInt();

		System.out.print("Input y: ");

		int y = scan.nextInt();

		boolean work = true;
		int result = 0;


		while(work){
			System.out.println("1 - sum\n2 - diff\n0 - exit");
			int inp = scan.nextInt();
			switch (inp){
				case (1):
					result = calc.sum(x, y);
					break;
				case (2):
					result = calc.diff(x, y);
					break;
				default:
					System.out.println("EXIT");
					work = false;
					break;
			}
			System.out.println("RESULT: " + result);
		}
	}
}