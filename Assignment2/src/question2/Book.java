package question2;

	public class Book {
		public Book(String book_name, String author, String isbn, int numOfcopies) {
			this.book_name = book_name;
			this.author = author;
			this.isbn = isbn;
			this.numOfcopies = numOfcopies;
		}
		String book_name;
		String author;
		String isbn;
		int numOfcopies;
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public int getNumOfcopies() {
			return numOfcopies;
		}
		public void setNumOfcopies(int numOfcopies) {
			this.numOfcopies = numOfcopies;
		}
		
		public void display()
		{
			System.out.println("*******BOOK DETAILS ARE:*****");
			System.out.println("Book title is: "+book_name);
			System.out.println("Author is: "+author);
			System.out.println("Isbn number is: "+isbn);
			System.out.println("Number of copies: "+numOfcopies);
			
		}

	}
	

