import java.util.*;
public class anagramss{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str1= sc.nextLine();
        System.out.println("Enter the 2nd String");
         String str2= sc.nextLine();

         str1= str1.replaceAll("\\s", "").toLowerCase();
         str2= str2.replaceAll("\\s", "").toLowerCase();

         if(str1.length()!=str2.length()){
            System.out.println("NOT ANAGRAM");
         }

         char[] arr1= str1.toCharArray();
         char[] arr2= str2.toCharArray();


         Arrays.sort(arr1);
         Arrays.sort(arr2);

         if(Arrays.equals(arr1,arr2)){
            System.out.println("ANAGRAM");
         } else{
            System.out.println(" NOT ANAGRAM");
         }


    }
}