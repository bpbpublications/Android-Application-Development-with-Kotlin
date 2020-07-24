package designpatterns.singleton.java;

/*public class SingletonExample {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("DB1");
        System.out.println(db1.getName());

        Database db2 = Database.getInstance("DB1");
        System.out.println(db2.getName());
    }
}*/

public class SingletonExample {
    public static void main(String[] args) {
        Database db1 = Database.INSTANCE;
        System.out.println(db1.getName());

        Database db2 = Database.INSTANCE;
        System.out.println(db2.getName());
    }
}
