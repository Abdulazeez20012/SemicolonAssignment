import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
       
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};

        
        System.out.println("Original Array 1:");
        System.out.println(Arrays.toString(array1));
        System.out.println("Original Array 2:");
        System.out.println(Arrays.toString(array2));

        
        System.out.println("Intersection:");
        findIntersection(array1, array2);
    }

    
    public static void findIntersection(int[] array1, int[] array2) {
        
        boolean[] found = new boolean[array1.length];

        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j] && !found[j]) {
                    System.out.print(array2[i] + " ");
                    found[j] = true; 
                }
            }
        }
    }
}



