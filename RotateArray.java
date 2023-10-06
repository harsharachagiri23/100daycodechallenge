// Rotate array by k times

// brute-force approach --O(k*n)

// optimized solution --O(n+n+n) --O(3n) --O(n) as reverse method logic is called 3 times

//output: Before rotate: 1 2 3 4 5 After rotate: 4 5 1 2 3  , when k=3
public class RotateArray {
//    public static void rotateArray(int [] arr){
//        int temp = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            arr[i-1] = arr[i];
//            arr[i] = temp;
//        }
///    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void rotate(int [] arr, int k){
            k = k%arr.length; //modulo while rotating the array
            if(k<0){
                k = k + arr.length;
            }
//            for(int i = 1; i<=k; i++){
//                rotateArray(arr);
//            }
        reverse(arr, 0, k-1);
            reverse(arr, k, arr.length-1);
            reverse(arr, 0,arr.length-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print("Before rotate: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " " );
        }
        rotate( arr,3);
        System.out.print("After rotate: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}
