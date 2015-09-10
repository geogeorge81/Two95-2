
public class Search {

	public static void main(String[] args) {
		search();
		InternetSearchEngine.search();
		DirectorySearchEngine.search();
		
		System.out.println("Search Completed");
	}
    static void search()
    {
    	System.out.println("This is from the 'Search' method");
    }
}
