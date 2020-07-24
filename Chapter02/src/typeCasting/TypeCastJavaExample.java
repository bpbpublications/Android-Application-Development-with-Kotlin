package typeCasting;

public class TypeCastJavaExample {
    // Java Code
    public void performTypeCast(Object data) {
        if (data instanceof String) {
            System.out.println("It's a string and length is " + ((String) data).length());
        } else if (data instanceof Number) {
            System.out.println("It's a number and some calculation can be performed");
        } else if (data instanceof Exception) {
            System.out.println("It's an exception and message is " + ((Exception) data).getMessage());
        } else if (data instanceof Boolean) {
            System.out.println("It's a boolean with value " + data);
        } else {
            System.out.println("I don't recognise this type at the moment");
        }
    }

    public void cast(Object data) {
        String strData = (String) data;
        System.out.println(strData);
    }
}
