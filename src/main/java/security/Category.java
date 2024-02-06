package security;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@Size(min = 2, max = 10, message = "catcode should be >= 2 and <= 10")
	@Column(name = "catcode")
	String catcode;
	@Column(name = "catdesc")
	String catdesc;

	public Category() {
	}

	public Category(String catcode, String catdesc) {
		super();
		this.catcode = catcode;
		this.catdesc = catdesc;
	}

	public String getCatcode() {
		return catcode;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}

	public String getCatdesc() {
		return catdesc;
	}

	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
}