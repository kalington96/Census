package Com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

public class Create_Entity_TableBy_jDBC {
	public static void main(String[]args) throws ClassNotFoundException, SQLException
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection v=DriverManager.getConnection("jdbc:mysql://localhost:3306/Census","root","Kalington@95");
		Statement mn=v.createStatement();
		ResultSet b=mn.executeQuery("select * from T4");
		while(b.next())
		{
			EntityTable v3=new EntityTable();
			v3.setState(b.getString("State"));
			v3.setDist(b.getString("District"));
			v3.setPopulation(b.getLong("Population"));
			v3.setMale(b.getString("Male"));
			v3.setFemale(b.getString("Female"));
			v3.setLiterate(b.getLong("Literate"));
			v3.setMale_Literate(b.getLong("Male_Literate"));
			v3.setFemale_Literate(b.getLong("Female_Literate"));
			et.begin();
			em.persist(v3);
			et.commit();
		}
		
		
		
	}

}
