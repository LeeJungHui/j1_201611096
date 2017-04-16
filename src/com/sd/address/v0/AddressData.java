package com.sd.address.v0;
import java.util.*;
public class AddressData implements Subject
{
  public ArrayList<Observer> observers = new ArrayList<Observer>();
  private String name;
  private String phone;
  
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(name,phone);
    }
  }
  
  public void measurementsChanged() {
    notifyObservers();
  }
  
  public void setMeasurements(String name,String phone) {
    this.name = name;
    this.phone = phone;
    measurementsChanged();
  }
  
  public String getName() {
    return name;
  }
  
  public String getPhone() {
    return phone;
  }
}