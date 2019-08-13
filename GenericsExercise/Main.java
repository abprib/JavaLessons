//From HeadFirstJava
//Exercise on Generics
//Sorting mountains
import java.util.*;

public class Main {
  LinkedList<Mountain> mtn = new LinkedList<>();
  //Name comporator
  class NameCompare implements Comparator<Mountain>{
    public int compare(Mountain one, Mountain two){
      return one.getName().compareTo(two.getName());
    }
  }
  //Height comporator
  class HeightCompare implements Comparator<Mountain>{
    public int compare(Mountain one, Mountain two){
      return (one.getHeight() - two.getHeight());
    }
  }

  public static void main(String[] args) {
    new Main().go();
  }

  public void go(){
    mtn.add(new Mountain("Konzhak", 1525));
    mtn.add(new Mountain("Oslanka", 1110));
    mtn.add(new Mountain("Kruglica", 1100));
    mtn.add(new Mountain("Narodnaya", 2500));

    System.out.println("as entered:\n" + mtn);
    //Instance of name comporator
    NameCompare nc = new NameCompare();
    //Overloaded sort method
    Collections.sort(mtn, nc);
    System.out.println("by name:\n" + mtn);
    HeightCompare hc = new HeightCompare();
    Collections.sort(mtn, hc);
    System.out.println("by height:\n" + mtn);
  }
}
class Mountain{
  String name;
  int height;
  Mountain(String n, int h){
    name = n;
    height = h;
  }
  String getName(){
    return name;
  }
  int getHeight(){
    return height;
  }
  public String toString(){
    return name + " " + height;
  }
}
