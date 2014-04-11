package playground;

import someClasses.ClassA;
import someClasses.ClassB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassA objectA = new ClassA("classA", 4.3);
        objectA.setLabel("modification for BranchA - second user");
        objectA.setAmount(5.0);
        
        ClassB objectB = new ClassB("dfhaksdfjhas", true);
        objectB.setNegation(false);
        
        System.out.println(objectA.toString());
        objectB.setNegation(false);
    }
}
