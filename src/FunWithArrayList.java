import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayList {
    public static void main(String[] args){
        //Create a list of colors
        ArrayList<String> colors = new ArrayList<String>();

        //Add some colors in the list
        colors.add("Blue");
        colors.add("white");
        colors.add("black");

        //get value at index 1
        System.out.println(colors.get(1));
        //Using the array list above, prompt the user for one new color, and add that color to the array list.
        Scanner sc = new Scanner(System.in);
        String userColor = "yes";
        while(!userColor.equalsIgnoreCase("q")){
            System.out.println("Please enter a color: ");
            userColor = sc.next();
            if(userColor.equalsIgnoreCase("q")){
                break;
            }
            colors.add(userColor);
        }

        for (String color : colors) {
            System.out.println(color);
        }

//        do {
//            System.out.println("Please write a color: ");
//            userColor = sc.next();
//            colors.add(userColor);
//        }while(!userColor.equalsIgnoreCase("q"));
//
//        for (String color : colors) {
//            System.out.println(color);
//        }

    }
}
