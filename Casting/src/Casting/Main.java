package Casting;

public class Main {
  public static void main(String[] args) {
      Kucing anggora = new Kucing();
      
      Hewan hewan = anggora;
      hewan = (Hewan) anggora;
      
              
      Hewan hewan2 = new Kucing();
              ((Kucing) hewan2).meow();
  }  
}
