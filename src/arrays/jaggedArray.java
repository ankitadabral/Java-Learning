package arrays;

public class jaggedArray {
    public static void main(String[] args){
        //A jagged array is a 2D array where each row can have a different number of columns.

        //Initialisation way 1
        char[][] arr = {
                {'a', 'b'},
                {'c', 'd', 'e'},
                {'f', 'g', 'h', 'i'}
        };

        //Initialisation WAY 2
        char[][] Arr = new char[3][];

        Arr[0] = new char[2];
        Arr[1] = new char[3];
        Arr[2] = new char[4];

        // EXAMPLE For printing above
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
