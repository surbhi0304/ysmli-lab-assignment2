package day2assignments;
class BookStore {
	private Book[] books;

	public BookStore(Book[] books) {
		this.books = books;

	}

	void sell(String bookTitle, int noOfCopies) {
		int flag = 0;
		for (int i = 0; i < 5; i++) {
			if (books[i].getBookTitle().equals(bookTitle)) {
				if (books[i].getNoOfCopies()>= noOfCopies) {
					noOfCopies = books[i].getNoOfCopies() - noOfCopies;
					books[i].setNoOfCopies(noOfCopies);
					flag = 1;
					break;
				} else {
					System.out.println("available number of copies are less");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("NO MATCH FOUND");
	}

	void order(String ISBN, int noOfCopies) {
		int flag = 0;
		for (int i = 0; i < books.length; i++) {
			if (ISBN.equals( books[i].getISBN())) {
				books[i].setNoOfCopies(books[i].getNoOfCopies() + noOfCopies);
				books[i].display();
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("NOT Found");
			System.out.println("Adding new Book");

		}
	}

	void display() {
		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}
	}

}
