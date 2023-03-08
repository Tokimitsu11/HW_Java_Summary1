package Colletcions;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] number = {9,9,9};
        for (int i = number.length-1; i >= 0; i--) {
            if(number[i] !=9){
                number[i] = number[i]+1;
                break;
            } else {
                number[i] = 0;
            }
        }
        if(number[0] == 0){
            int[]array = new int[number.length+1];
            array[0] = 1;
            number = array;
        }
        System.out.println(Arrays.toString(number));
    }
}
