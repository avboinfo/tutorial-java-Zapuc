package C_Crypto;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String frase,chiave,fraseXOR,fraseXOR2,fraseCeaser;
        int shift;
        Scanner c=new Scanner(System.in);
        System.out.println("Inserisci una frase: ");
        frase=c.nextLine();
        System.out.println("Inserisci una chiave: ");
        chiave=c.nextLine();
        System.out.println("Inserisci il numero di shift: ");
        shift=c.nextInt();
        c.close();

        fraseCeaser=Crypto.Cesar(frase, shift);
        fraseXOR=Crypto.xorAlgo(frase,chiave);
        fraseXOR2=Crypto.xorAlgo(fraseXOR,chiave);
   

        System.out.println("La frase criptata con il metodo Ceaser è: "+fraseCeaser);
        System.out.println("La frase decriptata con il metodo Ceaser è: "+Crypto.Cesar(fraseCeaser,-shift));
        /* ------------------------- */
        System.out.println("La frase criptata con il metodo xor è: "+fraseXOR);
        System.out.println("La frase ricriptata con il metodo xor è: "+fraseXOR2);

    }
}