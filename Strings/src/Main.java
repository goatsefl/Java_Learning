public class Main {

    /*There are multiple String methods, ranging more than 60. This class will just use few to give an idea of the usage
    * and how it can help the programmer or developer to use these methods making the code readable and */
    public static void main(String[] args) {
        printInformation("Hello Jarvis!!");
        printInformation("");
    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n",length);
        System.out.printf("Second Character = %c %n", string.charAt(1));
        System.out.printf("Last Character = %c %n",string.charAt(length -1));

        if(string.isEmpty()){
            System.out.printf("Empty String found");
        }
        else{
            System.out.printf("String is of length %d %n",length);
        }

        System.out.printf();
        System.out.printf();
        System.out.printf();
    }
}