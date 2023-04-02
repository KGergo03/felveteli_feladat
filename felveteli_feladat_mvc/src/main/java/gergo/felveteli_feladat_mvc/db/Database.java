package gergo.felveteli_feladat_mvc.db;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import gergo.felveteli_feladat_mvc.model.User;

public class Database {
	
private SessionFactory sessionFactory;
	
	public Database () {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}
	
	public User getUserById (int userId) {
		
		User user = null;
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		user = session.get(User.class, userId);
		
		Query query = session.createNativeQuery("Select * FROM users_titles_id Where userid = ?1" );
		query.setParameter(1, userId);
		List<Object[]> rows = query.getResultList();
		
		for(int index = 0; index < rows.size(); index++) {
			
			int titleId = Integer.parseInt(rows.get(index)[2].toString());
			user.addTitleId(titleId);
			
			
		}
		tx.commit();
		session.close();
		
		return user;
	}
	
	public void closeDb() {
		
		sessionFactory.close();
	}

}
