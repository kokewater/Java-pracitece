
public class Chapter08 {
	public static void main(String[] args) {
//		問題１
		int num = 1;
		while(num<5) {
			System.out.println(num*num);
			num++;
		}
		
//		問題２
		int[] array = { 10, 21, 30, 41 };
		for (int i= 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
//		問題3
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
