package level_4;
 
import java.util.Random;
public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Random r1= new Random();
   for(int i=1;i<=100;i++) {
	   System.out.println(r1.nextInt(100)+ 100);
	   System.out.println((int)(Math.random()*40000) +4000);
   }
	}

}
