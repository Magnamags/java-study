package Arrays;

public class smallest {
    public static void main(String[] args) {
      int[]arr = new int[]{24,25,4,14,};
         int val= arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]<val)
            val=arr[i];
    }
        System.out.println("The smallest element is : "+ val);

    }
}
