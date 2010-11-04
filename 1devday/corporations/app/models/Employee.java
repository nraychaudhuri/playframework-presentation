package models;
import java.util.Date;
import javax.persistence.*;
import play.db.jpa.Model;

@Entity
public class Employee extends Model {
	public String fullName;
	public Integer salary;
	
	@ManyToOne
	public Department department;
	
	@Override
	public String toString() {
		return fullName;
	}
}