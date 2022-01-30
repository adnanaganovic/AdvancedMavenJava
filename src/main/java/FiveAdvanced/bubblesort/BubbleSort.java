package FiveAdvanced.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {234, 8, 45, 92, 14, 157, 333, 33, 199,4};
        System.out.println("Prije sortirnja: " + numbers);

        for (int i=0; i< numbers.length; i++){
            for(int j=0+1; j< numbers.length-i-1; j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
    }
}
