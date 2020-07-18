object Caesarcipher{

	def main(args: Array[String]):Unit = {
		Cipher();
	}
	
	def Cipher():Unit = {
	
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		val shift = scala.io.StdIn.readLine("shift by: ").toInt;
		val inputtext = scala.io.StdIn.readLine("Your Message: ");
	
		val opt = scala.io.StdIn.readLine("1. Encrypt\n2. Decrypt").toInt;
	
		opt match{
			case 1 => Encrypt(alphabet,shift,inputtext);
			case 2 => Decrypt(alphabet,shift,inputtext);
			case _ => println("INVALID!");
		}
	}
	
	//Encrypting..
	
	def Encrypt(alphabet:String, shift:Int, inputtext:String):Unit = {
	
		val outputtext = inputtext.map((c: Char) => {
		val x = alphabet.indexOf(c.toUpper)
		
			if(x == -1){
				c
			}
			
			else{
				alphabet((x+shift) % alphabet.size)
			}
		});
		
			println(outputtext);
	}
	
	//Decrypting...
	
	def Decrypt(alphabet:String, shift:Int, inputtext:String):Unit = {
	
		val outputtext = inputtext.map((c: Char) => {
		val x = alphabet.indexOf(c.toUpper)
		
			if(x == -1){
				c
			}
			
			else{
				alphabet(((x-shift)+alphabet.size)%alphabet.size)
			}
		});
		
			println(outputtext);
	}
}