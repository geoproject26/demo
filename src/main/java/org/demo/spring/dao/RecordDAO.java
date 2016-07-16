package org.demo.spring.dao;

import org.demo.spring.model.Record;

import java.util.List;

public interface RecordDAO {

    public void addRecord(Record record);

    public void updateRecord(Record record);

    public void removeRecord(int id);

    public Record getRecordById(int id);

    public List<Record> getRecordByName(String name);

    public List<Record> listRecords();

}
