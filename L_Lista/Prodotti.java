package L_Lista;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Prodotti {
    
    public void LeggiDaFile(){
        File file=new File("prodotti.csv");
        try{
            Scanner leggiDaFile=new Scanner(file);
            while(leggiDaFile.hasNextLine()){
                String riga=leggiDaFile.nextLine();
                String[] fields=riga.split(",");
                System.out.println(fields[0]+","+fields[1]+","+fields[2]);
            }
            leggiDaFile.close();
        }catch(Exception e){
            System.out.println("Errore: "+e.getMessage());
        }

}
}
