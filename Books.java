import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of books in a hashmap,
 * allows user to add, find, print all, edit from a menu
 * maybe delete
 * prevent user from adding a duplicate
 * @author LCH
 * @version 27/5/21
 */
public class Books
{
    // instance variables 
    private HashMap<Integer, Book> booksMap;    // create a hashmap to store our books
    private int currId; // id of current book being added

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>(); // create hashmap
        
        // creating sample books
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 76);
        Book b2 = new Book(2, "1984", "George Orwell", 69);
        Book b3 = new Book(3, "The Dark Knight Returns", "Frank Miller", 100);
        
        // add books to collection
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        
        this.currId = 3;
    }

    public void printAll()
    {
        // traversing map
        for (int bookId : booksMap.keySet())
        {
            UI.println(bookId + " Details: ");
            UI.println(booksMap.get(bookId).getName() + " "
                    + booksMap.get(bookId).getAuthor() + " "
                    + booksMap.get(bookId).getQuantity() + " ");
        }
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    public void menu()
    {
        // print menu and force choice
        String choice;
        do {
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A"))
            {
                addBook();
            }
            else if (choice.equalsIgnoreCase("F"))
            {
                findBook();
            }
            else if (choice.equalsIgnoreCase("P"))
            {
                printAll();
            }
            else if (choice.equalsIgnoreCase("Q"))
            {
                UI.println("GoodBye!");
                UI.quit();
            }
            else
            {
                UI.println("WRONG ANSWER MEATBAG");
            }
        } while (!choice.equals("Q"));
    }
}
