package level_4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s1=new Scanner(System.in);
  System.out.println("Please Enter a String");
  String str1 = s1.nextLine();
  int num1 = s1.nextInt();
  System.out.println(str1);
  String temp="";
  for (int i=0;i<=str1.length()-1;i++) {
	  temp=str1.charAt(i)+temp;
  }
  System.out.println(temp);
	}

}
