import java.util.Random;

public class TestDemo {
	
	public static void main(String args) {
		
		
	}
	
	public int addPositive(int a, int b) {
		int sum = a + b;
		
		if(a > 0 && b > 0) {
			return sum;
		} else if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
		return sum;
	}
	
	int randomNumberSquared(){
		int num = getRandomInt();
		
		return num^2;
	}
	
	int getRandomInt() {
		Random random = new Random();
		
		return random.nextInt(10) + 1;
	}

}
