public class datatypes {
    public static void main(String[] args){
        int myminvalue=Integer.MIN_VALUE;
        int mymaxvalue=Integer.MAX_VALUE;
        System.out.println("My maximum no is"+mymaxvalue);
        System.out.println("My minimun no is"+myminvalue);
        System.out.println("Busted max Value ="+(mymaxvalue+1)); //overflow
        System.out.println("Busted min value"+(myminvalue-1)); //underflow

        byte mylongbytenumber=Byte .MAX_VALUE;
        byte myshortbytenumber=Byte.MIN_VALUE;
        System.out.println("Largest Byte Number="+ mylongbytenumber);
        System.out.println("Smallest Byte Number="+ myshortbytenumber);

        short mylongshortnumber=Short .MAX_VALUE;
        short myshortshortnumber=Short.MIN_VALUE;
        System.out.println("Largest short Number="+ mylongshortnumber);
        System.out.println("Smallest short Number="+ myshortshortnumber);

        long mylonglongnumber=Long .MAX_VALUE;
        long myshortlongnumber=Long.MIN_VALUE;
        System.out.println("Largest Long Number="+ mylonglongnumber);
        System.out.println("Smallest short Number="+ myshortlongnumber);









    }

}
