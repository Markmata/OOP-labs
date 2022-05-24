package lab3;

public class Complex {
    double real, imaginary;

    /* Constructors */

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString(){
        if (imaginary < 0)
            return "(" + real + " " + imaginary + "i)";
        else
            return "(" + real + " + " + imaginary + "i)";
    }

     @Override
     public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Complex c = (Complex) obj;
        if (c.real != this.real)
            return false;
        if(c.imaginary != this.imaginary)
            return false;
        return true;
     }

    public Complex add(Complex c){
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    public Complex subtract(Complex c){
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public Complex multiply(Complex c){
        return new Complex(this.real * c.real - this.imaginary * c.imaginary,
                            this.imaginary * c.real + this.real * c.imaginary);
    }
}
