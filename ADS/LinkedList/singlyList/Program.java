package singlyList;

import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("\n0.Exit\n1.Display\n2.Add First\n3.Add Last\n4.Add at Pos\n5.Del First\n6.Del Last\n7.Del all\n8.Del at pos");
		System.out.println("9.Reverse");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int ch = 0, pos = 0;
		SinglyList list = new SinglyList();
		
		//only addition methods are updated
		//SinglyListTail list = new SinglyListTail();
		while((ch = Program.menuList()) != 0) {
			switch (ch) {
			case 1:
				list.display();
				list.middle();
				break;
			case 2:
				System.out.print("Enter value to add at first : ");
				list.addFirst(sc.nextInt());
				break;
			case 3:
				System.out.print("Enter value to add at last : ");
				list.addLast(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter Position : ");
				pos = sc.nextInt();
				System.out.print("Enter value : ");
				list.addAtPos(sc.nextInt(),pos);
				break;
			case 5:
				try {
					list.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					list.delLast();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				list.delAll();
				break;
			case 8:
				System.out.print("Enter pos : ");
				try {
					list.delAtPos(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 9:
				list.reverse();
				list.recRev();
				list.revDisplay();
				break;
					
			default:
				break;
			}
		}
		
	}

}
