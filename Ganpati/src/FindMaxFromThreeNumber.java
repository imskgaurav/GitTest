public class FindMaxFromThreeNumber {

    public static void main(String[] args) {

        int maxInt = maxFromThreeNumber(77, 800, 67);

        System.out.println(maxInt);

        int arr[] = {10, 324, 45, 90, 9808};
       int greatOne= largest(arr);

       System.out.println(greatOne);

    }

    public static int maxFromThreeNumber(int a, int b, int c) {

        int max = 0;

        max = Math.max(Math.max(a, b), c);

        return max;
    }

    static int largest(int arr[]) {
        int i;
        int max = arr[0];

        for(i=1; i<arr.length; i++){

            if(arr[i]>max){

                max = arr[i];


            }


        }

        return max;
    }

}
