package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {


        Class c1 = Class.forName("ch04.Person");
        Person person = (Person)c1.newInstance();
        person.setName("Lee");
        System.out.println(person);

        // 위의 4줄이 아래 한줄과 동일한 방법
        Person person2 = new Person("Lee", 12);


        Class c2 = person.getClass();
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructors(parameterTypes);

        Object[] initargs = {"kim"};
        Person kimPerson = (Person)cons.newInstance(initargs);
        System.out.println(kimPerson);

        Person kim2 = new Person("kim");
    }
}
