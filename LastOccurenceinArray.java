public class LastOccurenceinArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,5,11,12,13,14,15,5};
        int target = 5; 
        System.out.println(lastOccurence(arr, target, 0) );
    }
    public static int lastOccurence(int arr[],int target,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,target,i+1);
        if(isFound == -1 && arr[i] == target){
            return i;
        }
        return isFound;
    }
}
