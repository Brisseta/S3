import java.util.ArrayList;

public class MyList<E> extends ArrayList<E>{
	
	Node<E> first;
	Node<E>last;

	public MyList() {
		this.first=null;
		this.last=null;
	}
	public boolean add(E e){
		this.first=new Node<>(e,this.first);
		return true;

	}
	public String toString(){
		String s ="";
		s += this.first;
		Node<E>i=first;
		while ( i != null) {
			s += " "+i;
			i = i.next;
		}

		return s+"";

	}
	public void next(){
		if(this.first != null) {
			this.first=first.next;
		}

	}
	public boolean hasNext(){

		return this.first != null;
	}
	public  boolean isEmpty(){

		return this.first == null;		
	}
	public int size(){
		int i = 0;
		MyList<E>it = this;
		while (it.first != null) {
			i++;
			it.next();
		}
		return i;
	}
	public void clear(){
		MyList<E>it = this;
		while (it.hasNext()) {
			it.first=null;
			it.next();
		}

	}
	public E get(int index){
		MyList<E> tmp = this;
		int i=0;
		while (tmp.first != null && i != index) {
			i++;
			tmp.next();
		}
		return tmp.first.value;
	}
	public void affichage(){
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		MyList<Integer> test = new MyList<>();
		test.add(12);
		test.add(14);
		test.add(85);
		test.affichage();
	}


}
