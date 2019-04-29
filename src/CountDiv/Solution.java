package CountDiv;

public class Solution {

    public int solution(int A, int B, int K) {
        int first = B / K;
        int second = A / K;
        if(A % K == 0){
           return first - second +1;
        }

        return first - second;
    }
}
