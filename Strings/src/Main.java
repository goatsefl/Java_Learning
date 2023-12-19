public class Main {

    /*There are multiple String methods, ranging more than 60. This class will just use few to give an idea of the usage
     * and how it can help the programmer or developer to use these methods making the code readable and */
    public static void main(String[] args) {
        printInformation("Hello Kitty Joel");
//        printInformation("");


//        System.out.printf("The first index of l = %d \n", s.indexOf("l"));
//        System.out.printf("The last index of l = %d \n", s.lastIndexOf("l"));

        String x = "    ";

        if(x.isBlank()){
            System.out.println("String is Blank");
        }
        else{
            System.out.println("String isn't Blank");
        }
//        The difference between isEmpty() and isBlank() is very minimal. The output of isBlank is true, whereas, isEmpty() printed "isn't Empty".
//        isBlank searches for all the whitespaces.

        if(x.isEmpty()){
            System.out.println("String is Empty");
        }
        else{
            System.out.println("String isn't Empty");
        }
        System.out.printf("Length = %d %n", x.length());

//      Converts the string into LowerCase

        String xLower = x.toLowerCase();

//      Each and every method below are comparison methods.

        if ("Hello Global Citizens".equals("Hello Global Citizens")){
            System.out.println("Value matches the case and value");
        }
        if ("Hello Global Citizens".equalsIgnoreCase("hello Global citizens")){
            System.out.println("Value does not match the case, only value");
        }
        if ("Hello Global Citizens".startsWith("Hello")){
            System.out.println();
        }
        if ("Hello Global Citizens".endsWith("citizens")){
            System.out.println();
        }
        if ("Hello Global Citizens".contains("Global")){
            System.out.println();
        }

//      Equals() and contentEquals() are both same but, contentEquals also works for StringBuilders.

        if ("Hello Global Citizens".contentEquals("Global")){
            System.out.println();
        }
//  These are String manipulation methods below.
        String birthdate = "03/07/1996";
        int startingIndex = birthdate.indexOf("1996");
        System.out.println("Birth day is on = " + birthdate);
        System.out.println("Year is = " + birthdate.substring(startingIndex));

//  substring(Starting Index, Ending Index)
//  substring() has 2 parameters if not, it can take an index and provide you the string till the end.

        System.out.println("Month = " + birthdate.substring(3,5));

//  Delimiter using String.join

        String joined = String.join("/","03","07","1996");
        System.out.println("New Date using joins = " + joined );

//  Using .concat() on joined.
        joined = "";
        joined = joined.concat("03");
        joined = joined.concat("/");
        joined = joined.concat("07");
        joined = joined.concat("/");
        joined = joined.concat("1996");
        System.out.println("New Date using .concat() = " + joined );

//  Using basic syntax.

        joined = "03" + "/"+ "07" + "/" + "1996";

        System.out.println("New date using basic syntax" + joined);

//  Using basic concat chaining.

        joined = "03".concat("/").concat("07").concat("/").concat("1996");
        System.out.println(joined);

//  Using .replace() to replace existing string literal or string with new string literal or string.

        joined = joined.replace("/","-");
        System.out.println("Using .replace() to replace '/' to '-': " + joined );

//  New combination .replaceFirst() will only replace first occurrence of the target with replacement parameter.

        joined = joined.replaceFirst("-","/");
        System.out.println(".replaceFirst() gives you " + joined);

        joined = joined.replaceAll("-","/-///-/");
        System.out.println("replaceAll() changes all occurrences of string with replacement " + joined);


//  repeat method and indent method are one of the more useful methods, if you want a repeated string to be printed in a simple way.
        System.out.println("Tim\n".repeat(4));
        System.out.println("|\n".repeat(8).indent(4));

//  Negative number deletes the trailing whitespaces and moves the string to the left.
        System.out.println("        Cook, there are 9 spaces behind me in native code, but in output it will be 6.\n".repeat(4).indent(-3));
//  Unsigned number moves the String to the right and indents it "n" of spaces
        System.out.println("Apple\n".repeat(4).indent(3)); //
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("Second Character = %c %n", string.charAt(1));
        System.out.printf("Last Character = %c %n", string.charAt(length - 1)); // Remember, this line will throw an error if the string length = 0.
        System.out.printf("The first index of l = %d \n", string.indexOf("l"));
        System.out.printf("The last index of l = %d \n", string.lastIndexOf("l"));
        System.out.printf("Index of Joel = %d %n",string.indexOf("Joel"));

        if(string.isEmpty()) {
            System.out.println("Empty String found");

        } else {
            System.out.printf("String is of length is %d %n", length);
        }

    }

}

/* OUTPUT :

Length = 16
Second Character = e
Last Character = l
The first index of l = 2
The last index of l = 15
Index of Joel = 12
String is of length is 16
String is Blank
String isn't Empty
Length = 4
Value matches the case and value
Value does not match the case, only value


Birth day is on = 03/07/1996
Year is = 1996
Month = 07
New Date using joins = 03/07/1996
New Date using .concat() = 03/07/1996
New date using basic syntax03/07/1996
03/07/1996
Using .replace() to replace '/' to '-': 03-07-1996
.replaceFirst() gives you 03/07-1996
replaceAll() changes all occurrences of string with replacement 03/07/-///-/1996
Tim
Tim
Tim
Tim

    |
    |
    |
    |
    |
    |
    |
    |

     Cook, there are 9 spaces behind me in native code, but in output it will be 6.
     Cook, there are 9 spaces behind me in native code, but in output it will be 6.
     Cook, there are 9 spaces behind me in native code, but in output it will be 6.
     Cook, there are 9 spaces behind me in native code, but in output it will be 6.

   Apple
   Apple
   Apple
   Apple
 */