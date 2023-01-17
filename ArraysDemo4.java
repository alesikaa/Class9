package Class9;

public class ArraysDemo4 {
    public static void main(String[] args) {
// create an empty array then store 45 44 33 20 and 10 in it then use as a loop
        // to add all the elements which are present in even indexes and print it after adding them
        int[] numbers = new int[5];
        numbers[0] = 45;// 45+0
        numbers[1] = 44;
        numbers[2] = 33;//45+33=>78
        numbers[3] = 20;
        numbers[4] = 10;//78+10

        int total = 0;
        // numbers[5]=50; error out bounds
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                total = total + numbers[i];
            }
        }
        System.out.println(total);

    }
}

