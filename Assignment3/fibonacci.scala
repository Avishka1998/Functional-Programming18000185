object fibonacci{
	
	def fibo(m:Int):Int = {

		if((m==1)||(m==2)){
			return (m-1);
			}
			
		else{	
			return (fibo(m-1) + fibo(m-2));
			}
		}

	def fib(n:Int):Int = {
		
		var j = 1;
		while(j<=n){
			println(fibo(j));
			j = j+1;
			}
		0
		}	

	def main(args: Array[String]){
		println(fib(10));
		}     

}
