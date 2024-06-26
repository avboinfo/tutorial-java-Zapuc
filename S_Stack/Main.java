package S_Stack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        /*
        Stack<String> s = new Stack<>();
        s.push("Juve");
        s.push("Inter");
        System.out.println(s.pop());
        System.out.println(s);
        */

        Stack<String> stack=new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le stringhe (termina con una riga vuota):");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            stack.push(input);
        }
        scanner.close();
        try{
            File f=new File("S_Stack/out.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(writeReversedSentencesToFile(stack));
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Errore durante la scrittura nel file: " + e.getMessage());
        } 
    }

    private static void writeReversedSentencesToFile(Stack<String> stack) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
            while (!stack.isEmpty()) {
                String frase = stack.pop();
                StringBuilder reversed = new StringBuilder(frase).reverse();
                writer.write(reversed.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura nel file: " + e.getMessage());
        }
    }

}
