package p2;

class Demo
{
	int x = 10;
	Demo(int y){
		x = 100;
	}
}


public class Basics {

	public static void main(String[] args) {
		Demo d = new Demo(88);
		System.out.println(d.x);
	}
}
