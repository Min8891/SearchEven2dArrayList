
package com.mycompany.search2darraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Search2DArrayList {
    static  ArrayList<String> SearchEven(ArrayList<ArrayList<Integer>> arr2DList)
    {
        ArrayList<String> temp = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr2DList.size(); i++)
        {
            for(int j = 0; j< arr2DList.get(i).size(); j++)
            {
                if (arr2DList.get(i).get(j) % 2 == 0)
                {
                    temp.add(Integer.toString(i) + " " + Integer.toString(j));
                    count++;
                }     
            }
         }
        
        if(count == 0)
            temp.add("-1");
        return temp;
        
    }
    
    static void Display_Locations(ArrayList<String> temp)
    {
        
        if(temp.get(0).equals("-1"))
            System.out.println("This arraylist did not have any even numbers.");
        else
        {
            for(String element : temp)
                System.out.println(element);
        } 
    }
 
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> Data1 =  new ArrayList<>(); 
        for(int i = 0; i < 5; i++)
           Data1.add(new ArrayList<>(Arrays.asList(1,1,3,1,5))); 
        System.out.println(Data1);
        System.out.println();
        
        ArrayList<ArrayList<Integer>> Data2 =  new ArrayList<>();
        Data2.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        Data2.add(new ArrayList<>(Arrays.asList(-2,-1,2,1)));
        Data2.add(new ArrayList<>());
        Data2.add(new ArrayList<>(Arrays.asList(2,2,2)));
        System.out.println(Data2);
        System.out.println();
        
        System.out.println("Data1 Results: ");
        Display_Locations(SearchEven(Data1));
        System.out.println();
        
        System.out.println("Data2 Results: ");
        Display_Locations(SearchEven(Data2));
    
    }
}
