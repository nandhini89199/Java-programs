import java.util.*;
public class Vowels and constant
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String a=sc.nextLine();
	    char b=sc.next().charAt(0);
	    int vo=0;
	    int con=0;
	    for (int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'){
	            vo+=1;
	        }
	        else{
	            con+=1;
	            }
	    }
	  System.out.println(vo);
	  System.out.println(con);
	    }
}