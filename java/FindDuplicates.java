import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 9, 5, 3, 1};

       
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));

        
        System.out.println("Duplicate Elements:");
        findDuplicates(array);
    }

    
    public static void findDuplicates(int[] array) {
        
        int[] frequency = new int[array.length];

       
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = -1;
        }

    
        for (int i = 0; i < array.length; i++) {
            int index = array[i] - 1; 
            if (index >= 0 && index < frequency.length) {
                if (frequency[index] == -1) {
                    frequency[index] = 1; 
                } else {
                    frequency[index]++; 
                    System.out.print(array[i] + " "); 
                }
            }
        }
    }
}

