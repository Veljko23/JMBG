package jmbg;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String jmbg;
		int dd, mm, yyy, rr, bbb, k;
		
		System.out.println("Unesite jmbg:");
		
		Scanner scanner = new Scanner(System.in);
		jmbg = scanner.next();
		scanner.close();
		
		if(jmbg.length()!=13) {
			System.out.println("JMBG nije validan!");
			return;
		}
		
		dd = Integer.parseInt(jmbg.substring(0, 2));
		mm = Integer.parseInt(jmbg.substring(2, 4));
		yyy = Integer.parseInt(jmbg.substring(4, 7));
		rr = Integer.parseInt(jmbg.substring(7, 9));
		bbb = Integer.parseInt(jmbg.substring(9, 12));
		k = Integer.parseInt(jmbg.substring(12, 13));
		
		if(mm<1 || mm>12) {
			System.out.println("JMBG nije validan!");
			return;
		}
		
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dd<1 || dd>31) {
				System.out.println("JMBG nije validan!");
				return;
			}
			
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(dd<1 || dd>30) {
				System.out.println("JMBG nije validan!");
				return;
			}
			break;
			
		case 2:
			if(yyy>600) {
				yyy = yyy + 1000;
			}
			else {
				yyy = yyy + 2000;
			}
			
			boolean checkYear = yyy%4 == 0 && (yyy%400==0 || yyy%100!=0);
			
			if(checkYear) {
				if(dd<1 || dd>29) {
					System.out.println("JMBG nije validan!");
					return;
				}
			}
			else {
				if(dd<1 || dd>28) {
					System.out.println("JMBG nije validan!");
					return;
				}
			}
			break;
		default:
			System.out.println("JMBG nije validan!");
			return;
		}
		
		if(rr<70 || rr>80) {
			System.out.println("JMBG nije validan!");
			return;
		}
		
		if(bbb<0 || bbb>999) {
			System.out.println("JMBG nije validan!");
			return;
		}
		
		int a = Integer.parseInt(jmbg.substring(0, 1));
		int b = Integer.parseInt(jmbg.substring(1, 2));
		int c = Integer.parseInt(jmbg.substring(2, 3));
		int d = Integer.parseInt(jmbg.substring(3, 4));
		int e = Integer.parseInt(jmbg.substring(4, 5));
		int f = Integer.parseInt(jmbg.substring(5, 6));
		int g = Integer.parseInt(jmbg.substring(6, 7));
		int h = Integer.parseInt(jmbg.substring(7, 8));
		int i = Integer.parseInt(jmbg.substring(8, 9));
		int j = Integer.parseInt(jmbg.substring(9, 10));
		int l = Integer.parseInt(jmbg.substring(10, 11));
		int m = Integer.parseInt(jmbg.substring(11, 12));
		
		int control = 11 - ((7*(a+g) + 6*(b+h) + 5*(c+i) + 4*(d+j) + 3*(e+l) + 2*(f+m))%11);
		
		if(control>9) {
			control = 0;
		}
		
		if(control!=k) {
			System.out.println("JMBG nije validan!");
			return;
		}
		
		System.out.println("JMBG je validan!");
		
	}

}
