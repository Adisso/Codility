package OddOccurencesInArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int[] A){
        return findNonZero(replaceDuplicatesToZeros(A));
    }

    private int[] replaceDuplicatesToZeros(int[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if((A[i]==A[j]) && (A[i]!=0)) {
                    A[i] = 0;
                    A[j] = 0;
                }
            }
        }
        return A;
    }

    private int findNonZero(int[] A){
        List<Integer> lista= new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            lista.add(A[i]);
        }
        for(int i = 0; i < lista.size(); i++){
           if(lista.get(i) != 0){
               return lista.get(i);
           }
        }
        return 0;
    }
}
