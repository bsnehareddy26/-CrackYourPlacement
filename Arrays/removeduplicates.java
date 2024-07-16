import java.util.Arrays;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Read the elements of array
        System.out.print("Enter the array elements: ");
        for(int i =0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //call the function
        int k = removeduplicates(arr);
        for(int i =0; i < k;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static int  removeduplicates(int[] arr) {
        //the edge call if the sizeof the array 0 then return 0
        if(arr.length == 0)
        return 0;
        //first pointer is 1 -- because 0th ele is always unique
        int j = 1;
        for(int i =1; i < arr.length;i++) {
            if(arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j; //return the array size after removing the duplicates
    }  
}
