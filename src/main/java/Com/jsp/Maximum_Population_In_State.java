package Com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class Maximum_Population_In_State {
	public static void main(String[]args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query d=em.createQuery("select b from EntityTable b where b.State=?1"); 
		Scanner v=new Scanner(System.in);
		System.out.println("Enter state Name");
		long k=0;
		long k2=0;
		long k3=0;
		long sum=0;
		String name="";
		String name1="";
		String d1=v.nextLine();
		d.setParameter(1,d1);
		List<EntityTable> l=d.getResultList();
		if(l.size()>0)
		{
			for(EntityTable vb:l)
			{
				k=vb.getPopulation();
				sum+=k;
				if(k>k2)
				{
					k2=k;
					k3=k2;
					name=vb.getDist();
				}
				else if(k3>k)
				{
					k3=k;
					name1=vb.getDist();
				}
				
			}
			System.out.println("Total population of "+d1+" is "+sum);
			System.out.println(name+" is largest Density State in "+d1+"Population "+"is "+k2);
			System.out.println(name1+" Low Density State "+k3);
		}else  System.out.println("Enter vailid Name");
		
	}
	

}
