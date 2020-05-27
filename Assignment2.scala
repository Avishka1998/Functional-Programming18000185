object Assignment2{

//Q1

def total(x:Int,y:Int):Int = (150*x)+(75*y);
	
def tax(a:Int,b:Int):Double = {
	val t:Int = total(a,b);
	if((a>=40)&&(b>=20)){
		return (0.1*t);
		}
		else return 0;
	}

def take(m:Int,n:Int):Double = total(m,n)-tax(m,n);

//Q2

def attendees(tprize:Int):Int = 120+((20/5)*(15-tprize));
def rev(attendees:Int,tprize:Int):Int = attendees*tprize;
def cost(attendees:Int):Int = 500+(3*attendees);
def profit(ticket:Int):Int = rev(attendees(ticket),ticket)-cost(attendees(ticket)); 

def main(args: Array[String]){
	println(take(40,20));
	println(profit(16));
	}
}	