package L_Lista;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sp {
    
    private Nodo elencoProdotti;

    public void eliminaUltimoProdotto() {
        if (elencoProdotti == null) {
            System.out.println("Nessun prodotto presente nell'elenco");
        } else if (elencoProdotti.getSuccessivo() == null) {
            elencoProdotti = null;
        } else {
            Nodo temp = elencoProdotti;
            while (temp.getSuccessivo().getSuccessivo() != null) {
                temp = temp.getSuccessivo();
            }
            temp.setSuccessivo(null);
        }
    }

    public void eliminaProdotto(int codiceProdottoDaEliminare) {
        if (elencoProdotti == null) {
            System.out.println("Nessun prodotto presente nell'elenco");
        } else if (elencoProdotti.getValore() == codiceProdottoDaEliminare) {
            elencoProdotti = elencoProdotti.getSuccessivo();
        } else {
            Nodo temp = elencoProdotti;
            while (temp.getSuccessivo() != null && temp.getSuccessivo().getValore() != codiceProdottoDaEliminare) {
                temp = temp.getSuccessivo();
            }
            if (temp.getSuccessivo() == null) {
                System.out.println("Prodotto non trovato nell'elenco");
            } else {
                temp.setSuccessivo(temp.getSuccessivo().getSuccessivo());
            }
        }
    }

    public int costoTotale() {
        int costoTotale = 0;
        Nodo temp = elencoProdotti;
        while (temp != null) {
            costoTotale += temp.getValore();
            temp = temp.getSuccessivo();
        }
        return costoTotale;
    }

    public void aggiungiProdotto(int codiceProdotto) {
        Nodo nuovoNodo = new Nodo(codiceProdotto, null);
        if (elencoProdotti == null) {
            elencoProdotti = nuovoNodo;
        } else {
            Nodo temp = elencoProdotti;
            while (temp.getSuccessivo() != null) {
                temp = temp.getSuccessivo();
            }
            temp.setSuccessivo(nuovoNodo);
        }
    }

    public void stampaEDSalva() {
        try {
            PrintWriter scrivi = new PrintWriter("spesa.txt");
            Nodo temp = elencoProdotti;
            while (temp != null) {
                System.out.println(temp.getValore());
                scrivi.print(temp.getValore());
                temp = temp.getSuccessivo();
            }
            scrivi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore "+e.getMessage());
        }
    }
    
}
