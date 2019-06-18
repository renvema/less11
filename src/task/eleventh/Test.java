
package task.eleventh;

public class Test {


    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new Exception("Who called me?");
        } catch (Exception e) {
            if (e.getStackTrace().length < 3) {
                return null;
            } else {
                return e.getStackTrace()[2].getClassName() + "#"
                        + e.getStackTrace()[2].getMethodName();
            }
        }


    }
}
