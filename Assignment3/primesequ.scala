object primesequ{
	
	def prime(a:Int,b:Int=2):Boolean = {
		if(a==2){
			return true;
			}

		else if(a<2){
			return false;
			}

		else if(a%b==0){
			return false;;
			}

		else if(b*b>a){
			return true;
			}

		else{
			return prime(a,b+1);
			}
		}

	def primeseq(n:Int):Int = {

		if(n<=2){
			return 2;
			}

		else if(prime(n-1)){
			println(n-1);
			return primeseq(n-2);
			}
		else{
			return primeseq(n-1);
		}
	
	}
			
	def main(args: Array[String]){
			println(primeseq(10));
			}

}
