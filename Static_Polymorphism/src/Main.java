import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Movie m1 = new Movie("Gladiator");

//  This is a Movie reference, Sub-Class is Adventure with Overridden method watchMovie().
        Movie m2 = new Adventure("Scary Movie");

//  This is a Movie reference, Sub-Class is Comedy with Overridden method watchMovie().
        Movie m3 = new Comedy("Hera Pheri");

//  This is a Movie reference, Sub-Class is ScienceFiction with Overridden method watchMovie().
        Movie m4 = new ScienceFiction("Robot 2.0");



        m1.watchMovie();
        m2.watchMovie();
        m3.watchMovie();
        m4.watchMovie();


//  This will be pretty new as we're trying to access something different in terms of basic method.


        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("The options are A for Adventure, C for Comedy and S,Q are Science fiction and Quit:");

            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie1 = Movie.getMovie(type,title);
            movie1.watchMovie();
        }
//  Movie.getMovie(type,title) won't be compiled with an error if the cast as Adventure class is present.
        Adventure a1 =  (Adventure) Movie.getMovie("A","Caged");
        a1.watchMovie();
    }
}