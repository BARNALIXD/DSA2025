public class MinMaxArray{
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        int min = arr[0], max = arr[0];
        for(int num : arr) {
            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println("Min ="+min +",Max ="+max);
    }
}