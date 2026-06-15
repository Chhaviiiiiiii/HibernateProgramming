import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdgi.entity.Employee;

public class EmployeeApp3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Employee e = s.load(Employee.class,1);
		
		System.out.println(e);
		tr.commit();
		s.close();
	}

}
