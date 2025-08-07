package Ex1;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;
    public QuadraticEquation() {};
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = 0;
        if(this.a != 0 ){
            delta = Math.pow(this.b,2) - 4*this.a*this.c;
        }
        return delta;
    }
    public double getRoot1(){
     double delta = getDiscriminant();
     double root1 = 0;
     if(delta > 0){
         root1 = (-this.b + Math.sqrt(delta) ) / (2 * this.a);
     }
        return root1;
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        double root2 = 0;
        if(delta > 0){
            root2 = (-this.b - Math.sqrt(delta) ) / (2 * this.a);
        }
        return root2;
    }
    public double getRoot(){
        double delta = getDiscriminant();
        double root = 0;
        if(delta == 0){
            root = -this.b /(2*a);
        }
        return root;
    }
    public void getCalculator(){
        double delta = getDiscriminant();
        if(this.a == 0){
            if(this.b == 0){
                if(this.c == 0){
                    System.out.println("Phương trình vô số nghiệm");
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }else{
                double root = -this.b/this.a;
                System.out.println("nghiệm phương trình r = " + root);
            }
        }else{
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else if(delta == 0){
                getRoot();
                System.out.println("Phương trình có nghiệm kép: "+ getRoot());
            }else{
                getRoot1();
                getRoot2();
                System.out.println("Phương trình có hai nghiệm phân biệt :" );
                System.out.println("r1 = "+ getRoot1() +  ", r2 = "+ getRoot2());
            }
        }
    }
}
