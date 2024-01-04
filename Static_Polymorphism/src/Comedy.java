package Static_Polymorphism.src;
public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Happy Moment",
                "Funny Music",
                "Something funny Happens");
    }
    public void watchComedy(){
        System.out.println("Watching Comedy");
    }
}
