package com.sd.address.v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class AddressGUI extends JFrame implements ActionListener
{
  AddressData addressData = new AddressData();
  Address address;
  JPanel panel,panel2;
  JLabel name,phoneNum;
  JTextField nameT,phoneNumT;
  JButton add,sort,data;
  public AddressGUI()
  {
    panel = new JPanel(new GridLayout(2,2));
    panel2 = new JPanel(new GridLayout(1,3));
    getContentPane().add(panel,BorderLayout.NORTH);
    getContentPane().add(panel2,BorderLayout.SOUTH);
    setTitle("Address");
    name = new JLabel("Name");
    phoneNum = new JLabel("PhoneNumber");
    nameT = new JTextField(20);
    phoneNumT = new JTextField(20);
    add = new JButton("Add");
    sort = new JButton("Sort");
    data = new JButton("Data");
    add.addActionListener(this);
    data.addActionListener(this);
    sort.addActionListener(this);
    panel.add(name);
    panel.add(nameT);
    panel.add(phoneNum);
    panel.add(phoneNumT);
    panel2.add(add);
    panel2.add(data);
    panel2.add(sort);

  }
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if (cmd.equals("Add")){
      Address ad = new Address(addressData);
      addressData.setMeasurements(nameT.getText(),phoneNumT.getText());
      System.out.println("Regist Data!");
      System.out.println("Name : "+nameT.getText()+"\nPhoneNumber : "+phoneNumT.getText());
      nameT.setText("");
      phoneNumT.setText("");
    } 
    else if (cmd.equals("Sort"))
    {
      System.out.println("Start Sorting of data..");
    }
    else if (cmd.equals("Data"))
    {
      System.out.println("--------AddressList-------- int i = "+addressData.observers.size());
      for(int i=0; i<addressData.observers.size();i++)
      {
        System.out.println("Name : "+addressData.observers.get(i)/*.getName()+"PhoneNumber : "+addressData.observers.get(i).getPhone()*/);
      }
    }
  }
  public static void main(String[] args)
  {
    AddressGUI ad = new AddressGUI();
    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ad.pack();
    ad.setVisible(true);
  }
}