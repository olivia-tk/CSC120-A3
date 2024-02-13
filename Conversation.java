import java.util.*;
import java.StringUtils;
public class Conversation {
  //ask for user input on the number of rounds 
  public static final String[] CannedResponses = {
    "Mmm-hm.",
    "I see",
    "Yes yes",
    "Cool!",
    "Amazing",
    "That's nice",
    "Good point",
    "I think so too",
    "Fabulous"
  };
  public static void main(String[] args) {
    // You will start the conversation here.
      Scanner sc = new Scanner(System.in);
      int numRounds;
      System.out.println("How many rounds would you like? (Max is 9)"); 
      numRounds = sc.nextInt();   
      System.out.println("Number of rounds is: " + numRounds);
      System.out.println("How are you today?");
      String userInput = sc.nextLine();
      for(int i = 0; i<numRounds; i++){
        userInput = sc.nextLine();
        if (userInput.contains("I")||userInput.contains("am")){
          String response = userInput.replace("I", "You");
          String response1 = response.replace("am", "are");
          String response2 = response1.replace("my","your");
          //response = userInput.replace("You", "am");
          System.out.println(response2);
          //read in and break into lists and work with individual word in forloop 
        }
        else {
          System.out.println(CannedResponses[i]);
      }
    }
  }}

  //userInput.replace(old, new)