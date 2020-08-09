package com.nila.apps.bookdetails.dao;

import java.util.List;

import com.nila.apps.bookdetails.entity.Books;

/**BooksDao used to handle repository calls.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
public interface BooksDao{

	/**retrieveBooksDetails method used to retrieve all the book details.
	 * 
	 * 
	 * @return List<Books>
	 */
	List<Books> retrieveBooksDetails();
	
	/**saveBookDetails method used to save the book details given by the user.
	 * 
	 * @param books
	 * 
	 */
	void saveBookDetails(Books books);
	
	/**sortByBookNamesAsc method used to sort the book details using book names.
	 * 
	 * 
	 * @return List<Books>
	 */
	List<Books> sortByBookNamesAsc();

	/**sortByBookPublishedYearAsc method used to sort the book details using book authors.
	 * 
	 * 
	 * @return List<Books>
	 */
	List<Books> sortByBookPublishedYearAsc();

	/**sortByBookAuthorsAsc method used to sort the book details using book published years.
	 * 
	 * 
	 * @return List<Books>
	 */
	List<Books> sortByBookAuthorsAsc();

}
