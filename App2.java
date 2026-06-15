import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdgi.Product.Product;

public class App2 {

	public static void main(String[] args) {
		
		Configuration cfg =  new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s  = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Product p = new Product(2,"Mic",300);

		s.update(p);
		tr.commit();
		s.close();
		
	}

}
