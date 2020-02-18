import java.util.*;
public class interestcal {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double principal_original=sc.nextDouble();
double rate=sc.nextDouble();
double time_in_years=sc.nextDouble();
subcalculate scal=new subcalculate(principal_original,rate,time_in_years);
scal.simple_interest();
scal.compound_interest();
sc.close();
}

}

