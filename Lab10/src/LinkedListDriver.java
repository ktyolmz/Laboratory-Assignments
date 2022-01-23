import java.util.*;

public class LinkedListDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		MyLinkedList l1 = new MyLinkedList();
		for (int i = 0; i < N; i++) {
			String id = sc.nextLine();
			int reg = Integer.parseInt(sc.nextLine());
			Car c1 = new Car(id, reg);
			l1.add(c1);
		}
		sc.close();
		l1.printAll();
	}
}
