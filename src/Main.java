public class Main {
    public static void main(String[] args) {

        int[][] array = {{2,3},{2,4},{1,5}};
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3},{1,5,3},{6,7,8}};
        System.out.println(isThereDuplicates(array) + " " + isThereDuplicates(array1) + " " + isThereDuplicates(array2));
    }
    public static boolean isThereDuplicates(int[][] array) {
        int count;
        for(int c = 0; c < array[0].length; c++) {
        for(int r = 0; r < array.length; r++) {
            int temp = array[r][c];
            count = 0;
            for(int i = 0; i < array.length; i++) {
                if(temp == array[i][c]) {
                    count++;
                }
                if(count > 1) {
                    return true;
                }

            }
        }
        }
        return false;
    }
}

