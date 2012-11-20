/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author tom
 */
public class Day13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       printNumbers(6);
    }
    
    
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }
}
