package Tp1.src;


public class Counter {

	private int comp,perm;

	public Counter() {
		this.comp=0;
		this.perm=0;
	}
	public void incComp() {
		this.comp+=1;
	}
	public void incPerm() {
		this.perm+=1;
	}
	public void incComp(int n) {
		this.comp+=n;
	}
	public void incTerm(int i) {
		this.perm+=i;
	}
	public void reset() {
		this.comp=0;
		this.perm=0;
	}
	@Override
	public String toString() {	
		return "(nombre de comparaisons = "+this.comp+" , nombre de permutations= "+this.perm+" )";
	}
}
