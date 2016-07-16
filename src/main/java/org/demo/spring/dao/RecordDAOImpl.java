package org.demo.spring.dao;

import org.demo.spring.model.Record;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecordDAOImpl implements RecordDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

   public void addRecord(Record record) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(record);
    }

   public void updateRecord(Record record) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(record);
    }


    public void removeRecord(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Record record = (Record) session.load(Record.class, new Integer(id));
        if (record != null) session.delete(record);

    }


    public Record getRecordById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Record record = (Record) session.load(Record.class, new Integer(id));
        return record;
    }


    public List<Record> getRecordByName(String name) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Record> list = session.createQuery("from Record where fio = :name").list();
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<Record> listRecords() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Record> list = session.createQuery("from Record ").list();
        return list;
    }

}
