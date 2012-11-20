/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author tom
 */
public class Hanoi {
    
    public static int move = 0;
    
    public static void main(String[] args) {
        solve(7, "A", "B", "C");
        System.out.println(move);
    }
    
    public static void solve(int n, String start, String middle, String end) {
        if (n == 0) { 
        } else {
            solve(n-1, start, end, middle);
            move++;
            System.out.println("Move from "+start+" to "+end);
            solve(n-1, middle, start, end);
        }
    }
}
