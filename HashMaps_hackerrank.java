import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount of words in the phoneBook: ");
    int amount = sc.nextInt(); 
    HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

    for(int i = 0; i < amount; i++){
      System.out.print("Enter the name: ");
      String name = sc.nextLine();
      System.out.print("\b Enter the number: ");
      int phone = sc.nextInt();
      phoneBook.put(name, phone);
    }

    while(sc.hasNext()){
      String target = sc.nextLine();
      if(phoneBook.containsKey(target)){
        System.out.println(target + " : " + phoneBook.get(target));
      } else {
        System.out.println("There is no such a contact");
      }
    }
    sc.close();

  }
}