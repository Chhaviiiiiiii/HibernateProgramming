import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdgi.entity.Employee;

public class EmployeeApp2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Employee e = new Employee(1,"krishna",1200000);
		
		s.update(e);
		tr.commit();
		s.close();

	}

}
