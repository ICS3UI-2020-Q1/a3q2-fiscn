import java.util.Scanner; 

/**
 * Tells the user what animal they have based on input 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    // ask the user if the animal has feathers 
    System.out.println("Does the animal have feathers?"); 
    String featherAnswer = input.nextLine(); 

    // check if they do have feathers 
    if (featherAnswer.equals("yes")){
      System.out.println("Does the animal swim?"); 
      String swimAnswer = input.nextLine();  

      if (swimAnswer.equals("yes")){
        System.out.println("This is a duck!");
      }else if (swimAnswer.equals("no")){
        System.out.println("This is a hen!");
      }
    } 
    if (featherAnswer.equals("no")){ 
      System.out.println("Does the animal have legs?"); 
      String legsAnswer = input.nextLine(); 

      if (legsAnswer.equals("yes")){
        System.out.println("This is a Lizard!"); 
      }else if (legsAnswer.equals("no")){
        System.out.println("This is a snake!");
      }
    }

    
  }
}
