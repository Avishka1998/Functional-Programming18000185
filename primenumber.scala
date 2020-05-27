object primenumber{
	
	var i:Int=0;

	def prime(a:Int):Boolean = {
		if(i==1){
			return true;
			}
		else if(a%i==0){
			return false;;
			}
		else{
			i=i-1;
			prime(a);
			}
		}	

	def main(arg: Array[String]){
		println("Enter Number   ");
		val c=scala.io.StdIn.readInt();
		i=c/2;
		println(prime(c));
		}

}