import java.util.Scanner;

public class javavajaj {

    public static void main(String[] args) {
       
        Scanner tbord = new Scanner(System.in);

        String text1 = tbord.nextLine();

        String[] list = text1.split(" ");     
        tbord.close();
        System.out.println("Förnamn:" + list[0]);
        System.out.println("Efternamn: "+list[1]);
        System.out.println("Ålder: "+ list[2]);
        System.out.println("Längd: "+ list[3]);
        System.out.println("Vikt: " + list[4]);

   }
    
}

