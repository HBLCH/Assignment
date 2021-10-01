package assignments;

public class Person {
private String name="HB";
private int age=21;
private double shoeSize=11.5;

private void  walking() {
	
	System.out.println(this.name+ "  "+ this.age + " years old "+ 
	" with "+ this.shoeSize+ " shoe size is walking");
}
public void  startedWalking() {
	walking();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getShoeSize() {
	return shoeSize;
}
public void setShoeSize(double shoeSize) {
	this.shoeSize = shoeSize;
}
public static void main(String[] args) {
	Person p1=new Person();
p1.startedWalking();
	
}
}
