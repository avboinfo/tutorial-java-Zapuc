package L_Lista;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        System.out.println("\n\t\t\t\t\tPartiti!\n\n\n");

       
       
        int scelta;
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\tMENU SPESA\n");
        System.out.println("\n1)Aggiunta del codice di un prodotto all'elenco\n2)Eliminazione dell'ultimo prodotto inserito nell'elenco\n3)Eliminazione di un prodotto dall'elenco, dato il suo codice");
        System.out.println("4)Calcolo del costo totale dei prodotti presenti nell'elenco");
        do{
            System.out.println("\nScrivi qua il numero: ");
            scelta=input.nextInt();
        }while(scelta!=1&&scelta!=2&&scelta!=3&&scelta!=4);
       
        Spesa sp=new Spesa();


        switch(scelta){
            case 1:
                System.out.println("\nInserisci il codice del prodotto (intero): ");
                int codice=input.nextInt();
                System.out.println("Operazione riuscita con successo! :D");
                break;
            
            case 2:
                sp.eliminaUltimoProdotto();
                System.out.println("\nUltimo prodotto dell'elenco eliminato!");
                break;

            case 3:
                System.out.println("\nInserisci il codice del prodotto da eliminare: ");
                int cod=input.nextInt();
                sp.eliminaProdotto(cod);
                System.out.println("Operazione riuscita con successo! :D");
                break;

            case 4:
                System.out.println("\n\t\tCosto totale dei prodotti è di "+sp.costoTotale+"€");
                break;

            default:
                System.out.println("Qua non puoi entrarci");
                while(true){System.out.println("Sei bloccato qua"); continue;}
               
        }

        System.out.println("\n\n\t\t\t\t\tFine programma\n\n\n");
       

}
}


 /* 
        Lista l=new Lista();
        System.out.println(l);

        l.addSorted(new Nodo(200,null));
        l.addSorted(new Nodo(250,null));
        l.addSorted(new Nodo(100,null));
        l.addSorted(new Nodo(150,null));

        System.out.println(l);

        l.addAfter(130, new Nodo(130, null));

        
        Lista.Iteratore iter=l.getIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        */