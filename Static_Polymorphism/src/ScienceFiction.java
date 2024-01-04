package Static_Polymorphism.src;
public class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something new",
                "Electronic Music",
                "Thrilling End");
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science Fiction");
    }
}
