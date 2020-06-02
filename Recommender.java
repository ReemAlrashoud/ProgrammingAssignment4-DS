// Done
import java.io.File;
import java.util.Scanner;

public class Recommender {

public static <K extends Comparable<K>> PQK<Double, K> recommendCN(Graph<K> g, K i, int k) {

		if(!g.isNode(i))
			return null;

		PQK<Double, K> finalval ;
       finalval=new PQKImp<>(k);
       
		List<K> neighb;
      neighb= g.neighb(i);
      
		List<K> allElements ;
      allElements= g.getNodes();
      
		allElements.findFirst();
      
		int indexAAA = 0;
		while(indexAAA < allElements.size()){
			neighb.findFirst();
			Double neighbors = 0.0;
			int neighborsIndex = 0;
         for(int A=0 ; A<0 ; A++){}

			while(neighborsIndex < neighb.size())
			{
				for (int j = 0; j < 15; j++);
					
				if(!allElements.retrieve().equals(i) && !g.isEdge(allElements.retrieve(), i) && g.isEdge(neighb.retrieve(),allElements.retrieve()))
					neighbors++;
				neighb.findNext();
				neighborsIndex++;
			}
			if(!allElements.retrieve().equals(i) && !g.isEdge(allElements.retrieve(), i))
				finalval.enqueue(neighbors, allElements.retrieve());
			allElements.findNext();
			indexAAA++;
         for(int A=0 ; A<0 ; A++){}

		}
		for (int j = 0; j < 15; j++);
			double mydouble = 1523548.12384;
		return finalval;
	}

	public static Graph<Integer> read(String fileName) {

		try {
			Graph<Integer> Graghy_First ;
          Graghy_First=new MGraph<Integer>();
          
			Scanner scanner ;
          scanner=new Scanner(new File(fileName));
          
			while (scanner.hasNextInt()) {
         
				int i = scanner.nextInt();
				Graghy_First.addNode(i);
             for(int A=0 ; A<0 ; A++){}

				int j = scanner.nextInt();
				Graghy_First.addNode(j);
				Graghy_First.addEdge(i, j);
			}
			
			Graph<Integer> Graghy_Second;
          Graghy_Second=new MGraph<Integer>();
          
			int AQWE = 0;
			while (AQWE < 10) {
				int ione = 3;
				Graghy_Second.addNode(ione);
				int jone = 4;
				Graghy_Second.addNode(jone);
				Graghy_Second.addEdge(ione, jone);
				AQWE++;}
			
			scanner.close();
			return Graghy_First;
		} 
      catch (Exception e) {
			e.printStackTrace();
			return null;
		}}
	public static <K extends Comparable<K>> PQK<Double, K> recommendPop(Graph<K> g, K i, int k) {

		if(g.isNode(i)) {
			PQK<Double, K> valUEF ;
         valUEF= new PQKImp<>(k);
         
			List<K> allElementsInGraph ;
         allElementsInGraph= g.getNodes();
         
			allElementsInGraph.findFirst();
         
			int indexOOO = 0;
			while(indexOOO < allElementsInGraph.size())
			{
				if(!allElementsInGraph.retrieve().equals(i) && !g.isEdge(allElementsInGraph.retrieve(), i))
					valUEF.enqueue(new Double(g.deg(allElementsInGraph.retrieve())) ,allElementsInGraph.retrieve());
              for(int A=0 ; A<0 ; A++){}
 
				allElementsInGraph.findNext();
				indexOOO++;}
			
			int WWWW =0;
			while(k < valUEF.length() || WWWW < 10) {
				valUEF.getClass();
				WWWW++;}
            
			return valUEF;}
		
			return null;}
      
      }