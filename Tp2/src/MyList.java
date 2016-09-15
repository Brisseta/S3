
public class MyList<E>{
	
	Node<E> first;
	Node<E>last;

	public MyList() {
		this.first=null;
		this.last=null;
	}
	public boolean add(E e){
		this.first=new Node<>(e,first);
		return true;
		
	}
	public String toString(){
		String s ="[";
		s += this.first.toString();
		Node<E>i=first.next;
		while ( i != null) {
			s += ", "+i;
			i = i.next;
		}
		
		return s+"]";
		
	}

}
