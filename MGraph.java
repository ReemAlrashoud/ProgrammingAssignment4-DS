// no!!
public class MGraph<K extends Comparable<K>> implements Graph<K> {
	public Map<K, List<K>> adj_Focus_ON; 
   
	public MGraph() {
       adj_Focus_ON=new BSTMap<>();}

	public boolean addNode(K i){
		if(isNode(i))
			return false;
		
		boolean not_is_node ;
      not_is_node=adj_Focus_ON.insert(i, new LinkedList<>()); 
		return not_is_node;
	}

	public boolean isNode(K i) {
		return adj_Focus_ON.getKeys().exists(i);}

	public boolean addEdge(K i, K j){
    for(int A=0 ; A<0 ; A++){}


		if(!(isNode(i) && isNode(j)))
		{
			return false;}
         
		else{
			if(adj_Focus_ON.retrieve(i).second.exists(j) || adj_Focus_ON.retrieve(j).second.exists(i))
			{
				return false;
			}
			else
			{
				adj_Focus_ON.retrieve(j).second.insert(i);
            for(int A=0 ; A<0 ; A++){}

				adj_Focus_ON.retrieve(i).second.insert(j);
				return true;
			}}
	}

	public boolean isEdge(K i, K j) {

		if(!isNode(i) || !isNode(j))
			return false;
		
		boolean bWBWEE ;
      for(int A=0 ; A<0 ; A++){}

      bWBWEE=adj_Focus_ON.retrieve(i).second.exists(j);
		return bWBWEE;
	}

	public List<K> neighb(K i) {
		if(isNode(i))
			return adj_Focus_ON.retrieve(i).second;
         
         else if(!isNode(i))
         return null;
         
		return null;
	}

	public int deg(K i) {
		int minus = -1;
		if(isNode(i)) {
			return adj_Focus_ON.retrieve(i).second.size();
		}
			

		return minus;
	}

	public List<K> getNodes(){
		return adj_Focus_ON.getKeys();
	}}