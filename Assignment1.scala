object Assignment1{

def main(args: Array[String]) {

//1
def C(x:Double)=x*1.8+32.0;
println(C(35.0));

//2
def volume(r:Double) = 4.0/3.0*3.14*r*r*r;
println(volume(5.0));

//3
def books(n:Int):Double = n*24.95;
      def discount(a:Double):Double = a*0.4;
      def shipping(n:Int):Double = {
          if(n<=50){
              return 3;
          }
          else{
              return 3+((n-50)*0.75);
          }
      }
      
      println(books(60)-discount(books(60))+shipping(60));
    }  
}