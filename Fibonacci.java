/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author tom
 */
public class Fibonacci {
    
    public static int simpleFib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
        int result = simpleFib(n-1) + simpleFib(n-2);
            return result;
        }
    }
    
    // arrays are 0-based, so F(1) is stored at position 0, etc
    private int[] precalculated = null;
    
    public void resetArray() {
        precalculated = null;
    }
    
    public int memoFib(int n) {
        if (precalculated == null) {
            initPrecalculatedArray(n);
        }
        if (precalculated[n-1] != -1) {
            return precalculated[n-1];
        } else {
            int result = memoFib(n-1) + memoFib(n-2);
            precalculated[n-1] = result;
            return result;
        }
    }
    
    private void initPrecalculatedArray(int size) {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1; // to indicate "not calculated yet"
        }
            precalculated[0] = 1; // F(1)
            precalculated[1] = 1; // F(2)
    }
    
}
