import java.util.*;

class PhoneBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of words in the phoneBook: ");
        int amount = sc.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        String name;
        int phone;

        for(int i = 0; i < amount; i++){
            System.out.print("Enter the name: ");
            name = sc.next();
            System.out.print("Enter the number: ");
            phone = sc.nextInt();
            phoneBook.put(name, phone);
        }

        System.out.print("Enter name, I give you number: ");
        String target = sc.next();
        if(phoneBook.containsKey(target)){
            System.out.println(target + " : " + phoneBook.get(target));
        } else {
            System.out.println("There is no such a contact");
        }
        sc.close();
    }


}
