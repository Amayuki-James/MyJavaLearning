package JavaClasses;

// If inner class is private, it can only be accessed within the outer class
class OuterClass {
    int x = 10;

    /* If we use "private" instead of "public", the code will break
     * Because the inner class is private, it can only be accessed within the outer class
     */
    public class InnerClass{
        int y = 5;
    }
}

public class PrivateInnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        //Error will be thrown here
        //Error msg: Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
                   //OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
    
}
