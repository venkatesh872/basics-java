package java_basics.com.tf.inheritance;

class Bank {
	int getRateOfinterest() {   
		return 0;
	}
}
class SBI extends Bank {
	int getRateOfinterest() {//overriden
		return 10;
	}
}
class ICICI extends Bank {
	int getRateOfinterest() {//overriden
		return 15;
	}
}
class AXIS extends Bank {
	int getRateOfinterest() {//overriden
		return 12;
	}
}
