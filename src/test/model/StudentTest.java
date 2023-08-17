package test.model;

import app.model.Student;
import test.interfaces.ITest;

public class StudentTest implements ITest{

  @Override
  public void test() {
    System.out.println("#### Starting StudentTest ####");
    Student student = new Student("Gabriel", "Avenida Gerson Maturani, 175", "Sistemas da Informação", 2023, 230);
    System.out.println(student.toString());
    student.setAddress("Rua José Silva Figueiredo, 115");
    student.setFee(500);
    student.setProgram("Engenharia");
    student.setYear(2024);
    System.out.println(String.format("getAddress(): %s", student.getAddress()));
    System.out.println(String.format("getFee(): %s", student.getFee()));
    System.out.println(String.format("getName(): %s", student.getName()));
    System.out.println(String.format("getProgram(): %s", student.getProgram()));
    System.out.println(String.format("getYear(): %s", student.getYear()));
    System.out.println("#### Finishing StudentTest ####");
    System.out.println();
    }

}