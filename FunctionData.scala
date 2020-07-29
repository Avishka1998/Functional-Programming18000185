class Rational(a:Int, b:Int){
	def number = a
	def denom = b

	def neg = new Rational(-number,denom)

	def sub(c: Rational) = new Rational(number*c.denom-c.number*denom, denom*c.denom)
}


class Account(n:Int, b:Double){

	var Acnumber = n
	var balance = b

	def transfer(t:Account, s:Double) = {
		balance=balance - s
		t.balance=t.balance + s
	}
}

object FunctionaData{

	def main(args: Array[String]){
		var x = new Rational(5,3)
		var y = new Rational(4,7)
		var z = new Rational(2,9)

		var w = x.sub(y.sub(z.neg))		//x-y-z evaluation
			println(w.number)
			println(w.denom)

		var ac1 = new Account(8251, 1250.25)
		var ac2 = new Account(7851, -2780.50)
		var ac3 = new Account(2158, 3654.20)

		ac1.transfer(ac3, 75.50)
			println(ac1.balance)
			println(ac3.balance)


		var bank:List[Account]=List(ac1,ac2,ac3)

		val overdraft = (b:List[Account]) => b.filter(_.balance<0)
   }
}
