

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;


	public class Manager
	{
	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Person p1=new Person();
	    p1.setId(01);
		p1.setName("sarjanaa");
		session.save(p1);
		tx.commit();
		session.flush();
		session.close();
		System.out.println("done");
	}
	}

