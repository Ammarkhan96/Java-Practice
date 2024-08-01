import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ARRAYS:
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
        //Now what if we add invalid index let's say 10
//        numbers[10] = 3;
//        System.out.println(numbers);

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));

//        int[] numbers = { 2, 3, 5, 1, 4 };
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

//        int[] numbers = { 2, 3, 5, 1, 4 };
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));



        //MULTI-DIMENSIONAL ARRAYS:

//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
////        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers = { {1, 2, 3}, {4, 5, 6} };
           System.out.println(Arrays.deepToString(numbers));
    }
}