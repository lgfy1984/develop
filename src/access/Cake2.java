package access;
//: access/Cake.java
// Accesses a class in a separate compilation unit.

class Cake2 {
  public static void main(String[] args) {
    Pie x = new Pie();
    x.f();
  }
} /* Output:
Pie.f()
*///:~
