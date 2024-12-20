public class FirstOccurenceinArray {
    public static void main(String[] args) {
        int [] arr = {8,3,6,9,5,10,2,5,3};
        int target = 5;
        System.out.println(findFirstOccurence(arr,target,0));
    }
    public static int findFirstOccurence(int []arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;

        }
        return findFirstOccurence(arr, target, i+1);
    }
}
