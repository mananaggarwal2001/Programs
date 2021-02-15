public class Printer {
    private int toner_level=100;
    private int no_of_pages_printed;
    private boolean duplex_printer;

    public Printer(int toner_level, boolean duplex_printer) {
        if(toner_level>-1 && toner_level<=100) {
            this.toner_level = toner_level;
        }else {
            this.toner_level=0;
        }
        this.duplex_printer = duplex_printer;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100) {
            if ((tonerAmount + this.toner_level) > 100) {
                return -1;
            }
            this.toner_level += tonerAmount;
            return tonerAmount;

        }else{
            return -1;
        }
    }
    public void PrintStimulatedPages(int pages) {
        int printed_pages=pages;
        if (duplex_printer) {
            if (pages % 2 == 0) {
                printed_pages/=2;
                System.out.println(" Printed No of pages are in Duplex Mode " + printed_pages);
            } else if (pages % 2 != 0) {
                printed_pages=(printed_pages/2)+(printed_pages%2);
                System.out.println(" Printed No of pages are in Duplex Mode " + printed_pages);
            }

        }else{
            System.out.println(" Printing pages in Single Mode " + printed_pages);
        }
    }
}
