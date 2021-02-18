public class Casting_in_Java {
    public static void main(String[] args){
        byte maxvalue=Byte.MAX_VALUE;
        byte minvalue=Byte.MIN_VALUE;
        System.out.println("MAX VALUE ="+ maxvalue);
        System.out.println("MIN VALUE =" + minvalue);
        int modvalue=(maxvalue/2);
        System.out.println("MODIFIED VALUE IS ="+ modvalue);
        byte value=(byte) (minvalue/2);                      // CASTING IN JAVA
        System.out.println("byte value is " + value);
    }
}
