package org.example.ex_04.repositories;

import org.example.ex_04.entity.AuthorsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public AuthorRepository() {}

    public AuthorsEntity authorById(int id){

        Session session = sessionFactory.openSession();
        AuthorsEntity readAuthorId  = session.get(AuthorsEntity.class, id);

        session.close();
        return readAuthorId;
    }
}
