package Tp1.src;

import java.util.Arrays;
import java.util.Random;

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
		// tri d'un tableau d'objet:
		Friend[] tableau = new Friend[10];
		char tmp='a';
		Random rd=new Random();
		for (int i = 0; i < tab.length-1; i++) {
			tmp++;
			tableau[i]=new Friend(rd.nextInt(100),"t"+tmp+"t"+tmp);
			System.out.print(tableau[i]+",");
			
		}
		System.out.println();
		Arrays.sort(tableau);
		for (int i = 0; i < tableau.length; i++) {
			System.err.print(tableau[i]+",");
		}
	}

}
