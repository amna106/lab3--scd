package lab3;
public class Main extends Thread {
	public void run() {
		System.out.println("task one");
	}
	public static void main(String[] args) {
		Main t1 = new Main();
		Main t2 = new Main();
		Main t3 = new Main();
		Main t4 = new Main();
		Main t5 = new Main();
		Main t6 = new Main();
		Main t7 = new Main();
		Main t8 = new Main();
		Main t9 = new Main();
		Main t10 = new Main();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();}}
