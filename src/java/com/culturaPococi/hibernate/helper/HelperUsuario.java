/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.hibernate.helper;



import com.culturaPococi.dominio.hibernate.Usuarionormal;
import com.culturaPococi.hibernate1.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Miguel
 */
public class HelperUsuario {
   
    
   private  Session session = null;
   private  Transaction tx =null;

    public HelperUsuario() {
        System.out.println("---Conecto(Hibernate)---");
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.tx = session.beginTransaction();
    }
       
    
    public Usuarionormal getValidarUser(String email, String pass) {
        Usuarionormal user = null;
        System.out.println("*****Entro al getValidarUser Hibernate******");
        try {        
            String sql = "from Usuarios u where u.email='" + email + "' and u.password='" + pass + "'";
            
            Query q = session.createQuery(sql);
            user = (Usuarionormal) q.uniqueResult();
        } catch (Exception e) {
            System.out.println("*ERROR****Entro al getUsuer***CATH***");
        } 
        return user;
    }
    
    public Usuarionormal getUsuario(String email) {
        Usuarionormal user = null;        
        System.out.println("*****Entro al getUsuario Hibernate******"+email);
        try {            
            String sql = "from Usuarios u where u.email='" + email + "'";            
            Query q = session.createQuery(sql);
            user = (Usuarionormal) q.uniqueResult();

        } catch (Exception e) {           
            System.out.println("*ERROR****Entro al getUsuer***CATH***");
        }
        return user;
    }
  
    public Boolean getInsertUsuario(Usuarionormal user) {
        System.out.println("*****Entro al getInsertUsuario Hibernate******");
         Boolean inserto= false;      
        
        try {
              session.save(user);            
              tx.commit();
             inserto= true;
             
        } catch (Exception e) {  
            tx.rollback();
            System.out.println("*ERROR****Entro al InsertUsuario***CATH***");
            inserto= false;
        }
        return inserto;
    }
    
    
    
    
}
