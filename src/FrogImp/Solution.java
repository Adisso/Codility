package FrogImp;

public class Solution {

    public int solution(int X, int Y, int D){
        int difference = Y - X;
        int count = difference / D;
        if(difference % D > 0){
            count++;
        }
        return count;
    }

}
