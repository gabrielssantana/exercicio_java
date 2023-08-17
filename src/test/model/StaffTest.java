package test.model;

import app.model.Staff;
import test.interfaces.ITest;

public class StaffTest implements ITest{

  @Override
  public void test() {
    System.out.println("#### Starting StaffTest ####");
    Staff staff = new Staff("Gabriel", "Avenida Gerson Maturani, 175", "Don Domênico", 1500);
    System.out.println(staff.toString());
    staff.setAddress("Rua José Silva Figueiredo, 115");
    staff.setSchool("Alfa");
    staff.setPay(2000);
    System.out.println(String.format("getAddress(): %s", staff.getAddress()));
    System.out.println(String.format("getSchool(): %s", staff.getSchool()));
    System.out.println(String.format("getName(): %s", staff.getName()));
    System.out.println(String.format("getPay(): %s", staff.getPay()));
    System.out.println("#### Finishing StaffTest ####");
    System.out.println();
    }

}