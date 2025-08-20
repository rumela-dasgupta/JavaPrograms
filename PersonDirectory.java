//PersonDirectory.java
import java.util.Scanner;
import java.util.Arrays;
class Person{
    String name;
    String address;
    String phone;
    Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    void display(){
        System.out.print("\nName: " + name + "\nAddress: " + address + "\nPhone: " + phone);
    }
}
public class PersonDirectory{
    public static void main(String[] args){
        
        Scanner S = new Scanner(System.in);
        Person[] people = new Person[3];
        int size = people.length;
        Person temp = null;
        System.out.println("Enter details of 5 persons: ");
        for(int i = 0; i < 3; i++){
            System.out.println("Details person: " + (i + 1));
            System.out.print("\nEnter name: ");
            String name = S.nextLine();
            System.out.print("\nEnter address: ");
            String address = S.nextLine();
            System.out.print("\nEnter phone: ");
            String phone = S.nextLine();
            people[i] = new Person(name, address, phone);
    }
System.out.println("\nUnsorted list ------>");
    for (Person p : people) {
            p.display();
        }
    for(int i = 0; i < size; i++){
        for(int j = i + 1; j < size; j++){
            if(people[j].name.compareTo(people[i].name) < 0){
                temp = people[i];
                people[i] = people[j];
                people[j] = temp;
            }
        }
    }
    System.out.println("\nSorted list ------>");
    for (Person p : people) {
            p.display();
        }
    S.close();
}
}