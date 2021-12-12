package com.example.project.DAO.Implementation;

import com.example.project.DAO.AlumniDAO;
import com.example.project.bean.Alumni;
import com.example.project.bean.Alumni;
import com.example.project.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

import java.util.List;
public class AlumniDAOImpl implements AlumniDAO {
    @Override
    public int login(Alumni alumni) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String email=alumni.getEmail();
            String password=alumni.getPassword();
            System.out.println(email+" "+password);

            Query q=session.createQuery("FROM Alumni WHERE email= :username and password=:pass");
            q.setParameter("username", email);
            q.setParameter("pass", password);
            List<Alumni> alumniList= (List<Alumni>) q.list();

            t.commit();
            session.close();
            return alumniList.get(0).getId();
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return -1;
        }
    }
}
