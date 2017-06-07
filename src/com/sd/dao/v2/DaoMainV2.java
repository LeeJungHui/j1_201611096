package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2 {
    public static void main(String args[]){
        PersonDAOlmpl personDAOlmpl = new PersonDAOlmpl();
        PersonVO person = new PersonVO();

        person.setName("js1");
        person.setAddress("1 Hongji-dong");
        personDAOlmpl.insert(person);

        person.setName("js2");
        person.setAddress("2 Hongji-dong");
        personDAOlmpl.insert(person);

        List persons=personDAOlmpl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
            person=(PersonVO)iter.next();
            System.out.println(person.toString());
        }

        personDAOlmpl.delete(1);

        person.setId(2);
        person.setName("js2 updated");
        person.setAddress("2 Hongji-dong updated");
        personDAOlmpl.update(person);

        person=personDAOlmpl.findById(2);
        System.out.println("found by id..."+person);

        personDAOlmpl.close();
    }
}