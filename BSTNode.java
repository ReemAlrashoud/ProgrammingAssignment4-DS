//Done
public class BSTNode<K extends Comparable<K>, T> {
	public BSTNode<K, T> left;
   public BSTNode<K, T> right;
	public K key;
	public T data;


	public BSTNode(K key, T data) {
		this.key = key;
		this.data = data;
		left = null;
      right=null;
	}}