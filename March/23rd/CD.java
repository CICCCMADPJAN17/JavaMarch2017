
package cdapplication;

public class CD {
    private String title;
    private double cost;
    private int tracks;
    //"Storm Front",14.95,10);
    public  CD(String name, double price, int numoftracks){
        title = name;
        cost = price;
        tracks = numoftracks;
    }
    
    public  String details()
    {
        String desc;
        desc = title + "\t" + cost +"\t"+tracks;
        return desc;
    }
}
