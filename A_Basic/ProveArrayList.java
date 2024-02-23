import java.util.ArrayList;
//import java.util.Collections;
public class ProveArrayList {
        public static void main(String[] args){
            System.out.println("Ciao!\n");

            ArrayList<String> lista=new ArrayList<>();


            lista.add("UNO");
            lista.add("DUE");
            lista.remove("DUE");
            lista.add("TRE");
            lista.add(1,"QUATTRO?");

            //Collections.sort(lista);
            System.out.println(lista);
            for(String s:lista) System.out.print(s+"\n");
            for(int i=0;i<lista.size();i++){
                String s=lista.get(i);
                System.out.println(s);
            }
          
        }
}