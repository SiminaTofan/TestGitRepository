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
        objectA.setLabel("modification for BranchA - master user");
        objectA.setAmount(6.0);
        
        ClassB objectB = new ClassB("dfhaksdfjhas", true);
        objectB.setNegation(true);
        
        System.out.println(objectA.toString());
        objectB.setNegation(false);
    }
}
