import ecs100.*;
/**
 * Support class of Book
 * A Book contains an id, name, author, quantity, image
 * 
 * @author LCH
 * @version 27/5/21
 */
public class Book
{
    // instance variables
    private int id, quantity;
    private String name, author, image;
    private static final String DEFAULT_IMAGE = "default-book.png";  
    private double locX, locY;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }

    /**
     * Constructor overloading
     */
    public Book(int id, String nm, String auth, int qty)
    {
        this(id, nm, auth, qty, DEFAULT_IMAGE);
    }
    
    /**
     * Getter method for field id
     */
    public int getId()
    {
        return(this.id);
    }
    
    /**
     * Getter method for field quantity
     */
    public int getQuantity()
    {
        return(this.quantity);
    }
    
    /**
     * Getter method for field name
     */
    public String getName()
    {
        return(this.name);
    }
    
    /**
     * Getter method for field author
     */
    public String getAuthor()
    {
        return(this.author);
    }
    
    /**
     * Display our image on our GUI
     */
    public void displayBook()
    {
        double locX = 100;
        double locY = 100;
        final double HEIGHT = 100;
        final double WIDTH = 100;
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
}
