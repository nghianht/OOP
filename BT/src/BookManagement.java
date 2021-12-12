import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */
	public Book[] readData(Scanner sc) {
		int n = Integer.parseInt(sc.nextLine());
		Book books[] = new Book[n];
		for(int i = 0; i < n; i++) {
			int c = Integer.parseInt(sc.nextLine());
			if(c == 0) {
				String id = sc.nextLine();
				String name = sc.nextLine();
				int quantity = Integer.parseInt(sc.nextLine());
				String publisher = sc.nextLine();
				double price = Double.parseDouble(sc.nextLine());
				double tax = Double.parseDouble(sc.nextLine());
				ReferenceBook b = new ReferenceBook(id, name, quantity, publisher, price, tax);
				books[i] = b;
			}
			if(c == 1) {
				String id = sc.nextLine();
				String name = sc.nextLine();
				int quantity = Integer.parseInt(sc.nextLine());
				String publisher = sc.nextLine();
				double price = Double.parseDouble(sc.nextLine());
				boolean status = Boolean.parseBoolean(sc.nextLine());
				TextBook b = new TextBook(id, name, quantity, publisher, price, status);
				books[i] = b;
			}
		}
		return books;
	}
    // In thong tin các cuốn sách
	public void printBooks(Book[] books) {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
    // Tìm các cuốn sách của nhà xuất bản publisher
	public ArrayList<Book> findBooks(Book[] books, String publisher) {
		ArrayList<Book> arrayb = new ArrayList<>();
		for (Book book : books) {
			if(book.getPublisher().equals(publisher)) {
				arrayb.add(book);
			}
		}
		return arrayb;

	}
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
	public double computeAverage(Book[] books, String typeOfBooks) {
		ArrayList<Book> ab = new ArrayList<>();
		double a = 0;
		for (Book book : books) {
			String[] w = book.toString().split(" ");
			if(w[0].equals(typeOfBooks)){
				ab.add(book);
				a += book.getAmount();
			}
		}
		a = a/ab.size();
		 return a;
	}
    // Sắp xếp các cuốn sách tăng dần về giá tiền
	public void sortByPrice(Book[] books) {
		for(int i = 0; i < books.length - 1; i++) {
			for(int j = 0; j < books.length - i - 1; j ++) {
				if(books[j].getPrice() > books[j+1].getPrice()) {
					Book b = books[j];
					books[j] = books[j+1];
					books[j+1] = b;
				}
			}
		}
		
	}

	public static void main(String[] args) {
	}
}
