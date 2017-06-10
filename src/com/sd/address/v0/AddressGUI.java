package com.sd.address.v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.List;
import java.util.Iterator;

public class AddressGUI extends JFrame implements ActionListener
{
  PersonDAOImpl personDAOImpl = new PersonDAOImpl();
  PersonVO person = new PersonVO();
  int i=0;
  AddressData addressData = new AddressData();
  Address address;
  JPanel panel,panel2;
  JLabel name,phoneNum,id;
  JTextField nameT,phoneNumT,idT;
  JButton add,delete,data,modify;
  public AddressGUI()
  {
    panel = new JPanel(new GridLayout(3,2));
    panel2 = new JPanel(new GridLayout(1,4));
    getContentPane().add(panel,BorderLayout.NORTH);
    getContentPane().add(panel2,BorderLayout.SOUTH);
    setTitle("Address");
    name = new JLabel("Name");
    phoneNum = new JLabel("PhoneNumber");
    id = new JLabel("Id");
    idT = new JTextField(20);
    nameT = new JTextField(20);
    phoneNumT = new JTextField(20);
    add = new JButton("Add");
    delete = new JButton("Delete(id)");
    data = new JButton("Data");
    modify = new JButton("Modify");
    add.addActionListener(this);
    data.addActionListener(this);
    delete.addActionListener(this);
    modify.addActionListener(this);
    panel.add(name);
    panel.add(nameT);
    panel.add(phoneNum);
    panel.add(phoneNumT);
    panel.add(id);
    panel.add(idT);
    panel2.add(add);
    panel2.add(delete);
    panel2.add(modify);
    panel2.add(data);

  }
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if (cmd.equals("Add")){
      String setName = nameT.getText();
      String setPhone = phoneNumT.getText();
      person.setId(++i);
      person.setName(setName);
      person.setAddress(setPhone);
      personDAOImpl.insert(person);
    } 
    else if (cmd.equals("Delete(id)"))
    {
      int setId= Integer.parseInt(idT.getText());
      System.out.println(setId);
      personDAOImpl.delete(setId);
    }
    else if (cmd.equals("Data"))
    {
      List persons=personDAOImpl.findAll();
      Iterator iter=persons.iterator();
      while(iter.hasNext()) {
          person=(PersonVO)iter.next();
          System.out.println(person.toString());
      }
    }
    else if (cmd.equals("Modify"))
    {
        String setName = nameT.getText();
        String setPhone = phoneNumT.getText();
        int setId = Integer.parseInt(idT.getText()+0);
        person.setId(setId);
        person.setName(setName);
        person.setAddress(setPhone);
        personDAOImpl.update(person);
    }
  }
}