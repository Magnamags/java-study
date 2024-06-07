package Arrays;


public class findelement {
    public static void main(String[] args) {
        String[] arr = new String[]{"one", "two", "three", "four", "five", "six"};
        String tofind = "seven";
        boolean value = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(tofind)) {

                    System.out.println("Found on index " + i);
                    value = true;
                    break;
            }

        }
        if(value==false){
            System.out.println("Element not found");
        }
    }
}
