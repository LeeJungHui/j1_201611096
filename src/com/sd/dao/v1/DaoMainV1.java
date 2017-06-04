package com.sd.dao.v1;

public class DaoMainV1
{
   public static void main(String[] args) {
      PersonDao personDao = new PersonDaoImpl();
      System.out.println("--- listing all...");
      for (Person person:personDao.getAllPersons()) {
         System.out.println("reading... "+person.getId() +", "+person.getName());
      }

      System.out.println("--- updating...");
      Person person =personDao.getAllPersons().get(0);
      person.setName("paper new");
      personDao.updatePerson(person);

      System.out.println("--- see if updated...");
      personDao.getPerson(0);
      System.out.println(person.getId() +", "+person.getName());
   }
}