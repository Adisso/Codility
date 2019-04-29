package PermMissingElem;

public class Solution {
    public int solution(int[] A){
        int number = 1;
        while(true){
            if(!checkIfContains(A, number)){
                return number;
            }
            number++;
        }
    }

    public boolean checkIfContains(int[] A, int number){
        for(int i = 0; i < A.length; i++){
            if(A[i] == number ){
                return true;
            }
        }
        return false;
    }

}
