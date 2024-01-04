package Static_Polymorphism.src;

import java.util.Scanner;
public class Main {
    public void main(String[] args) {
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
        while (true) {
            System.out.println("The options are A for Adventure, C for Comedy and S,Q are Science fiction and Quit:");

            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie1 = Movie.getMovie(type, title);
            movie1.watchMovie();
        }
//  Movie.getMovie(type,title) won't be compiled with an error if the cast as Adventure class is present.
        Adventure a1 = (Adventure) Movie.getMovie("A", "Caged");
        a1.watchMovie();

//  This is var, which is type inference local variable which can take type of initialized expression.
        var a12 = Movie.getMovie("C", "Charlie and the chocolate factory");
//  a12 will be an object which is of class type Movie, automatically inferred by compile time through initial expression.
        a12.watchMovie();

//  This will print "This has inferred it to string type now".
        var message = "This has inferred it to string type now";
        System.out.println(message);

//  instanceof and the advantages of using it by making efficient choices.
        Object unknownObject = Movie.getMovie("A", "Prometheus");

        if (unknownObject.getClass().getSimpleName() == "Adventure") {
            Adventure ax = (Adventure) unknownObject;
            ax.watchAdventure();
        }
//  Without assigning variable and just showing by casting and adding method to the expression.
        else if(unknownObject instanceof Comedy){
            ((Comedy)unknownObject).watchComedy();

//  Variable is already bound with syfy if the condition below returns true, if not, the above condition will be applied.
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}