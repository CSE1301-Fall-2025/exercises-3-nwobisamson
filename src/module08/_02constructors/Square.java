package module08._02constructors;

// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle {
     
   public Square() {
      super(1,1);
   }

   public Square (int side){
      super(side,side);
   }

     public static void main(String[] args)
     {
        Rectangle r = new Rectangle(3,5);
        r.draw();
        // 4. Uncomment these to test
         Square s1 = new Square();
         s1.draw();
         Square s = new Rectangle(3,3);
         s.draw();
     }
}
