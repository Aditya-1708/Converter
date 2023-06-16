public class octa {
    public int OtoB(int num){
        int binary=0;
        return binary;
    }
    public int OtoD(int num){
        int decimal=0,i=0,place=0;
        while(num!=0){
            place=num%10;
            decimal=decimal+(int)(place*(Math.pow(8,i)));
            num=num/10;
            i++;
        }
        return decimal;
    }
    public int OtoH(int num){
        int hexa=0;
        return hexa;
    }
}
