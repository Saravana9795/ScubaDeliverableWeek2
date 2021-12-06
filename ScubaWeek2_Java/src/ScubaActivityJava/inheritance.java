package ScubaActivityJava;

class Player{  
	float salary=40000;  
}  
class Person extends Player{  
	
	int bonus=10000;  
	
	public static void main(String args[]){  
		
		Person p=new Person();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  