public class VipCustomer {
    private String name;
    private long creditlimit;
    private String email_address;

    public VipCustomer(String name,long creditlimit,String email_address){
        this.name=name;
        this.creditlimit=creditlimit;
        this.email_address=email_address;
    }

    public VipCustomer(String name, long creditlimit) {
        this(name,creditlimit,"mananaggarwal2@gmail.com");
        this.name = name;
        this.creditlimit = creditlimit;
    }
    public VipCustomer(){
        this("Manan",9999999,"nmaggarwal2@gmail.com");
    }

    public String getName() {
        return name;
    }

    public long getCreditlimit() {
        return creditlimit;
    }

    public String getEmail_address() {
        return email_address;
    }
    
}
