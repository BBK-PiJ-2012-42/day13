/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author tom
 */
public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(iterativeFactorial(10));
    }
    
    
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorial(n-1);
            return result;
        }
    }
    
    public static int iterativeFactorial(int n) {
        int sum = n;
        for ( int i = n-1; i > 1; i--) {
            sum = sum * i;
        }
        return sum;
    }
}
