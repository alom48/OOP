 
package bodrul;

 import java.math.BigInteger;
 public  class MyCalculator implements AdvancedAritmetic{

     @Override
    public  int divisorSum(int n){
        int divCount =0;
        for(int i= 1;i<=n;i++){
        if(n%i==0){
        divCount +=i;
}
}
        return divCount;
}

    @Override
    public BigInteger findFactorial(int n) {
       BigInteger result = BigInteger.ONE;
       for(int i=1;i<=n;i++){
       result = result.multiply(BigInteger.valueOf(i));
}
   return  result;
}
}
