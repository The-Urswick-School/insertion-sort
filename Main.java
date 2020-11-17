import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Declare and construct a scanner that will accept user input from the command line
    // identified as reader
    Scanner reader = new Scanner(System.in);

    // Declare and construct an ArrayList that will hold strings called (identified as)
    // memory
    ArrayList<String> memory = new ArrayList<String>();

    // Create a loop that will keep going until break
    while (true)
    {
      // add each entry on the command line to the ArrayList
      memory.add(reader.nextLine());
      // keep a note of how long the ArrayList is
      int memLen = memory.size();
      // if the user presses enter without input (null entry)
      // the reader will close
      // the null entry will be removed
      // the while loop will "break"
      if(memory.get(memLen-1).equals("")){
        reader.close();
        memory.remove(memLen-1);
        break;
      }
    }
    // the ArrayList called memory is printed on the console
    System.out.println(memory.toString());
    Bubble bubble1 = new Bubble(memory);
    System.out.println("Sorted list accessed from main: " + bubble1.sorted.toString());
  }
}
