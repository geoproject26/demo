package org.demo.spring.controller;

import org.demo.spring.model.Record;
import org.demo.spring.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecordController{
    private RecordService recordService;

    @Autowired(required = true)
    @Qualifier(value = "recordService")
    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    @RequestMapping(value = "record", method = RequestMethod.GET)
    public String listRecords(Model model){
        model.addAttribute("record", new Record());
        model.addAttribute("listRecords", this.recordService.listRecords());
        return "record";
    }
}