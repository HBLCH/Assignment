package assignments;

public class Dog {
String name;
int age;
double weight;

public Dog(String name, int age, double weight) {
	super();
	this.name = name;
	this.age = age;
	this.weight = weight;
}
public void eating() {
	System.out.println("eating");
	
}
public void eating(String food) {
	System.out.println("eating "+ food);
	
}
public void showExcitment() {
	System.out.println("Dog  "+this.name+"  is wagging his tail!!!");
}
public void showExcitment(int levelOfExcitment) {
	System.out.println("Dog  "+this.name+"  level of Excitment is  "+ levelOfExcitment);
}

@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
}
public static void main(String[] args) {
	Dog germanSh=new Dog("Charlie",1,66);
	System.out.println(germanSh);
	germanSh.showExcitment();
	germanSh.showExcitment(9);
	germanSh.eating();
	germanSh.eating("bone");
}
}
