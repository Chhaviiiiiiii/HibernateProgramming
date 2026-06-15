import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdgi.entity.Employee;

public class EmployeeApp1 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Employee e = new Employee("Ravii",300000);
		
		s.save(e);
		tr.commit();
		s.close();

	}

}
