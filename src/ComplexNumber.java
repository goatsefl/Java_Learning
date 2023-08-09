public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
        real += getReal();
        imaginary += getImaginary();
    }

    public void subtract(double real, double imaginary){
        real = getReal() - real;
        imaginary = getImaginary() - imaginary;
    }

    public void add(ComplexNumber cplxma){

    }

    public void subtract(ComplexNumber cplxms){

    }
}
