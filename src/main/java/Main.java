import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
            for (i = 0; i <= n; i++){
                sum += i;
            }
        System.out.println(sum);
    }

    }

    // for Extra Credit
    //int gaussianSumOfNumbers(int n)
        //return 0;
   
    // for Extra extra credit - compare the methods and show which one is faster

