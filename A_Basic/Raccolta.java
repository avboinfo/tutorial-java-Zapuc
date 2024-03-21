import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Raccolta {
    
    public void LeggiDaFile(String path){
        File file=new File(path+".csv");
        ArrayList<Videogames> libreria=new ArrayList<>();
        try{
            Scanner leggiDaFile=new Scanner(file);
            while(leggiDaFile.hasNextLine()){
                String riga=leggiDaFile.nextLine();
                String[] fields=riga.split(",");
                libreria.add(new Videogames(fields[0],fields[1],Float.parseFloat(fields[2]),Integer.parseInt(fields[3])));
            }
            leggiDaFile.close();
        }catch(Exception e){
            System.out.println("Errore: "+e.getMessage());
        }

        public String toString(){
            String s="Giochi: ";
            for()
        }
    }

    public static void main(String[] argv){
        Raccolta libreria=new Raccolta();
        libreria.LeggiDaFile("videogames");
        System.out.println(libreria);
    }

}
