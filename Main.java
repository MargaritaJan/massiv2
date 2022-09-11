import java.util.Random;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random =new Random();
    int[] arr = new int[30];
    for (int i =0; i < arr.length; i++) {
        arr[i] = random.nextInt(100_000) + 100_000;
    }
    return arr;
    }
    public  static  void  main(String []args) {
        var salsries = generateRandomArray();
        int sum = 0;
        for (var salary : salsries) {
            sum += salary;

        }

        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }
}