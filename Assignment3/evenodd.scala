object evenodd{

	def evenodd(n:Int):Unit = {
				
		if(n==0){
			println("The Number is Even");
			}

		else if(n==1){
			println("The Number is Odd");
			}

		else{
			evenodd(n-2);
			}
	}
	
	def main(args: Array[String]){
		println(evenodd(478));
		}
}
