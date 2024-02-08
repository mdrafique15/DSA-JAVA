public class overloading {
    //function overloading (inheritance)
    public static void main(String[] args) {
        Calculator calc = new Calculator();
       System.out.println("sum is :" + " " +calc.sum(2,2));
       System.out.println("sum is :" + " " +calc.sum((float)9.2,2));
    }
}
    class Calculator{
        int sum(int a, int b){
            return a+b;
        }
        int sum(int a, int b,int c){
            return a+b+c;
        }
        float sum(float a, float b){
            return a+b;
        }
    }
    

