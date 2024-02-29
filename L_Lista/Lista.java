package L_Lista;

public class Lista {
    Nodo radice;

    public Lista(){
        radice=null;
    }

    public boolean isEmpty(){
        return radice==null;
    }

    public void add(Nodo n){
        if(isEmpty()){
            radice=n;
        }else{
            Nodo p=radice;
            while(p.getSuccessivo()!=null) p=p.getSuccessivo();
            p.setSuccessivo(n);
        }

    }

    public String toString(){
        if(isEmpty()) return "Lista vuota";
        String s="Elementi della lista --> ";
        Nodo p=radice;
        while(p!=null){
            s+=p+"\t";
            p=p.getSuccessivo();
        }
        
        s+="End!\n";
        return s;
    }
}
