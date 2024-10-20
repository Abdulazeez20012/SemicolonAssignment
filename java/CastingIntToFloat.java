
public class CastingIntToFloat {
    public static void main(String[] args) {
        System.out.println("Int Point Numbers\tCast to Float");

        int[] floatNumbers = {1, 2, 3, 4, 5};

        for (int num : intNumbers) {
            int castedNum = (int) num;
            System.out.println(num + "\t\t\t" + castedNum);
        }
    }
}

