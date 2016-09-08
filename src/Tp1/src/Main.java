package Tp1.src;


public class Main {

	public static void main(String[] args) {
		Sort s =new Sort();
		Counter c = new Counter();
		int []tab = new int[]{21,18,22,69,98,77,75,1,5,6,47};
		//bubbleSort
		s.bubbleSort(tab,c);
		System.out.println(c.toString());
		s.printtabay(tab);
		//Select Sort
		tab = new int[]{21,18,22,69,98,77,75,1,5,6,47};
		s.selectSort(tab,c);
		System.out.println(c.toString());
		s.printtabay(tab);
		//insert Sort
		tab = new int[]{21,18,22,69,98,77,75,1,5,6,47};
		s.insertSort(tab,c);
		System.out.println(c.toString());
		s.printtabay(tab);

	}

}
