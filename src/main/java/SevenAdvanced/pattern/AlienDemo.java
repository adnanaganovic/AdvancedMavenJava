package SevenAdvanced.pattern;

import Four.Advanced.Person.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AlienDemo {
    public static void main(String[] args) throws Exception {
//        Alien alien = new Alien();
//        Alien alien1 = new Alien();

        Alien alien = Alien.instance();
        Alien alien1 = Alien.instance();

        System.out.println(alien.hashCode());
        System.out.println(alien1.hashCode());


        //Razbijanje SINGLETON-a preko refleksija
        Class andjeo = alien.getClass();
        Constructor constructor = andjeo.getDeclaredConstructor();
        constructor.setAccessible(true);
        Alien alien2 = (Alien) constructor.newInstance();
        System.out.println(alien2.hashCode());


        Method[] methods = andjeo.getDeclaredMethods();
        for (Method method: methods){
            method.setAccessible(true);
            method.invoke(alien);
        }

        Field field = andjeo.getDeclaredField("SINGLETON");
        field.setAccessible(true);
        System.out.println(field+",");


        Person person = new Person();
        person.setName("Aria");
        person.setSurname("Aganović");
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("person.ser"));
        ous.writeObject(person);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person person1 = (Person) ois.readObject();
        System.out.println("Pročitani person: " + person1.getName()+" "+ person1.getSurname());
}
}
