import java.util.*; 

class RotatingArray {
    public static void main(String args[] ) throws Exception {

        Scanner input = new Scanner(System.in); // creating a scanner for the inputs

        int textCases = input.nextInt(); // taking int as a input

        for (int i = 0; i < textCases; i++){
            int numArr = input.nextInt();
            int rotatesteps = input.nextInt();

            // here is how to take arrays as an input in java
            int arr[] = new int[numArr];
            for (int j = 0; j<numArr; j++){
                int temp = input.nextInt();
                arr[j] = temp;
            }
            System.out.println(arr);

            // calling the rotating function for rotateSteps time
            for (int j = 0; j<rotatesteps; j++){
                arr = rotate(arr);
            }

            printArr(arr); // calling a function which prints the array without any brakates
            
        }
        
        input.close(); // make sure to close the scannner input
    }

    // method which prints an array with out any bracket or comma
    public static void printArr(int arr[]){
        String stringArr = Arrays.toString(arr).replace(",","").replace("[", "").replace("]", "").trim();
        System.out.println(stringArr);
    }

    // method which rotates the array in one step
    public static int[] rotate(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        return arr;
    }
}
