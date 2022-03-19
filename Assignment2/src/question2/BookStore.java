package question2;

	public class BookStore {
		
		private final int SIZE;
		private String bookStoreName;
		private Book[] books;
		
		public BookStore(int size, String bookStoreName) {
			
			SIZE = size;
			this.bookStoreName = bookStoreName;
			books=new Book[SIZE];
			booksInStore();
		}

		public void booksInStore()
		{
			books[0]=new Book("MATHS","RD SHARMA","5632145",10);
			books[1]=new Book("OBJECT ORIENTED PROGRAMMING","SK","23654189",15);
			books[2]=new Book("C PROGRAMMING LANGUAGE","YA","54789623",20);
			books[3]=new Book("JAVA PROGRAMMING LANGUAGE","JK","423617896",28);
			books[4]=new Book("A FINE FAMILY","GURUCHARAN DAS","78965412",30);
			
		}
		
		public void sell(String bookTitle,int numOfcopies)
		{
			boolean search=false;
			for(int i=0;i<SIZE;i++)
			{
				if(books[i].getBook_name().equals(bookTitle))
				{
					books[i].setNumOfcopies(books[i].getNumOfcopies()-numOfcopies);
					search=true;
				}
			}
			if(search)
			{
				System.out.println("Book sold");
			}
			else
			{
				System.out.println("invalid book.");
			}
		}

		public void order(String bookTitle,int numOfcopies)
		{
			boolean search=false;
			for(int i=0;i<SIZE;i++)
			{
				if(books[i].getBook_name().equals(bookTitle))
				{
					books[i].setNumOfcopies(books[i].getNumOfcopies()+numOfcopies);
					search=true;
				}
			}
			if(search)
			{
				System.out.println("book order successfully");
			}
			else
			{
				System.out.println("invalid book");
			}
			
		}
		public void display()
		{
			System.out.println(bookStoreName);
			System.out.println("Book details are: ");
			for(Book book:books)
			{
				book.display();
			}
		}
	}


