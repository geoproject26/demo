package org.demo.spring.service;

import org.demo.spring.dao.RecordDAO;
import org.demo.spring.model.Record;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    private RecordDAO recordDAO;

    public void setRecordDAO(RecordDAO recordDAO){
        this.recordDAO = recordDAO;
    }


    public void addRecord(Record record) {

    }

    public void updateRecord(Record record) {

    }

    public void removeRecord(int id) {

    }

    public Record getRecordById(int id) {
        return null;
    }

    public List<Record> getRecordByName(String name) {
        return null;
    }

    public List<Record> listRecords() {
        return null;
    }
}
