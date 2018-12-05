package Enumeration.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> subsets(int[] S){
        List<List<Integer>> st = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        st.add(a);
        if (S.length   == 0)
            return st;
        Arrays.sort(S);
        int start = 0;
        boolean[] visited = new boolean[S.length+1];
        for (int  len = 1;len<= S.length;len++){
            searchName(start,len,S,st,a,visited);
        }
        return st;
    }
    public static void searchName (int start ,int len,int[] S,List<List<Integer>> st, List<Integer> a, boolean[] visited){
        if (a.size() == len){
            st.add(new ArrayList<>(a));
            return;
        }
        for (int i = start;i<S.length;i++){
            if (!visited[i]){
                a.add(S[i]);
                visited[i] = true;
                searchName(i,len,S,st,a,visited);
                a.remove(a.size()-1);
                visited[i] = false;
            }
        }
    }
}
