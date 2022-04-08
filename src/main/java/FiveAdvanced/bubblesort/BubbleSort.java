package FiveAdvanced.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {12, 8, 45, 92, 14, 157, 333, 33, 199,4};
        System.out.println("Prije sortirnja: " + Arrays.toString(numbers));

        for (int i=0; i<numbers.length-1; i++){
            boolean foundIt = false;
            for(int j=0; j<numbers.length-i-1; j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    foundIt = true;

                }
            }
            if(!foundIt){
                break;
            }

        }
        System.out.println("Poslije sortiranja:" + Arrays.toString(numbers));
    }
}
