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
        if (aList.get(aList.size()/2) < value) {
            return (ArrayList) aList.subList(aList.size()/2, aList.size());
        } else {
            return (ArrayList) aList.subList(aList.size()/2, aList.size());
        }
        return aList;
    }
    
    public boolean contains(int value) {
        return true;
    }
    
}
