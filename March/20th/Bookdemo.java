package demo;

public class Bookdemo {
        private String title;
	private String author;
	private String publisher;
	private int date;
    
    public Bookdemo(String title,String author , String publisher, int date ){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;  
    }
    
   public void setTitle(String title){
       this.title = title;
   }
   
   public void setAuthor(String author){
       this.author = author;
   }
   
   public void setPublisher(String publisher){
       this.publisher = publisher;
   }
   
   public void setDate(int date){
       this.date = date;
   }
   
   public String getTitle(){
       return this.title;       
   }
   
   public String getAuthor(){
       return this.author;
   }
   
   public String getPublisher(){
       return this.publisher;
   } 
   
   public int getDate(){
       return this.date;
   }
    
   public String toString() {
		String description = "";
		description += "Title: \t" + title + "\n";
		description += "Author: \t" + author + "\n";
		description += "Publisher: \t" + publisher + "\n";
		description += "Copyright Date: \t" + date + "\n";
		return description;
                
	}
    public static void main(String[] args) {
        Bookdemo b1 = new Bookdemo("Java", "ABCD","PEARSON",2015);
        String str = b1.toString();
        System.out.println(str);
        Bookdemo b2 = new Bookdemo("Java part 2", "xyz","PEARSON",2015);
        str = b2.toString();
        System.out.println(str);
    }
   
}
