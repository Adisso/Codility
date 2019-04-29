package MinAvgTwoSlice;

public class Solution {
    public int solution(int[] A) {
        int minIndex = 0;
        int slice = 2;
        double minAverage = ((A[0]+A[1])/slice);

        for(int i = 0; i < A.length-1; i++){
            double average = ((A[i]+A[i+1])/slice);
            if(minAverage > average){
               minAverage = average;
               minIndex = i;
            }
        }
        slice = 3;
        for(int i = 0; i < A.length-2; i++){
            double average = ((A[i]+A[i+1]+A[i+2])/slice);
            if(minAverage > average){
                minAverage = average;
                minIndex = i;
            }
        }
        slice = 4;
        for(int i = 0; i < A.length-3; i++){
            double average = ((A[i]+A[i+1]+A[i+2]+A[i+3])/slice);
            if(minAverage > average){
                minAverage = average;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
