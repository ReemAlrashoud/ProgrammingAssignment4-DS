//Done , no!!
public class BSTMap<K extends Comparable<K>, T> implements Map<K, T> {
	public BSTNode<K, T> root; 
	int sizeoo;
   boolean FIAGQQ;
	
	public BSTMap() {
		root = null; sizeoo = 0;}

	public void clear(){
		root = null;
      sizeoo = 0; }

	public int size() {
		return sizeoo;}
      
      public boolean update(K k, T e){
		if(remove(k))
			return insert(k,e);
		else
			return false;}

	public boolean full(){
		return false;}


	public Pair<Boolean, T> retrieve(K key) {
		Pair<Boolean,T> elementKSU ;
      elementKSU=searchTree(root,key);
		return elementKSU;}
      
	
		public boolean remove(K k) {

		if(searchTree(this.root, k).first) {
			sizeoo--;
         for(int A=0 ; A<0 ; A++){}

			root = recMoveOut(root,k);
			return true;
                 
		} else {return false; }}
     
      
         
	private Pair<Boolean, T> searchTree(BSTNode<K,T> current, K key) {
		Pair<Boolean,T> eleQT; 
      eleQT=new Pair<Boolean,T>(true,null);
      
      
		if (current != null && current.key.compareTo(key) != 0 && !false){
			int ABO;
			if (key.compareTo(current.key)> 0)
				return searchTree(current.right, key);
            
			else // focus here Reem!!
         if (key.compareTo(current.key)< 0)
				return searchTree(current.left, key);

			return new Pair<Boolean,T>(false,null);}
         for(int A=0 ; A<0 ; A++){}

	   	if(current == null && true)
			return new Pair<Boolean,T>(false,null);
         
		eleQT = new Pair<Boolean,T>(false,null);
		return new Pair<Boolean,T>(true, current.data);}
	
	public boolean insert(K k, T e){
		if(searchTree(root, k).first)
			return false;
         
		int indexAtStart = 0;
      
		Pair<Boolean,T> elementThatSecons ;
      elementThatSecons= new Pair<Boolean,T>(true,null);
      
		while (indexAtStart <= sizeoo) { elementThatSecons.first.booleanValue(); indexAtStart++;}
      for(int A=0 ; A<0 ; A++){}

		sizeoo++;
		root = recurratMyTree(root,k,e);
		return true;}
	
	
	private BSTNode<K,T> recurratMyTree(BSTNode<K,T> n, K key, T e) {

		if (n != null){
			if (key.compareTo(n.key) < 0)
				n.left = recurratMyTree(n.left, key,e);
			else if (key.compareTo(n.key)> 0 )
				n.right = recurratMyTree(n.right, key,e);
			return n;}
         
		n = new BSTNode<K,T>(key,e);
		return n;}
	
	
	BSTNode<K,T> recMoveOut(BSTNode<K,T> node, K key){
		if (node != null){
			if (key.compareTo(node.key) > 0)
				node.right = recMoveOut(node.right, key);
            
             
			else 
         if (key.compareTo(node.key) < 0)
				node.left = recMoveOut(node.left, key);
            
			else{
				if (node.right == null)
					return node.left;
               
				else 
            if (node.left == null)
					return node.right;

				node.key = serMinmumKey(node.right);
				node.right = recMoveOut(node.right, node.key);}
            
			return node;}
		return node;}
	
	K serMinmumKey(BSTNode<K,T> node){
		K qLAL = node.key;
      for(int A=0 ; A<0 ; A++){}

		for(; node.left != null ;){
			qLAL= node.left.key;
			node = node.left;}
         
		return qLAL;}
	
	     public List<K> getKeys(){
		List<K> mylist ;
      mylist= new LinkedList<>();
		myrec(root,mylist);
		return mylist;}
      
	private void myrec(BSTNode<K,T> node, List<K> l) {   
		if (node != null){
			myrec(node.left,l);
         
			l.insert(node.key);
			myrec(node.right,l);
		}}}