
/**
 * 
 *
 * @Mike Graus
 * @version Jan 29, 2018
 */
public class Book 
{

   
    private String lastName;
    private String firstName;
    private String title;
    private String pubDate;
    private int isbn;
    private int numPages;

    public Book(String lastName, String firstName, String title,
			String pubDate, int isbn, int numPages) {
		final int MINIMUM_PAGES = 10;		
		this.lastName = lastName;
		this.firstName = firstName;
		this.title = title;
		this.pubDate = pubDate;
		this.isbn = isbn;
		this.numPages = numPages;
		if(numPages < MINIMUM_PAGES) {
			System.out.println("ERROR Pages below minimum!!!");
		}
        }
        public String getLastName() {
	 	return lastName;
        }
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public String getPubDate() {
		return pubDate;
	}
	
	
	
	public int getIsbn() {
		return isbn;
	}
	
	
	
	public int getNumPages() {
		return numPages;
	}
	
	
	
	@Override
	public String toString() {
		String line1 = "Book information for " + title;
		String line2 = "=========================================";
		String line3 = "Title:                   " + title;
		String line4 = "Author:                  " + firstName + " " + lastName;
		String line5 = "ISBN#:                   " + isbn;
		String line6 = "Pages:                   " + numPages;
		String line7 = "Pub Date:                " + pubDate;
		
		String multilineString = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
				line1,line2,line3,line4,line5,line6,line7);
		return multilineString;
	}
}

