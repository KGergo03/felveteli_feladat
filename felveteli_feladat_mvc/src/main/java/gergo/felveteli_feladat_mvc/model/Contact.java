package gergo.felveteli_feladat_mvc.model;

public class Contact {

	
	private int id;
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
