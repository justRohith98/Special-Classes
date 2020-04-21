package level_4;

public class String_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="I";
      str1 = str1+ "like";
      str1=str1+"java";
      System.out.println(str1);
      
      StringBuilder sb1= new StringBuilder("I");
      sb1.append("like");
      sb1.append("java");
      System.out.println(sb1);
      }

}
