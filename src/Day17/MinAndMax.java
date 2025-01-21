package Day17;

public class MinAndMax {
    public static int minimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;
    }
    public static int maximum ( int[] numbers){
        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] numbers= {2,9,1,3,9,7,0,1, 2, 3, 4 ,4 ,5 ,9};
        System.out.println(minimum(numbers));
        System.out.println(maximum(numbers));
    }
}







