public class HourglassSum {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1,0,0,0},{1,1,1,0,0,0},{1,0,1,2,0,1},{0,0,0,4,2,2},{0,0,0,4,0,4},{0,0,0,0,0,0}};
        printArray(arr);
        int maxSum = 0;
        for(int j = 0; j < arr.length - 2; j++){
            for(int i = 0; i < arr.length - 2; i++){
                System.out.printf("%4d", hgSum(arr, i, j));
                if(hgSum(arr, i, j) > maxSum){
                   maxSum = hgSum(arr, i, j);
                }
            }
            System.out.println("");
        }
        System.out.println(maxSum);
    }

    static int hgSum(int[][] arr, int x, int y){
        int sum = 0;
        for(int i = x; i < x + 3; i++){
            sum += arr[i][y];
            sum += arr[i][y + 2];
        }
        sum += arr[x + 1][y + 1];
        return sum;
    }

    static void printArray(int[][] arr){
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length; i++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println("");
        }
    }
}


//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0