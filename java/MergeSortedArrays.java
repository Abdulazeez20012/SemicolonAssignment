public class MergeSortedArrays {
    public static void main(String[] args) {
      
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        
        System.out.println("Original Array 1:");
        printArray(array1);
        System.out.println("Original Array 2:");
        printArray(array2);

        
        int[] mergedArray = mergeSortedArrays(array1, array2);

      
        System.out.println("Merged Array:");
        printArray(mergedArray);
    }

    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

   
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length]; 
        int i = 0; 
        int j = 0; 
        int k = 0;

       
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++]; 
            } else {
                mergedArray[k++] = array2[j++]; 
            }
        }

        
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

       
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}

