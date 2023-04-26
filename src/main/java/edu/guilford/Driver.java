package edu.guilford;

/**
 * Hello world!
 *
 */
public class Driver 
{
    public static void main( String[] args )
    {

        //Print out the Rational object r and rat
        Rational r = new Rational(1, 2);
        System.out.println("r: " + r);
        Rational rat = new Rational();
        System.out.println("rat: " + rat + "\n");

        //Print out the negate for rat and r
        r.negate();
        System.out.println("r.negate: " + r);
        rat.negate();
        System.out.println("rat.negate: " + rat + "\n");

        //Print the invert for r and rat
        r.invert();
        System.out.println("r.invert: " + r);
        rat.invert();
        System.out.println("rat.invert: " + rat + "\n");

        //Print the toDouble for r and rat
        System.out.println("r.toDouble: " + r.toDouble());
        System.out.println("rat.toDouble: " + rat.toDouble() + "\n");

        //Print the add for r and rat
        System.out.println("r.add(r): " + r.add(r));
        System.out.println("rat.add(rat): " + rat.add(rat) + "\n");

        System.out.println("r.toString: " + r.toString());
        System.out.println("rat.toString: " + rat.toString());


        
    }
}
