package random;

public class ArraySumCloset {

    public static void main(String[] args) {
        int arr[] =  {1, 3, 4, 7, 10}, x = 15;
       addition(arr,x);
    }

    private static void addition(int[] arr, int x) {
        int leftI =  0, rightI = 0;
        int left  = 0,  right  = arr.length-1;
        int diff = Integer.MAX_VALUE;
        while (left<right) {
            if(Math.abs(arr[left] + arr[right] - x) < diff) {
                leftI = left;
                rightI = right;
                diff = Math.abs(arr[left] + arr[right] - x);
                left++;
            }
            else
                right--;
        }
        System.out.println(String.format("left index %s and right index %s", arr[leftI], arr[rightI]));

    }

}
