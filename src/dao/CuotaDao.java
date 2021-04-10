package dao;

import org.hibernate.HibernateException;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;

public class CuotaDao {

    private static Session session;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("ERROR en la capa de acceso a datos", he);
    }

    
    public int agregar(Cuota objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

    
    public Cuota traer(int nroCuota) throws HibernateException {
        Cuota objeto = null;
        try {
            iniciaOperacion();
            objeto = (Cuota) session.get(Cuota.class, nroCuota);
        } finally {
            session.close();
        }
        return objeto;
    }
    
    public void actualizar(Cuota objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}


}