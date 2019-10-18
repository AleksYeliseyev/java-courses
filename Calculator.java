public class Calculator {

	int x;
	int y;

	public int sum(int x, int y){
		this.x = x;
		this.y = y;
		return (x + y);
	}

	public int diff(int x, int y){
		this.x = x;
		this.y = y;
		return (x - y);
	}

}