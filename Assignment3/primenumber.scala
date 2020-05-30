object primenumber{
	
	def prime(a:Int,b:Int=2):Boolean = {
		if(a==2){
			return true;
			}

		else if(a<2){
			return false;
			}

		else if(a%b == 0){
			return false;;
			}

		else if(b*b>a){
			return true;
			}

		else{
			return prime(a,b+1);
			}
		}	

	def main(arg: Array[String]){
		println(prime(5));
		println(prime(8));
		}

}
