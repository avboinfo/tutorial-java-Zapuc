package F_File;
import java.io.File;
tFoundExpection;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class LeggiScriviFile{
    public void scriviFile(String filename){
        File f=new File(filename);
        try{
            PrintWriter pw=new PrintWriter(f);
            for(int i=0;i<10;i++){
                pw.printf("%f %f", Math.random(),Math.random());
            }
            pw.close();
        }catch(FileNotFoundException e){
            System.err.println("errore " + e.getMessage());
        }

    }

    public static void main(String [] args){
        
    }
}