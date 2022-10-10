public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,4,5,5,6};
        int i;
        int j;
        for(i=0 ; i<arr.length; i++){
            for(j=0; j< arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }

        }
    }
}
