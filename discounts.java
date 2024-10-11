import java.util.Scanner;
public class discounts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        final int Discount1 = 25;
        final int Discount2 = 50;
        
        double inicialimport; 
        double discountedimport;
        double  finalimport;
        int numofpieces;
        System.out.println("Write price" );
        inicialimport = input.nextDouble();
        System.out.println("numofpieces");
        numofpieces = input.nextInt();
       
        
        
        if (numofpieces <= 3){
            discountedimport = inicialimport * (Discount1/100.0);       
        } else {
            discountedimport = inicialimport * (Discount2/100.0);
        }

        finalimport = inicialimport - discountedimport;
        System.out.println("Result " + finalimport);
        input.close();
    }
    }