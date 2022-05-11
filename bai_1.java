public class Main {
 
    public static void main(String[] args) {
      Tour a = new Tour();
      a.SetTour();
      a.getTour();
      System.out.print("daylathue: dinhbathi2021050617" +   a.getTax()); 
      NoTaxTour b = new NoTaxTour();
      b.SetTour();
      b.getTour();
     System.out.print("thue: dinhbathi2021050617 " +   b.getTax()); 
    }
 
}
