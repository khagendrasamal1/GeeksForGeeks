class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int largest = arr[0];
        int second = -1;
        
        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            }else if(num > second && num < largest){
                second = num;
            }
        }
        return second;
    }
}