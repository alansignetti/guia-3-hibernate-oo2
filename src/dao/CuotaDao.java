package dao;

import org.hibernate.HibernateException;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Cuota;

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

}