/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.hibernate.helper;

import com.culturaPococi.dominio.hibernate.UsuarioNormal;
import com.culturaPococi.hibernate.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Miguel
 */
public class HelperUsuario {

    private Session session = null;
    private Transaction tx = null;

    public HelperUsuario() {
        System.out.println("---Conecto(Hibernate)---");
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.tx = session.beginTransaction();
    }


    public Boolean getInsertUsuario(UsuarioNormal user) {
        System.out.println("*****Entro al getInsertUsuario Hibernate******");
        Boolean inserto = false;

        try {
            session.save(user);
            tx.commit();
            inserto = true;

        } catch (Exception e) {
            tx.rollback();
            System.out.println("*ERROR****Entro al InsertUsuario***CATH***");
            inserto = false;
        }
        return inserto;
    }
   
}

