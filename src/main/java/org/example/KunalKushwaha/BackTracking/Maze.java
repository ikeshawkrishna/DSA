package org.example.KunalKushwaha.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(backTracking("",3,3));
        boolean[][] arr = {
                {true,false,true},
                {true,true,true},
                {true,true,true}
        };
        List<String> list = new ArrayList<>();
        System.out.println(MazeWithIsland("",arr,0,0, list));
    }

    static List<String> MazeWithIsland(String p,boolean[][] arr,int r,int c,List<String> list1){

        if(r == arr.length - 1 && c == arr[0].length -1 ){
            list1.add(p);
            return list1;
        }
        if(arr[r][c] == false){
            return list1;
        }

        List<String> list = new ArrayList<>();
        if(r < arr.length - 1){
            list.addAll(MazeWithIsland(p + "V", arr, r+1, c,list1));
        }
        if(c < arr[0].length - 1){
            list.addAll(MazeWithIsland(p + "H", arr, r, c+1, list1));
        }
        return list1;
    }

    static List<String> backTracking(String p, int r, int c){
        if (r == 1 && c == 1){
            List<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }

        List<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll( backTracking(p + "V",r-1,c));
        }
        if(c > 1){
            list.addAll(backTracking(p + "H",r,c-1));
        }

        return list;
    }

    static List<String> backTrackingWithDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            List<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }

        List<String> list = new ArrayList<>();

        if(r == c){
            list.addAll( backTracking(p + "D",r-1,c-1));
        }
        if(r > 1){
            list.addAll( backTracking(p + "V",r-1,c));
        }
        if(c > 1){
            list.addAll(backTracking(p + "H",r,c-1));
        }

        return list;
    }
}
