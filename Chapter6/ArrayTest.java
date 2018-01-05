public class ArrayTest
{
    
    
    public static void main (String[]args) {
        int[][] arr1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] arr2 = {{1, 2, 3}, {5, 6, 7}, {10, 13, 22}};
        
        int[][] squared = ac.squareArray(arr2);
        System.out.println();
        for (int[] row : squared) {
            for (int[] num : row) {
                System.out.print(nums + ", ");
            }
            System.out.println();
        }
    }
    
    
}
