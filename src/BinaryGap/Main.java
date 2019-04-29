package BinaryGap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public int solution(int N){
            String binary = decimalToBinary(N);
            String binaryWithoutLastZeros = deleteIfLastIsZero(binary);
            if(!checkIfStringhasZeros(binaryWithoutLastZeros)){
                return 0;
            }
            List<String> lista = findSeqencesOfZero(binaryWithoutLastZeros);
            String max = findLargestString(lista);
            return max.length();
        }

        private static boolean checkIfStringhasZeros(String string){
            if(string.contains("0")){
                return true;
            }
            return false;
        }

        private static String decimalToBinary(int decimal){
            return Integer.toBinaryString(decimal);
        }

        private static String deleteIfLastIsZero(String binary){
            while(binary.endsWith("0")){
                binary = binary.substring(0, binary.length()-1);
            }
            return binary;
        }

        private static List<String> findSeqencesOfZero(String string){
            String[] oneSeparatedArr = string.split("\\s*1\\s*");
            List<String> result = Arrays.stream(oneSeparatedArr).collect(Collectors.toList());
            return result;
        }

        private static String findLargestString(List lista){
            String max = Collections.max(lista, Comparator.comparing(String::length));
            return max;
        }
}
