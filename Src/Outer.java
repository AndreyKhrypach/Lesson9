public class Outer {
    int x = 10;

    class InnerClass {
       //int y = 5;
        int x = 15;
       public int myInnerMethod() {
           return Outer.this.x;
       }
    }

    void sum() {
        //System.out.println(x + new InnerClass().y);
    }
}
