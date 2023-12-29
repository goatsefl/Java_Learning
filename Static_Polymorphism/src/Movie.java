public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title +" is a " + instanceType + " film");
    }

//  This is an example of a static factory method. A static factory method is a method that returns an instance of a class.
//  It's often used to create instances of a class based on certain parameters or conditions.
    public static Movie getMovie(String type,String title){
        return  switch(type.toUpperCase().charAt(0)) {
            case 'S' -> new ScienceFiction(title);
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}


