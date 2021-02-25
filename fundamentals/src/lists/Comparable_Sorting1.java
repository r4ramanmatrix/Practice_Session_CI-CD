package lists;

public class Comparable_Sorting1 implements Comparable<Comparable_Sorting1>{
	
	private String name;
	private int age;
	
	public Comparable_Sorting1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public String toString(){
		return this.name + " " + this.age;
	}

	@Override
	public int compareTo(Comparable_Sorting1 intObj) {
		if(this.age<intObj.age){
			return -1;
		}else if(this.age>intObj.age){
			return 1;
		}
		return 0;
	}

}
