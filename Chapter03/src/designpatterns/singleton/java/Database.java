package designpatterns.singleton.java;
/**
 * Lazy initialization
 */
/*public class Database {
    private static Database database;
    private String name;

    private Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name) {
        //Create the object only if it's null else return the already created existing object.
        if (database == null) {
            System.out.println("Creating an object");
            database = new Database(name);
        }
        return database;
    }

    public String getName() {
        return name;
    }
}*/

import kotlin.jvm.Synchronized;

/**
 * Double checked locking
 * <p>
 * Using enums
 */
/*public class Database {
    private static volatile Database database;
    private String name;

    private Database(String name) {
        this.name = name;
    }


    //Only with synchronized getInstance method.
    //public static synchronized Database getInstance(String name) {
        //Create the object only if it's null else return the already created existing object.
    //    if (database == null) {
    //        System.out.println("Creating an object");
    //        database = new Database(name);
    //    }
    //    return database;
    //}
    public static Database getInstance(String name) {
        //Create the object only if it's null else return the already created existing object.
        if (database == null) {
            synchronized (Database.class) {
                if (database == null) {
                    System.out.println("Creating an object");
                    database = new Database(name);
                }
            }
        }
        return database;
    }

    public String getName() {
        return name;
    }
}*/

/**
 * Using enums
 */

public enum Database {
    INSTANCE;

    public String getName() {
        return INSTANCE.name();
    }
}