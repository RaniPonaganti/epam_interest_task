
public class subcalculate {
	double principal,rate_of_interest,time;
	subcalculate(double principal,double rate_of_interest,double time){
	this.principal=principal;
	this.rate_of_interest=rate_of_interest;
	this.time=time;
	}
	void simple_interest(){
	System.out.println("Simple Interest :"+((principal*rate_of_interest*time)/100));
	}
	void compound_interest(){
	double amount=Math.pow(principal*(1+(rate_of_interest/100)),time);
	System.out.println("Compound Interest :"+(amount-principal));
	}

}
