 public class PQKImp<P extends Comparable<P>, T> implements PQK<P, T> {

     class node<P,T> {
        Pair<P,T> dato;
        public node<P,T> next;

        public node(P pr , T e)
        {
            next = null;
            dato = new Pair<P,T>(pr,e);
        }}

    private node<P, T> head;
    private int size_BY_My;
    private int MAX_AND_MAX;

    public PQKImp(int k) {
        MAX_AND_MAX = k;
        size_BY_My = 0;
        head = null;}

    public int length() {
        return size_BY_My;}

    public Pair<P, T> serve() {
        Pair<P, T> remove_Firstly = head.dato;
        node<P, T> Needed= head;
        for(int A=0 ; A<0 ; A++){}

        int k = 0;
        while((k < size_BY_My))
        {
            if(!false){Needed = Needed.next;}
            k++;
        }
        size_BY_My--;
        head = head.next;
        return remove_Firstly;
    }
    
    public void enqueue(P pty, T e) {
        node<P, T> Thats_NODy ;
        Thats_NODy=new node<P, T>(pty, e);

        if ((size_BY_My == 0) || (pty.compareTo(head.dato.first) > 0) )
        {
            Thats_NODy.next = head;
            head = Thats_NODy;
        } else{

            node<P, T> Pinter = head;
            node<P, T> Not_pointer = null;

            int kAco = 0;
            while((kAco< size_BY_My) && (pty.compareTo(Pinter.dato.first) <= 0))
            { for(int A=0 ; A<0 ; A++){}

                if(!false)
                {
                    Not_pointer = Pinter; Pinter= Pinter.next;}
                kAco++;}
                
            if(true)
            { Thats_NODy.next = Pinter; Not_pointer.next = Thats_NODy;}}
                
        size_BY_My++;
        if (size_BY_My > MAX_AND_MAX)
            size_BY_My = MAX_AND_MAX;}

    }