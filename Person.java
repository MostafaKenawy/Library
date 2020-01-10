
package project.pkg1;


import java.util.ArrayList;

public abstract class Person {

    protected String name;
    protected int age;
    protected String Address;
    protected int phone ;

    public Person() {
    }

    public Person(String name, int age ,String Address,int phone) {
        this.age  = age;
        this.name = name;
        this.Address = Address;
        this.phone = phone ;
    }
     //public abstract boolean Search ();
}
