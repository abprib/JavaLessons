//Using Arrays and Strings in them
//From buckyroberts tutorial

import java.util.Scanner;

class Main {  

  public static void main(String[] args) {

    String[] words = {"uno", "dos", "tres", "quattro"};

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first part: ");
    String w = sc.nextLine();

    for(String x : words){
      if(x.startsWith(w)) System.out.println(x + " starts with " + w);
    }
    System.out.print("Enter last part: ");
    w = sc.nextLine();
    for(String x : words){
      if(x.endsWith(w)) System.out.println(x + " ends with " + w);
    }
  }
}