public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel,  boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel :-1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Printer: \n");
        sb.append("tonerLevel = ").append(tonerLevel + "\n");
        sb.append("pagesPrinted = ").append(pagesPrinted + "\n");
        sb.append("duplex = ").append(duplex + "\n");
        return sb.toString();
    }


    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;

        if(tonerLevel < 0){
            return -1;
        }

        else if(tonerLevel > 100){
            return -1;
        }

        else{
            return tonerLevel;
        }
    }

    public int printPages(int pages){
        int jobPages = duplex ? (pages/2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
