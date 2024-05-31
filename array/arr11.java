// //most repeated number in an array 
// //input arr=3,2,3,4,2,3,4,3
// public class arr11 
// {
//     public static void main(String[] args)
//     {
//         int []arr={3,2,3,4,2,3,4,4};
//         int n =arr.length;
//         int count=0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                      count=arr[i];
//                 }
//             }
//         }
//         System.out.println(count);

//     }
// }
public class arr11 {
    public static void main(String[] args) {
        int[] array = {3,2,3,4,2,3,4,4};
        
        int mostRepeatedNumber = findMostRepeatedNumber(array);
        
        if (mostRepeatedNumber != -1) {
            System.out.println("Most repeated number: " + mostRepeatedNumber);
        } else {
            System.out.println("No repeated numbers found.");
        }
    }
    
    public static int findMostRepeatedNumber(int[] array) {
        int mostRepeatedNumber = -1;
        int maxCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int currentCount = 1;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == currentNumber) {
                    currentCount++;
                }
            }
            
            if (currentCount > maxCount) {
                mostRepeatedNumber = currentNumber;
                maxCount = currentCount;
            }
        }
        
        return mostRepeatedNumber;
    }
}
