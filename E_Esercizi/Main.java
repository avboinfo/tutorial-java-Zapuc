package E_Esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    System.out.println("\n\n");
    Pila<Integer> voti=new Pila<>();
    voti.push(4);
    voti.pop();
    voti.push(4);
    voti.push(10);
    System.out.println(voti);

    Pila<String> pila=new Pila<>();
    try{
        File f=new File("E_Esercizi/DatiIn.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            pila.push(s);
        }
        sc.close();
    }catch(FileNotFoundException e){
        System.out.println(e.getMessage());
    }
    System.out.println(pila);
}
}