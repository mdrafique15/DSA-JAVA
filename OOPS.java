public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();  
        p1.setcolor("blue");
        System.out.println(p1.getcolour());
        p1.settip(6);
        System.out.println(p1.gettip());

        p1.setcolor("red");
        System.out.println(p1.getcolour());
    }
}
    class Pen{
    //properties
       private String color;
       private int tip;

    //getters
    String getColor() {
        return this.color;
        }
       
       int gettip(){
        return this.gettip();
        }

   //functions (SETTERS)
       void setcolor(String newcolour){
       color = newcolour;
       }
      void settip(int newtip){
      tip = newtip;
       }
}

