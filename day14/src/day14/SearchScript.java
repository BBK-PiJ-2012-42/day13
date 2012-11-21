/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day14;

import java.util.*;
/**
 *
 * @author tnealo01
 */
public class SearchScript {
    
    public static void main(String[] args) {
        SearchScript myScript = new SearchScript();
        myScript.testList();
    }
    
    public static void testList() {
        ArrayList myList = new ArrayList();
        int old = 0;
        for (int i = 0; i < 1000; i++) {
            old = (int) (old + Math.abs(5 * Math.random()));
            myList.add(i, old);
        }  
        SearchableList searchList = new SearchableList(myList);
        if (searchList.contains(500)) {
            System.out.println("FOUND IT");
        } else {
            System.out.println("NO LUCK");
        }
    }

            
}
