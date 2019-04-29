package PermCheck;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int solution(int[] A){
        TreeSet<Integer> allNumbersFromArray = new TreeSet<>();
        for(int number : A){
            allNumbersFromArray.add(number);
        }
        if((allNumbersFromArray).last() > allNumbersFromArray.size()){
            return 0;
        }
        return 1;
    }
}
