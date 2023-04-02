package gergo.felveteli_feladat_mvc.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column (name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "name")
	private String name;
	
	@Transient
	private ArrayList<Integer> titleIds;
	
	public User () {
		
		this.titleIds = new ArrayList<>();
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getTitleIds() {
		return titleIds;
	}

	public void setTitleIds(ArrayList<Integer> titleIds) {
		this.titleIds = titleIds;
	}
	
	public void addTitleId (int titleId) {
		
		this.titleIds.add(titleId);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", titleIds=" + titleIds + "]";
	}
	
	
	
	
}
