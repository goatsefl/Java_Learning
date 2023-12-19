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
        System.out.println("Birth day is on =" + birthdate);
        System.out.println("Year is =" + birthdate.substring(startingIndex));
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