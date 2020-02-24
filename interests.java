import java.util .*;
import java.util.logging.Logger;

 class interests
{
 public static void main(String[] args) {
 }
 
 static{
	 

   Logger log = Logger.getLogger(interests.class.getName());
   double p, rate, t, si, ci;
        log.info("Enter The Amount : ");
        Scanner read = new Scanner(System. in);
     p = read.nextDouble();

     log.info("Enter The No. of Years : ");
    t = read.nextDouble();

     log.info("Enter The Rate of Interest (ROI) : ");
     rate = read.nextDouble();

     /*Calculating Simple Interest and Compound Interest*/
     si = (p * t * rate)/100;
     ci = p*Math.pow(1.0+rate/100.0,t)-p;

     /*Displaying Simple Interest and Compound Interest*/
     log.info("Simple Interest = "+si);
    log.info("Compound Interest = "+ci);
 }
 
}