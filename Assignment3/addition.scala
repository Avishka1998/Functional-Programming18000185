object addition{
	def addition(n:Int):Int = {
		if(n==0){
			return 0;
			}

		else{
			var res:Int = n + addition(n-1);
			return res; 
			}
		}

	def main(args: Array[String]){

		println(addition(5));	

		}
}
