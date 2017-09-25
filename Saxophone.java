
import java.util.*;
public class Saxophone{
  
  
  public static void main(String[] args) { // take the input 
        System.out.println("You are using a music notes converting programm.");
         System.out.println("Created by Yunyu Zhang");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line: ");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            convert(line);
            System.out.println(" ");
            System.out.println("Enter a line: ");
    
  
    }
       
  }

  public static void convert(String note){
   for (int i=0;i< note.length();i++){
    if (note.charAt(i)==' ')
      System.out.print(" ");
      
    else{
   // int newnote= note.charAt(i)-48+4;
    int newnote= note.charAt(i)-48+3;
    
    if (newnote<= 7)
     System.out.print(newnote + " ");
    else{
     newnote -= 7;
     if (newnote==4)
      System.out.print("#"+ newnote+" ");
     else
      System.out.print("*"+ newnote+" ");
    }
   }
   }





  }
  
  
  
  



}