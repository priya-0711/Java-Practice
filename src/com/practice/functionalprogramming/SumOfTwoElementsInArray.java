package com.practice.functionalprogramming;

public class SumOfTwoElementsInArray {
    public static void main(String[] args) {
      /*  Example 1:
        Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
        Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
        Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

        Example 2:
        Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
        Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
        Explanation: There exist no such two numbers whose sum is equal to the target.*/

// soln1 with time complexity as o(n*n)

        int arr[] = {2,6,5,8,11}; int target = 14;
       /* boolean result =false;
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++){
                if( (arr[i]+arr[i+1]) == target) {
                    result=true;
                    System.out.println("Yes");
                    break;
                }
            }
            if(result)
              break;
        }
        if(!result)
            System.out.println("No");*/
//--------------------------------------------------------------------------------
        //soln 2 with time complexity o(n) and space complexity o(n*n)

        /*Map<Integer,Integer> map =new HashMap();

        for(int i=0;i<arr.length;i++) {
            int search = target-arr[i];
            if(map.containsKey(search)) {
                System.out.println("Yes");
                return;
            }
            map.put(arr[i],i); //{2=0,6=1,5=2,8=3,11=4}   //13,9,10,7,4
        }
        System.out.println("No");*/
//----------------------------------------------------------------------------------------
        //soln 3 with space complexity as o(1) and time complexity o(n)

        int start=0,end=arr.length-1;

       while(start < end) {
            if(arr[start] + arr[end]< target){
                start++;
            } else if(arr[start]+ arr[end]>target){
                end--;
            } else {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
       //---------------------------------------------------------------------------
    }
}
