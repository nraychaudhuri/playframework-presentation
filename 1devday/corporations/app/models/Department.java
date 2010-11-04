package models;
import java.util.Date;
import javax.persistence.*;
import play.db.jpa.Model;

@Entity
public class Department extends Model {
	public String name;
	
	@Override
	public String toString() {
		return name;
	}
}