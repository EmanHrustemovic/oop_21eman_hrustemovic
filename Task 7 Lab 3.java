// 7.  Create the method lengths that gets a list of String variables as a parameter and returns 
//an ArrayList that contains the lengths of the Strings in the same order as the original list.


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static ArrayList<Integer>length(ArrayList<String>list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 0 ; i<list.size();i++){
            newList.add(list.get(i).length());
        }
        return newList;
    }

    }
    public static void main(String[] args){
        ArrayList <String> wordList = new ArrayList<String>();
        wordList.add("Tomatto");
        wordList.add("Carrot");
        wordList.add("Orange");
        wordList.add("Bannana");

        System.out.println(length(wordList));
    }
    
