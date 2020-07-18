/*
 * B10433006_張舒婷
 */

public class OperatorTest {

    public static void main(String[] args) {
        Operator myOp = new MultiplyOp(new AddOp(5,7), new DivideOp(12, 3));
        System.out.println("myOp.run() -> " + myOp.run());
        System.out.printf("myOp is "+ myOp);
    }
    
}
