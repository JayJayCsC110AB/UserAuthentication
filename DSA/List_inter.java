package DSA;
import java.util.List;
import java.util.ArrayList;

public class List_inter {
    public static void main(String[] args) {

        // creating a list in memory
        List<String> li = new ArrayList<>();
        // adding elements to the list
        li.add("Java");
        li.add("C++");
        li.add("DSA");
        li.add("Python");

        
        System.out.println("List created: " + li);

        System.out.println();
        //printing the elements of the list
        System.out.println("Elements in the list:");
        // using for-each loop to iterate through the list and print each element
        for(String e: li){
            System.out.println(e);

        }

        System.out.println();
        // accessing elements by index
        if(!li.isEmpty()) {
             System.out.println("Element at index 1: " + li.get(1));
        } 
        li.set(1, "JavaScript"); //Changing element at index 1
        System.out.println("updated list: " + li.get(1));

        // removing an element
        li.remove("DSA");
        System.out.println("List after removing " + "DSA: " + li);

        //printing the elements of the list after removal 
        System.out.println();
        System.out.println("Elements in the list after removal:");

        for(String e : li) {
            System.out.println(e);
        }

        }
    }


