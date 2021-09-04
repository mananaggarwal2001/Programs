public class TeenNumberChecker {
    public static boolean hasTeen(int teen1,int teen2,int teen3){
        if((teen1>=13&&teen1<=19)||(teen2>=13&&teen2<=19)||(teen3>=13&&teen3<=19)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isteen(int teen1){
        if(teen1>=13&&teen1<=19){
            return true;
        }else{
            return false;
        }
    }
}
