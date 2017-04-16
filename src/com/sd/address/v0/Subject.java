package com.sd.address.v0;

public interface Subject
{
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}