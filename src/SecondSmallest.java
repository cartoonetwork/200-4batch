import java.util.Arrays;

public class SecondSmallest {
    public static void main(String args[])
    {
        int arr[]={111, 13, 25, 9, 34, 1};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("smallest element is "+arr[0]);
        System.out.println("second smallest element is "+arr[1]);
    }
}

