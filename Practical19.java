public class Practical19 {
    public static void main(String[] args) {
        int arr[] = {12,65,34,98,33,77};
        int toFind = 33;
        int answer = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == toFind){
                System.out.println("Index of " + toFind + " in array : "+ i);
                answer = i;
                break;
            }
        }

        if (answer < 0 ){
            System.out.println("Not Found");
        }
    }
}
