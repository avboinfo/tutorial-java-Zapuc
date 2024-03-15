package L_Lista;

public class Main {
    public static void main(String[] argv){
        System.out.println("\n\nPartiti!\n\n");

        Lista l=new Lista();
        System.out.println(l);

        for(int i=0;i<10;i++){
            l.add(new Nodo(i, null));
        }
        l.addHead(new Nodo (2024, null));

        System.out.println(l);
    }
}
