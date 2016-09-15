
public class Node <E> {

	Object value;
	Node<E> next;

	
	public Node(E element,Node<E>next) {
		this.value=element;
		this.next=next;
	}


	@Override
	public String toString() {
		return " {value=" + value + "}";
	}
	
}
