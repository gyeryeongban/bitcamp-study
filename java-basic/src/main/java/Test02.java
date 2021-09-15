
public class Test02 {

  public static void main(String[] args) {
    Test01.x = 100;

    Test01 obj1 = new Test01();
    obj1.v = 100;

    Test01 obj2 = new Test01();
    obj2.v = 300;

    obj1.m1();
    obj1.m2();

  }

}
