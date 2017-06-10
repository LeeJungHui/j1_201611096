package com.sd.address.v0;
import java.util.List;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class AddressMain
{
  public static void main(String[] args)
  {
    AddressGUI ad = new AddressGUI();
    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ad.pack();
    ad.setVisible(true);
  }
}
