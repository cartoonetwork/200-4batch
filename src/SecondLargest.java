import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {5, 7, 8};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
            for (int i = 0; i< a.length; i++){
                System.out.println("second largest element" + a[1]);
            }
        }
    }
