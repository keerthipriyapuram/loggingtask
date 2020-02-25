package cleancode.Interest;



public class SimpleCompoundInterest

{

	double principal_amount,rate;

	int timeperiod;

	SimpleCompoundInterest(double principal_amt,double rate,int timeperiod)

	{

		principal_amount=principal_amt;

		this.rate=rate;

		this.timeperiod=timeperiod;

	}

	double SimpleInterest()

	{

		return (principal_amount*timeperiod*rate)/100;

	}

	double CompoundInterest()

	{

		double t=1+(rate/100);

		return principal_amount*Math.pow(t,timeperiod);

	}

}