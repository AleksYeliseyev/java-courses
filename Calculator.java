public class Calculator {
	//Результат вычисления
	private int result;

	//Суммируем аргументы
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}

	//Вычитаем аргументы
	public void sub(int a, int b){
			this.result = a - b;
		}

	//Умножаем аргументы
	public void mult(int a, int b){
			this.result = a * b;
	}

	//Делим аргументы
	public void div(int a, int b){
		this.result = a / b;
	}

	//Получить результат
	public int getResult(){
		return  this.result;
	}

	//Очистить результат вычисления
	public void cleanResult(){
		this.result = 0;
	}

}