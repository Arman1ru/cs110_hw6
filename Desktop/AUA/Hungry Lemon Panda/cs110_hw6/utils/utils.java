package utils;

public class Math {
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static int factorialLoop(int num) {
		int lem = 1;
		while (num > 0) {
			lem *= num;
			num--;
		}
		return lem;
	}
}