package Tp1.src;

/**
 * SDD Seance TP 1 :
 *
 * @author <a href="mailto:Frederic.Guyomarch@univ-lille1.fr">FrÃ©dÃ©ric Guyomarch</a>
 * IUT-A, Universite de Lille, Sciences et TEchnologies
 */
public class Sort {


	public static int [] generateRdmInttabay(int n, int min, int max){
		int[] tmp=new int[n];
		int alea;
		for (int i = 0; i < tmp.length; i++) {
			alea=(int)Math.random()*(max-min)+min;
			tmp[i]=alea;
		}

		return tmp;
	}


	public static void insertSort(int [] tab) {
		for (int i = 0; i < tab.length; i++) {
			int tmp= tab[i];int j=i;
			while (j>0 && tab[j-1] >=tmp) {
				tab[j] = tab[j-1];
				j--;
			}
			tab[j] = tmp;
		}
	} 

	public static void selectSort(int [] tab){
		for (int i = 0; i < tab.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < tab.length; j++)
				if (tab[j] < tab[index])
					index = j;

			int smallerNumber = tab[index]; 
			tab[index] = tab[i];
			tab[i] = smallerNumber;
		}
	}

	public static void printtabay(int [] tab){
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+",");
		}
		System.out.print("}");
		System.out.println("");
	}

	public static void swap(int [] tab, int idx, int idx2){
		int tmp=tab[idx];
		tab[idx]=tab[idx2];
		tab[idx2]=tmp;
	}

	public static void bubbleSort(int [] tab){

		boolean flag = false;
		while (!flag) {
			flag=true;
			for (int i = 0; i < tab.length; i++) {
				if(tab[i] > tab[i+1]){
					swap(tab, i, i+1);
					flag=false;
				}
			}
		}
	}
	public static void selectSort(int [] tab ,Counter c ){
		for (int i = 0; i < tab.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < tab.length; j++)
				if (tab[j] < tab[index])
					index = j;
					c.incComp();

			swap(tab, i, index);
			c.incPerm();
		}
	}
	public static void bubbleSort(int [] tab ,Counter c){
		boolean flag = false;
		while (!flag) {
			flag=true;
			for (int i = 0; i < tab.length -1; i++) {
				c.incComp();
				if(tab[i] > tab[i+1]){
					swap(tab, i, i+1);
					c.incPerm();
					flag=false;
				}
			}
		}
	}

	public static void insertSort(int [] tab, Counter c) {
		for (int i = 0; i < tab.length; i++) {
			int tmp= tab[i];int j=i;
			while (j>0 && tab[j-1] >=tmp) {
				c.incComp();
				tab[j] = tab[j-1];
				c.incPerm();
				j--;
			}
			tab[j] = tmp;
		}
	} 
	

}