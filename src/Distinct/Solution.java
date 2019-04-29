package Distinct;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int[] unique = Arrays.stream(A).distinct().toArray();
        return unique.length;
    }
}
