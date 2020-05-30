object lessnaddi{
	
	def lessnadd(n:Int):Int = {
		
		if(n==0){
			return 0;
			}

		else{
			if(n%2==0){
				var res:Int = (n-2) + lessnadd(n-2);
				return res;		
				}

			else{
				var res:Int = (n-1) + lessnadd(n-1);
				return res;
			}
		}	
	}

	def main(args: Array[String]){
		println(lessnadd(10));
		println(lessnadd(7));
	}
}
