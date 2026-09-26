/*Create:
class Parent {
    int value = 100;
}
and:
class Child extends Parent {
    int value = 200;
}
Inside Child, print:
Child value: 200
Parent value: 100
Use super.value for the parent value.*/



package practice2;

public class Demo80 {

	public static void main(String[] args) {
		Child2 cc = new Child2();
		cc.display();
		

	}

}
