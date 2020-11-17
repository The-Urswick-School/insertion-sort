import java.util.ArrayList;

public class Bubble {
  
  public ArrayList<String> sorted;

  // Constructor
  public Bubble(ArrayList<String> listToSort){
    BubbleSort(listToSort);
  }

  public void BubbleSort(ArrayList<String> sorting){
    int memLen = sorting.size();
    boolean swapMade = true;
    while(swapMade)
    {
      swapMade = false;
      for(int i = 0; i < memLen-1; i++)
      {
        if(sorting.get(i).compareTo(sorting.get(i+1)) > 0)
        {
          String temp;
          temp = sorting.get(i);
          sorting.set(i, sorting.get(i+1));
          sorting.set(i+1, temp);
          swapMade = true;
        }
      }
    }
    System.out.println("Sorted list in BubbleSort method: " + sorting.toString());
    sorted = sorting;
  }

}
