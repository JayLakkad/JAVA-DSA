//LEETCODE 42. Trapping Rain Water-I
//Auxillary Arrays are used
//Auxillary Arrays are the helper arrays that are used to store the intermediate results of the problem


public class TrappingRainwater{
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate the left max boundary array
        int []leftMax = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        //calculate the right max boundary array
        int []rightMax = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int totalwater=0;
        int []trappedwater = new int[n];
        for(int i =0;i<n;i++){
            trappedwater[i]=(Math.min(leftMax[i],rightMax[i]))-height[i];
            totalwater += trappedwater[i];
        }
       
        return totalwater;
        //loop
        //waterlevel = min(leftmaxboundary,rightmaxboundary)
        //trappedwater = waterlevel - height[i]
    }
    public static void main(String[] args) {
        int height[]= {2,7,6,9,0,1,4,2,10};
        System.out.println("The total trapped water is "+trappedRainwater(height));
    }
}   