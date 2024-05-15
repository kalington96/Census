package Com.jsp;

import java.sql.ResultSet;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
@Entity
public class EntityTable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String State;
	private String Dist;
	private Long   Population;
	private String Male;
	private String Female;
	private long Literate;
	private Long   Male_Literate;
	private Long   Female_Literate;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public Long getPopulation() {
		return Population;
	}
	public void setPopulation(Long string) {
		Population = string;
	}
	public String getMale() {
		return Male;
	}
	public void setMale(String male) {
		Male = male;
	}
	public String getFemale() {
		return Female;
	}
	public void setFemale(String female) {
		Female = female;
	}
	public Long getMale_Literate() {
		return Male_Literate;
	}
	public void setMale_Literate(Long male_Literate) {
		Male_Literate = male_Literate;
	}
	public long getLiterate() {
		return Literate;
	}
	public void setLiterate(long l) {
		Literate = l;
	}
	public Long getFemale_Literate() {
		return Female_Literate;
	}
	public void setFemale_Literate(Long female_Literate) {
		Female_Literate = female_Literate;
	}

}