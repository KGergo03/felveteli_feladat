package gergo.felveteli_feladat_mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "contacts")
public class Contact {

	@Id
	@Column (name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "contact")
	private String contact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", contact=" + contact + "]";
	}
	
	
	
}
