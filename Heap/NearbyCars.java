package Heap;
import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        
        int distSq;
        int idx;

        public Point(  int distSq,int idx){
            
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point s2){
            return this.distSq - s2.distSq;
        }
    }    
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k =2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i =0;i<pts.length;i++)
        {
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(distSq,i));
        }
        //nearest k cars
        for(int i =0 ;i<k;i++)
        {
            System.out.println("C "+pq.remove().idx);
        }
    }
}
