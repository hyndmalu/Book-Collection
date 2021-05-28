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
    
    public void addBook()
    {
        final int MAX_QUANTITY = 1000;
        int quantity = -1;
        
        // ask user for the details 
        String name = UI.askString("Title: ");
        String author = UI.askString("Author: ");
        
        // Check boundaries for number of books added to stock
        do 
        {
            quantity = UI.askInt("Quantity: ");
        } while (0 > quantity || quantity > MAX_QUANTITY);
        // add a book image for display in the GUI
        String imgFileName = UIFileChooser.open("Choose Image File");
        // increment the book id counter and add book to hashmap
        currId++;
        booksMap.put(currId, new Book(currId, name, author, quantity, imgFileName));
    }
    
    public void findBookName(String id)
    {                
        int bookId = 0;
        try
        {
            bookId = Integer.valueOf(id);            
        }    
        catch (Exception e)
        {
            UI.print("Please enter an integer");
        }
        if (bookId > 0 && bookId < booksMap.size())
        {
            UI.println(booksMap.get(bookId).getName());
        }
    }
    
    public void findBookId(String nm)
    {
        String name = nm;
        for (Book b : booksMap.values())
        {
            if (b.getName().equalsIgnoreCase(name))
            {
               UI.println(b.getId());
            }            
        }
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
            UI.println("F(I)nd a book id");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A"))
            {
                addBook();
            }
            else if (choice.equalsIgnoreCase("F"))
            {
                findBookName(UI.askString("Enter an ID: "));
            }
            else if (choice.equalsIgnoreCase("I"))
            {
                findBookId(UI.askString("Enter a Name: "));
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
