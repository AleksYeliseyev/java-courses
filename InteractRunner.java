import java.util.Scanner;

public class InteractRunner{

	public static void main(String[] arg){
		Scanner reader = new Scanner (System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "n";
			String clean = "n";
			while (!exit.equals("y")){
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter + - * / : ");
				String solve = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				
				switch (solve) {
					case("+"):
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case("-"): 
						calc.sub(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case("*"): 
						calc.mult(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case("/"): 
						calc.div(Integer.valueOf(first), Integer.valueOf(second));
						break;
					default:
						System.out.println("ERROR");
						solve = "";
				}
				
				System.out.println("Result : " + calc.getResult());
				System.out.println("Clean Result? (y/n) : ");
				clean = reader.next();
				if (clean.equals("y")){
					calc.cleanResult();
					clean = "n";
					System.out.println("Result : " + calc.getResult());
				} else {
					System.out.println("Result not cleaned");
				}
				System.out.println("Exit (y/n) : ");
				exit = reader.next();
			}
		} finally{
			reader.close();
		}
	}
}