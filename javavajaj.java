import java.util.Scanner;

public class javavajaj {

    public static void main(String[] args) {
       
        Scanner tbord = new Scanner(System.in);

        String text1 = tbord.nextLine();

        String[] list = text1.split(" ");     
        tbord.close();
        int Ålder = Integer.parseInt(list[2]);
        double längd = Double.parseDouble(list[3]);
        double Vikt = Double.parseDouble(list[4]);

        System.out.println("Förnamn: " + list[0]);
        System.out.println("Efternamn: "+list[1]);
        System.out.println("Ålder: "+ Ålder);
        System.out.println("Längd: "+ längd);
        System.out.println("Vikt: " + Vikt);

   }
    
}

