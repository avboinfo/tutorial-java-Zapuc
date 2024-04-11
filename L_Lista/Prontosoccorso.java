package L_Lista;

public class Prontosoccorso {
    
    Lista <Paziente> pa;

    public Prontosoccorso(){
        pa=new Lista<>();
        loadFromFile();
    }

    public String cercaPazienti(String triage){
        String result="Lista pazienti con triage "+triage+":\n";
        Nodo<Paziente> p =pa.getRoot();
        while(p!=null){
            if(p.getValore().getTriage().equals(triage)){
                result+=p+"\n";
            }
            p.p.getSuccessivo();
        }
        return result;
    }

    public void loadFromFile(){
        
    }
}
