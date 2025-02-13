public class Max_Min_SagementTree {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int i , int si,int sj,int arr[]){
        if(si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si+sj)/2;//si+(si-sj)/2
        buildST(2*i+1, si, mid, arr);
        buildST(2*i+2, mid+1, sj, arr);
        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);

    }
    public static int getMax(int arr[], int qi,int qj){
        int n = arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }
    public static int getMaxUtil(int i,int si, int sj,int qi,int qj){
        if(si>qj || sj<qi){//no overlap
            return Integer.MIN_VALUE;
        }
        else if(si >= qi && sj <= qj){//complete overlap
            return tree[i];
        }
        else{//partial overlap
            int mid = (si+sj)/2;
            int leftans = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightans = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftans,rightans);
        }
    }
    public static void update(int arr[] , int idx ,int newVal){
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, newVal);
    }
    public static void updateUtil(int i,int si,int sj,int idx,int newVal){
        if(idx< si || idx>sj){//no overlapping
            return;
        }
        tree[i] = Math.max(tree[i],newVal);
        if(si != sj){

            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(0, 0, n-1, arr);
        // for(int i =0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        int max = getMax(arr,2,5);
        System.out.println(max);

        update(arr, 2, 20);
         max = getMax(arr,2,5);
        System.out.println(max);
    }
}
