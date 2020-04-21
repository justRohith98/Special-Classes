package level_4;

public class StringBuilderMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("Learning is fun");
		sb1.insert(9, "java");
	      System.out.println(sb1);
	      sb1.replace(9, 13, "Everything");
	      
	    String Str3 ="AKNJSDHFVFBJ";
	      System.out.println(Str3.replace("AA","0"));
	      
	      sb1.deleteCharAt(0);
	      sb1.delete(2, 10);
	      System.out.println(sb1);
	      sb1.reverse();
	      System.out.println(sb1);
	}

}
