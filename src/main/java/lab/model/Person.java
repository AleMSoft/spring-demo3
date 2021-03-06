package lab.model;

import java.util.List;

public interface Person {

  int getId();

  String getName();

  Country getCountry();

  int getAge();

  float getHeight();

  boolean isProgrammer();

  List<Contact> getContacts();

  boolean isBroke();

  Person withBroke(boolean broke);

  void sayHello(Person person);
}
