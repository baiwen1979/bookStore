package app.bookstore.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateHelper {

	private static SessionFactory sf;
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			try {
				Configuration cfg = new Configuration();
				sf = cfg.configure().buildSessionFactory();
			}
			catch (Throwable ex) {
				System.err.println("Initialize Session Factory Failed:" + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		return sf;
	}
}
