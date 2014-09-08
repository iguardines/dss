package com.devcrumb;
 
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devcrumb.dao.PersonDaoImpl;
import com.devcrumb.model.Person;
 
/**
 * App class with main method to test our DAO
 * 
 */
public class App {
     
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new 
                  ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDaoImpl dao = (PersonDaoImpl) context.getBean("personDao");

        Person peter = new Person("Peter", "Sagan");
        Person nasta = new Person("Nasta", "Kuzminova");

        dao.save(peter);
        dao.save(nasta);

        List<Person> persons = dao.getAll();
        for (Person person : persons) {
            System.out.println(person);
        }
        context.close();
    }
}