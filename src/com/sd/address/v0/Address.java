package com.sd.address.v0;
public class Address implements Observer {
 private String name;
 private String phone;
 private Subject addressData;
 
 public Address(Subject addressData) {
  this.addressData = addressData;
  addressData.registerObserver(this);
 }
 
 public void update(String name,String phone) {
  this.name = name;
  this.phone = phone;
 }
}