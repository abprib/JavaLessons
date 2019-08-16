//Given an array of integers, calculate the fractions of its elements that are positive,
//negative, and are zeros. Print the decimal value of each fraction on a new line.
class PlusMinus {

  // Complete the plusMinus function below.
  static void plusMinus(int[] arr) {
    float neg = 0f;
    float pos = 0f;
    float zer = 0f;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < 0){
          neg++;
      } else if(arr[i] > 0){
          pos++;
      } else {
          zer++;
      }
    }
    System.out.printf("%f%n%f%n%f", pos/arr.length, neg/arr.length, zer/arr.length);
  }

  public static void main(String[] args) {
    int[] arr = {10, -1, -2, 0, 0, 10, 11, 9, 10, -1, 1, 1};

        plusMinus(arr);
    }
}