import 两数之和.Two_nums;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a =new int[]{1,2,3,4};
        int b = 5;
        Two_nums twoNums = new Two_nums();
       int [] x = twoNums.twoSum(a,b);
        System.out.println(x[0]);
        System.out.println(x[1]);

    }
}