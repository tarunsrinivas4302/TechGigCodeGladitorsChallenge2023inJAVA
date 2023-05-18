
// MAGICWAND Problem
/*
Sample TestCase 1
Input
5 3
1 2 3 4 5
5 2 1
Output
10 7 10
*/

public class MagicWand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.print("Enter The Size Of an Array : ");
        int[] arr = new int[N];
        System.out.print("Enter the Array Elements : ");
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[M];
        for(int i = 0; i < M; i++) {
            queries[i] = sc.nextInt();
        }
        int cost = 0;
        for(int i = 0; i < M; i++) {
            int temp_q = queries[i];
            for(int j = 0; j < N; j++) {
                int temp = arr[j] - temp_q;
                if(temp < 0) {
                    temp = temp*-1;
                }
                cost = cost + temp;
            }
            System.out.print(cost + " ");
            cost = 0;
        }
        sc.close();
    }
}
