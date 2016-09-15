
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.junit.validator.PublicClassValidator;

public class ListUtils{
	protected static Random rd= new Random();

	/**
	 * 
	 */
	public static List<Integer> genereRdmIntListe() {
		int tailleAlea = rd.nextInt(30);
		ArrayList<Integer> tmp = new ArrayList<>();
		while(tailleAlea > 0){
			tmp.add(rd.nextInt(100));
			tailleAlea--;
		}
		return tmp;
	}

	public static void  affiche(List<Integer> tmp2) {
		String str ="";
		Iterator<Integer> it = tmp2.iterator();
		while (it.hasNext()) {
			Integer tmp = (Integer) it.next();
			str += tmp.toString() +" -> ";
		}
		System.out.println(str.substring(0,str.length()-4));

	}

	public static void  afficheInverse(List<Integer> l){
		String str ="";
		ListIterator<Integer>it = l.listIterator(l.size());
		while (it.hasPrevious()) {
			Integer integer = (Integer) it.previous();
			str += integer.toString() +" -> ";
		}
		System.out.println(str.substring(0,str.length()-4));
	}

	public static int somme(List<Integer> l){
		int somme = 0 ;
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tmp = (Integer) it.next();
			somme += tmp;
		}
		return somme;
	}
	public static int moyenne(List<Integer> l) {
		int moyenne = 0 ;
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tmp = (Integer) it.next();
			moyenne += tmp;
		}
		return (int)moyenne/l.size();
	}

	public  int max(List<Integer> l) {
		int max = 0 ;
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tmp = (Integer) it.next();
			if(tmp > max){
				max = tmp;
			}
		}
		return max;
	}

	public  int min(List<Integer> l)  {
		int min=l.get(0);
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tmp = (Integer) it.next();
			if(tmp < min){
				min = tmp;
			}
		}
		return min;
	}

	public List<Integer> positions(List<Integer> l, int n){
		List<Integer> tmp = new ArrayList<>();
		int compteur=0;
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tempo = (Integer) it.next();
			if( n == tempo){
				tmp.add(compteur);
			}
			compteur++;
		}

		return tmp;
	}

	public List<Integer> paire(List<Integer> l){
		List<Integer> tmp = new ArrayList<>();
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			Integer tempo = (Integer) it.next();
			if( tempo % 2 == 0){
				tmp.add(tempo);
			}
		}

		return tmp;
	}

	public boolean estTrie(List<Integer> l){
		Iterator<Integer> it = l.iterator();
		Integer tmp =0;
		while (it.hasNext()) {
			Integer tempo = (Integer) it.next();
			if( tempo < tmp ){
				return false;
			}
			tmp = tempo;
		}
		return true;


	}

	public List<Integer> trie(List<Integer> l) {
		Iterator<Integer> it = l.iterator();
		List<Integer>tmp=new ArrayList<>();
		tmp=l;
		Collections.sort(tmp);
		return tmp;
		
		
		
		
	}
}