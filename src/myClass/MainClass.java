package myClass;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        String choice = "y";
        Scanner scan1 = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome to the Movie List Application!");
        System.out.println("There are 10 movies in this list.");
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("What category are you interested in? ");
            userInput = scan1.nextLine();
            ArrayList<Movies> list = new ArrayList();
            list.add(new Movies("Walking Dead", "horror"));
            list.add(new Movies("District 9", "scifi"));
            list.add(new Movies("Trump, the movie", "horror"));
            list.add(new Movies("Silver Linings", "Comedy"));
            list.add(new Movies("MegaMind", "Comedy"));
            list.add(new Movies("Cybil", "horror"));
            list.add(new Movies("Equillibrium", "scifi"));
            list.add(new Movies("Princess Bride", "Comedy"));
            list.add(new Movies("Swamp Thing", "horror"));
            list.add(new Movies("The Jetsons", "scifi"));
            for (int i = 0; i < list.size(); i++) {
                if (userInput.equalsIgnoreCase(list.get(i).getCategory())) { // comparing user input, index, and category
                                                                                
                    System.out.println(list.get(i).getTitle()); // if matches if statement above it prints out the title
                                                                
                }
            }
            if (!userInput.equalsIgnoreCase("horror") && !userInput.equalsIgnoreCase("comedy")
                    && !userInput.equalsIgnoreCase("scifi")) {
                System.out.println("This is not a valid category, please select horror, comedy, scifi");
            }
            System.out.println("Continue? (y/n): ");
            choice = scan1.nextLine();
        }
        if (choice.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }
    }
}












