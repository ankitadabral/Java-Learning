package arrays;

public class array_2D {
    public static void main(String[] args) {
        //A 2D array in Java is an array of arrays. It is commonly used to represent tables, matrices, grids, or game boards.
        // Example Syntax
        int[][] a = new int[3][3];
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //OR nums[0][0] = 1;  nums[0][1] = 2;........

        // EXAMPLE : Print above mentioned 2D array
        for(int i = 0; i<nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) { // here we have used nums[i].length because it will count total indexes present in that row it means total columns
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }

        // EXAMPLE : Reverse above mentioned 2D array
        for(int I =nums.length-1; I>=0; I--){
            for(int J = nums[I].length-1; J>=0; J--){
                System.out.print(nums[I][J] + " ");
            }
            System.out.println();
        }



    }

}
