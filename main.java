  class Complex{
        int real;
        int imaginary;
    
    Complex(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex add(Complex c){
        int real=this.real+c.real;
        int imaginary=this.imaginary+c.imaginary;
        return new Complex(real,imaginary);
    }

    void display(){
        if (imaginary>=0){
            System.out.println("Complex number: "+real+" + "+imaginary+"i");
        }
        else   
        System.out.println("Complex number: "+real+" - "+(-imaginary)+"i");
    }
}



public class main{
    public static void main(String[] args) {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(4,5);
        System.out.println("First complex number: ");
        c1.display();
        System.out.println("Second complex number: ");
        c2.display();
        Complex sum=c1.add(c2);
        System.out.println("Sum of complex numbers: ");
        sum.display();
    }
}
