package in.abdulmajid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="coursetable")
public class Course {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
   private Integer cid;
   private String name;
   private double price;
   
   public Course() {
	// TODO Auto-generated constructor stub
}

public Course(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}

public Integer getCid() {
	return cid;
}

public void setCid(Integer cid) {
	this.cid = cid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
   
   
   
 
}
