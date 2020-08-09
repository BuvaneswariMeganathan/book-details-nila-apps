package com.nila.apps.bookdetails.service;

import java.util.List;

import com.nila.apps.bookdetails.entity.Books;


/**BooksService used to handle dao method calls.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
public interface BooksService {
	
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
	
	/**sortByAsc method used to sort the book details with respect to the user selection.
	 * 
	 * @param selectedSort
	 * 
	 * @return List<Books>
	 */
	List<Books> sortByAsc(String selectedSort);
}
