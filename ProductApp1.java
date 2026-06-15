import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdgi.Product.Product;



public class App1 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Product p = new Product("Keyboard", 350.0);
		
		s.save(p);
    	tr.commit();
    	s.close();
    	sf.close();
		
	}

}
