

public class Formatting {
    public static void main(String[] args){

        /* Text blocks are a simple way to format Stings without remembering difficult syntax. */

        String block = """
                This is how the outPut will be
                    Whatever you feel like ./'"/..,
                        "" Cannot add 3 double quotes, 
                                    As they are not useful.
                                     the way you write the literal string value, that's how it's going 
                                     to be printed.""";

        System.out.println(block);

        // There is a System.out.printf(), similar like syntax in c and c++, where we can specify format specifiers.

        int age = 45;
        int year = 2023;
        System.out.printf("My age is %d in the year %d%n", age, year);

//  The %d is format specifier for the type int, if we need float, we can use %f
//  age, year after the String literal is used to specify for which format it is used.

        /*
    If a user wants to specify precision of 4 points after the decimal, they can do it by this %.4f
    Let's see how it works.

        */
        System.out.printf("%d is %.6f%n",year,(float)age);
        System.out.printf("%10d is %.1f",year,(float)age);

//  This is updated way to use.

        String formats = "My age is %d".formatted(age);

        System.out.printf(formats);

//  This is outdated.

        formats = String.format("My age is %d",age);

        System.out.printf(formats);

    }
}
