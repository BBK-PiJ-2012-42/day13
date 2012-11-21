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
public class SearchableList {
    ArrayList myList = new ArrayList();
    
    SearchableList(ArrayList myList) {
        this.myList = myList;
    }
    
    private ArrayList binSearch(ArrayList aList, int value) {
        if ((int) aList.get(aList.size()/2) < value) {
            return binSearch( (ArrayList) aList.subList(aList.size()/2, aList.size()), value);
        } else {
            return binSearch(  (ArrayList) aList.subList(0, aList.size()/2), value);
        }

    }
    
    public boolean contains(int value) {
        if (binSearch(myList, value).get(0) == value) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
