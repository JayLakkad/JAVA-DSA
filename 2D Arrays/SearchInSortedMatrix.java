
public class SearchInSortedMatrix {
    public static boolean SortedMatrix(int [][]arr,int key)//staircase search
    {
       
        int m = arr[0].length;
        int row = 0;
        int col = m-1;
        
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key)
            {
                System.out.print("found key at("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
            }
            System.out.println("Element not found");
            return false;
        }

    
    public static void main(String[] args) {
        int [][]matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 35;
        System.out.println(SortedMatrix(matrix,target));
    
    }
}
//Time Complexity = O(n+m)
