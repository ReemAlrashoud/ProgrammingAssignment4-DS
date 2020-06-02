// Done 
public class LinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> CURRYTT;
	private int numbereco;
   
	public LinkedList () {
		head  = null;
      CURRYTT=null;
		numbereco = 0;}
      
		public void findFirst () {
		CURRYTT = head;}
      
      public void findNext () {
		CURRYTT = CURRYTT.next;}
      
	public boolean empty () {
		return head == null;}
	
	public boolean last () {
		return CURRYTT.next == null;}
	
	public boolean full () {
		return false;}
      
	public void update (T val) {
		CURRYTT.data = val;}
      
	public T retrieve () {
		return CURRYTT.data;}
	
   	public void remove () {
		if (CURRYTT == head) {
			head = head.next;}
         
      else {
			Node<T> tmp ;
          tmp=head;
			while (tmp.next != CURRYTT) {
				tmp = tmp.next;}
            
			tmp.next = CURRYTT.next;}
         
		if (CURRYTT.next == null) {
			CURRYTT = head;
			numbereco--;}
          
      else {
			CURRYTT = CURRYTT.next;
			numbereco--;}}
	
	public void insert (T val) {
		Node<T> tmp;
		if (head == null) {
			CURRYTT = head = new Node<T> (val);
			numbereco++;
		} else {
			tmp = CURRYTT.next;
			CURRYTT.next = new Node<T> (val);
			CURRYTT = CURRYTT.next;
			CURRYTT.next = tmp;
			numbereco++;
		}}
	
         
	public int size() {
		return numbereco;}

	public boolean exists(T e) {
		if (!empty()) {
			Node<T> val = head;
			while (val.next != null) {
				if(val.data.equals(e))
					return true;
               
				val = val.next;}
            
			if(val.data.equals(e))
				return true;}
		return false;

	}}