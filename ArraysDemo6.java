package Class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
        //write a program that can tell us how many  times the number 10.5 in present in the array
        double[] arr={10.5,12.0,45,10.5,23,10.5};
         int count=0;
         for (int i=0; i<arr.length;i++){
             if (arr[i]==10.5){
                 count++;//can also be written as count=count+1
             }
         }
        System.out.println(count);



    }
}
