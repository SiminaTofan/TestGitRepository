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
        objectA.setLabel("modification for BranchA - main user indeed");
        objectA.setAmount(5.0);
        
        System.out.println("bla bla blaaa...from first user");
    }
}
