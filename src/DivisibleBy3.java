import java.util.Scanner;

public class DivisibleBy3 {
    static int isDivisibleBy3(int[] A){
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
        }
        return (sum%3 == 0)?1:0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(isDivisibleBy3(A));
    }
}
