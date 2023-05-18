

// Forest Fire Problem 
/*
Sample TestCase 1
Input
5 4
1 3 2 4 5
Output
2
*/


public class ForestFire {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello ");
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0; // Counter for counting the valid energy levels
		int dec = -1; // Decision Variable
		for (int j = 0; j < N; j++) {
			int temp = arr[j];
			for (int k = 0; k < N; k++) {
				if (temp <= arr[k]) {
					count++;
				}
			}
			if (count == X) {
				dec = 1;
				System.out.print(temp);
				break;
			}
			count = 0;
		}
		if (dec == -1) {
			System.out.print(dec);
		}
		sc.close();
	}
}
