/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author tom
 */
public class FibonacciTest {

    
    public static void main(String[] args) {
        FibonacciTest test = new FibonacciTest();
        test.launch();
    }
    
    public void launch() {
        Fibonacci myFib = new Fibonacci();
        System.out.println("Simple 40:");
        System.out.println(myFib.simpleFib(40));
        System.out.println("Memoized 40:");
        System.out.println(myFib.memoFib(40));
        
        myFib.resetArray();
        
        System.out.println("Simple 45:");
        System.out.println(myFib.simpleFib(45));
        System.out.println("Memoized 45:");
        System.out.println(myFib.memoFib(45));
    }
    
}
