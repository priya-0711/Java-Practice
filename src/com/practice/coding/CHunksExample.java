package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHunksExample {
    public static void main(String[] args) {
     //   chunk([1,2,3,4,5,6],3)-->[[1,2,3],[4,5,6]]
     //   chunk([1,2,3,4,5,6,7],2)-->[[1,2],[3,4],[5,6],[7]]
        int batch =3;int count=0;
        List<Integer> chunk = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<chunk.size();) {
            List<Integer> alist = new ArrayList<>();
            while(i < count+batch && i<chunk.size()) {
                alist.add(chunk.get(i));
                i++; //1
            }
            count=count+batch;
            res.add(alist);
        }
        System.out.println(res);
    }
}
