package gergo.felveteli_feladat_mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "titles")
public class Title {

	@Id
	@Column (name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "title")
	private String title;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + "]";
	}
	
	
	
	
	
	
	
	
}
