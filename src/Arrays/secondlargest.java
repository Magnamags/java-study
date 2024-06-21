package Arrays;

public class secondlargest {
    public static void main(String[] args) {
       int largest;
       int arr[] = new int[] {2,3,4,5,6,7};


       for(int i=0;i<arr.length;i++){
           for(int j= i+1; j<arr.length;j++){
           if (arr[i]>arr[j]){
               largest =arr[i];
               arr[i] =arr[j];
               arr[j]=largest;
           }

           }

       }
        System.out.println("The second largest value is: "+arr[arr.length-2]);
    }
}
