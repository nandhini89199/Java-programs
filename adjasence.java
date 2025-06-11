import java.util.*;
public class Main
{
    static int ver=4;
    static List<Integer> [] g=new ArrayList[ver];
	public static void main(String[] args) {
	for(int i=0;i<ver;i++)
	{
	    g[i]=new ArrayList<>();
	}
		addin(0,1);
		addin(0,2);
		addin(1,2);
		addin(2,3);
		print();
	}
	static void addin(int i,int j)
	{
	    g[i].add(j);
	    g[j].add(i);
	}
	static void print()
	{
	    for(int i=0;i<ver;i++)
	    {
	        System.out.print(i +" ");
	        for(int val:g[i])
	        {
	             System.out.print(val +" ");
	            
	        }
	         System.out.println();
	    }
	}
}