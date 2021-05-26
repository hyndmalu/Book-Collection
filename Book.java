
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
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
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
    
}
