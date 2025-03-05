// class first {
//     public void firstMethod(){
//         int a = 29;
//         System.out.println(a);
//     }
// }
// class second extends first{
//     public void secondMethod(){
//         int b = 6;
//         System.out.println(b);
//     }
// }
// class App extends second {
//     public void thirdMethod(){
//         int c = 4;
//         System.out.println(c);
//     }
//     public static void main(String args[]){
//         App obj = new App();
//         obj.firstMethod();
//         obj.secondMethod();
//         obj.thirdMethod();
//     }
// }











// class Shape{
//     public void area(){
//         System.out.println("super class called by super keyword");
//     }
// }
// class App extends Shape{
//     int l;
//     int b;
//     public void area(){
//         System.out.println("area: " + l*b);
//     }
//     App(int l,int b){
//         this.l = l;
//         this.b = b;
//     }
//     public void supercall(){
//         super.area();
//     }
//     public static void main(String args[]){
//         App ob = new App(10,10);
//         ob.supercall();
//         ob.area();
//     }
// }










class Shape{
    public void calc(){
        System.out.println("caluclating...");
    }
}
class Rectange extends Shape{
    public double l;
    public double b;
    Rectange(double l,double b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println(l*b);
    }
}
class Triangle extends Shape{
    public double b;
    public double h;
    Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }
    public void area(){
        System.out.println(0.5*b*h);
    }
}
class Circle extends Shape{
    public double r;
    Circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println(3.14*r*r);
    }
}
class Square extends Shape{
    public double s;
    Square(double s){
        this.s = s;
    }
    public void area(){
        System.out.println(s*s);
    }
}
class App{
    public static void main(String args[]){
        Rectange rec = new Rectange(12.3, 15.7);
        rec.calc();
        rec.area();
        Triangle tri = new Triangle(13.6, 15.3);
        tri.calc();
        tri.area();
        Circle cir = new Circle(12.5);
        cir.calc();
        cir.area();
        Square sq = new Square(6.8);
        sq.calc();
        sq.area();
    }
}