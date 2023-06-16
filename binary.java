public class binary {
    public int BtoO(int num){
        int octa=0;
        return octa;
    }
    public int BtoD(int num){
        int decimal=0,i=0,place=0;
        while(num!=0){
            place=num%10;
            decimal=decimal+(int)(place*(Math.pow(2,i)));
            num=num/10;
            i++;
        }
        return decimal;

    }
    public int BtoH(String num){
        int hexa=0;
        return hexa;
    }
}
