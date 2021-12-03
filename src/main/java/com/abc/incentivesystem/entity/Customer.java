package com.abc.incentivesystem.entity;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Customer {
private  String  customerId;
private String name;
private String  contactNo;
private String email;
private List<Address> adresses;
private Booking booking;
}
