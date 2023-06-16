import java.util.Scanner;
class main{
    public static int to,from;
    public static String number;
    public static int reps=0;
    public static void main(String[] args) {
        input();
    }
    public static void input(){
        if(reps>0){
            System.out.println("retry biatch");
        }
        reps++;
        Scanner Q=new Scanner(System.in);
        System.out.println("Enter the base of the number to be converted 2 , 8 , 10 , 16 ");
        from=Q.nextInt();
        System.out.println("Enter the the base to which you wish the number to be converted to ? ");
        to=Q.nextInt();
        System.out.println("Enter the number");
        number=Q.nextLine();
        switch(from){
            case 2:{
                binary B=new binary();
                switch(to){
                    case 8:{
                        number = Integer.parseInt(number);
                        B.BtoO(number);
                        break;
                    }
                    case 10:{
                        number = Integer.parseInt(number);
                        System.out.println(B.BtoD(number));
                        break;
                    }
                    case 16:{
                        number = Integer.parseInt(number);
                        B.BtoH(number);
                        break;
                    }
                    default:{
                        input();
                        break;
                    }
                }
                break;
            }
            case 8:{
                octa O=new octa();
                switch(from){
                    case 2:{
                        number = Integer.parseInt(number);
                        O.OtoB(number);
                        break;
                    }
                    case 10:{
                        number = Integer.parseInt(number);
                        O.OtoD(number);
                        break;
                    }
                    case 16:{
                        number = Integer.parseInt(number);
                        O.OtoH(number);
                        break;
                    }
                    default:{
                        input();
                        break;
                    }
                }
                break;
            }
            case 10:{
                decimal D=new decimal();
                switch(from){
                    case 2:{
                        number = Integer.parseInt(number);
                        D.DtoB(number);
                        break;
                    }
                    case 8:{
                        number = Integer.parseInt(number);
                        D.DtoO(number);
                        break;
                    }
                    case 16:{
                        number = Integer.parseInt(number);
                        D.DtoH(number);
                        break;
                    }
                    default:{
                        input();
                        break;
                    }
                }
                break;
            }
            case 16:{
                hexa H=new hexa();
                switch(from){
                    case 2:{
                        H.HtoB(number);
                        break;
                    }
                    case 8:{
                        H.HtoO(number);
                        break;
                    }
                    case 10:{
                        H.HtoD(number);
                        break;
                    }
                    default:{
                        input();
                        break;
                    }
                }
                break;
            }
            default:{
                input();
                break;
            }
        }
    }
}