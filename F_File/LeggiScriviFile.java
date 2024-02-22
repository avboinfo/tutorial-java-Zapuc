import java.io.File;
tFoundExpection;
import java.io.PrintWriter;

public class LeggiScriviFile{
    public void scriviFile(String filename){
        File f=new File(filename);
        try{
            PrintWriter pw=new PrintWriter(f);
            for(int i=0;i<10;i++){
                pw.printf("%f %f", Math.random(),Math.random());
            }
            pw.close();
        }catch(FileNotFoundExpection e){
            System.err.println("errore " + e.gerMessage());
        }

    }

    public static void main(String [] args){
        
    }
}