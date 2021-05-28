import ecs100.*;
/**
 * Class to handle GUI functionality
 *
 * @author LCH
 * @version 27/5/21
 */
public class GUI
{
    // instance variables 
    
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
       Books bk = new Books();
       UI.initialise();
       UI.addButton("Add", bk::addBook);
       UI.addTextField("Find a book ID by name", bk::findBookId);
       UI.addTextField("Find a book name by id", bk::findBookName);
       UI.addButton("Print All", bk::printAll);       
       UI.addButton("Quit", UI::quit);
    }

   

}
