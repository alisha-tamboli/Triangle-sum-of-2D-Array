public class TriangleSum {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4,5}, 
            {6,7,8,9,10}, 
            {11,12,13,14,15}
            {16,17,18,19,20},
            {21,22,23,24,25} 
         };

        // sum of upper rigth triangle
        int sum1 = 0;
        for(int i=0; i<arr.length; i++) {
           for(int j=i; j<arr[0].length; j++) {
            sum1 += arr[i][j];
           }
        }
        System.out.println("Sum of UR triangle is : " + sum1);

         //Sum of Upper left triangle
         int sum2 = 0;
         for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length - i; j++) {
                sum2 += arr[i][j];
            }
         }
         System.out.println("The sum Upper left triangle is : " + sum2);

        //Sum of lower left triangle
        int sum3 = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<=i; j++) {
                sum3 += arr[i][j];
                }
          }
         System.out.println("The sum of lower left triangle is : " + sum3);

        //Sum of lower right triangle
        int sum4 = 0; 
        for( int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {

                if(arr[0].length >= arr.length){
                    if(i+j >= arr[0].length-1 ) {
                        sum4 += arr[i][j];
                    System.out.println("arr[i][j] : " + arr[i][j] + " sum :" + sum4);
                }
            }
                else if(arr.length > arr[0].length){
                    if((i+j) >= arr.length-1){
                        sum4 += arr[i][j];
                    System.out.println("arr[i][j] : " + arr[i][j] + " sum :" + sum4);
                   }
                }
            }
        }

    }
}
