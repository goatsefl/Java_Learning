public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber cplxms) {
        this.real -= cplxms.getReal();
        this.imaginary -= cplxms.getImaginary();
    }

    public void add(ComplexNumber cplxma) {
        this.real += cplxma.getReal();
        this.imaginary += cplxma.getImaginary();
    }
}