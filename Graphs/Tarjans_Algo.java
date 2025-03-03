
package Graphs;

import java.util.*;
public class Tarjans_Algo {
	static HashMap<Integer,List<Integer>> adj = new HashMap<>();
    static int Disc[] = new int[8];
    static int Low[] = new int[8];
    static boolean inStack[] = new boolean[8];
    static Stack<Integer> stack = new Stack<>();
    static int time = 0;

    static void DFS(int u){
        Disc[u] = time;
        Low[u] = time;
        time++;
        stack.push(u);
        inStack[u] = true;
        List<Integer> temp = adj.get(u);
        if(temp == null){
            return;
        }
        for(int v : temp){
            if(Disc[v] == -1){
                DFS(v);
                Low[u] = Math.min(Low[u],Low[v]);
            }
            else if(inStack[v]){
                Low[u] = Math.min(Low[u],Disc[v]);
            }
        }
        if(Low[u] == Disc[u]){
            System.out.print("SSC is: ");
            while(stack.peek() != u){
                System.out.print(stack.peek()+" ");
                inStack[stack.peek()] = false;
                stack.pop();
            }
            System.out.println(stack.peek());
            inStack[stack.peek()] = false;
            stack.pop();
        }
    }
    static void findSCCs_Tarjan(int n ){
        for(int i =0;i<=n;i++){
            Disc[i] = -1;
            Low[i] = -1;
            inStack[i] = false;
        }
        for(int i = 1;i <= n ;i++){
            if(Disc[i] == -1){
                DFS(i);
            }
        }
    }
    public static void main(String[] args) {
        adj.put(1,new ArrayList<Integer>());
        adj.get(1).add(3);
        adj.put(2,new ArrayList<Integer>());
        adj.get(2).add(1);
        adj.put(3,new ArrayList<Integer>());
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.put(4,new ArrayList<Integer>());
        adj.get(4).add(5);
        adj.put(5,new ArrayList<Integer>());
        adj.get(5).add(6);
        adj.put(6,new ArrayList<Integer>());
        adj.get(6).add(7);
        adj.put(7,new ArrayList<Integer>());
        adj.get(7).add(4);

        findSCCs_Tarjan(7);
    }
}
