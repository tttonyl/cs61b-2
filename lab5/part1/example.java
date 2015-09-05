class X {
}

class Y extends X {
}

class Example {
  public static void main(String[] args) {
    X x = new X();
    Y y = new Y();

    // x = y; valid: y is a subclass of X, therefore y is a X
    // y = x; error: incompatible types

    X[] xa = new Y[10];
    Y[] ya = new Y[10];

    xa = ya; 
    //ya = xa; // error. incompaitble types
    System.out.println("hello world");
  }
}

