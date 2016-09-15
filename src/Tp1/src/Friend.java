package Tp1.src;


public class Friend implements Comparable<Friend>{
	private String name ;
	private int age;
	
public Friend() {
	// TODO Auto-generated constructor stub
}
	
	public Friend(String name) {
		this.age=0;
		this.name=name;
	}
	public Friend(int age) {
		this.age=age;
		this.name="";
	}
	public Friend(int age , String name) {
		this.age=age;
		this.name=name;
	}

	@Override
	/**
	 * renvoie 0 si s1 et s2 st égaux, revoie un nb < 0 si s1 < s2 
	 * selon l’ordre lexicographique (ordre du dico), renvoie un nb > 0 sinon
	 */
	public int compareTo(Friend f) {
		if( this.age == f.age){
			return 0;
		}else if(this.age > f.age){
			return 1;
		}
			return -1;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}
	
}
