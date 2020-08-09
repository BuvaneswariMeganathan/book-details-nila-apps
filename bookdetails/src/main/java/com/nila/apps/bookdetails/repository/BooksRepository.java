package com.nila.apps.bookdetails.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nila.apps.bookdetails.entity.Books;

/**BooksRepository used to handle repository funcitons.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

	/**sortByBooksNameAsc method used to sort the book details using book names.
	 * 
	 * @return List<Books>
	 *
	 */
    @Query("FROM Books ORDER BY bookNames ASC")
    List<Books> sortByBookNamesAsc();
    
	/**sortByBookAuthorsAsc method used to sort the book details using book authors.
	 * 
	 * @return List<Books>
	 *
	 */
    @Query("FROM Books ORDER BY bookAuthors ASC")
    List<Books> sortByBookAuthorsAsc();
    
	/**sortByBookPublishedYearAsc method used to sort the book details using book published year.
	 * 
	 * @return List<Books>
	 *
	 */
    @Query("FROM Books ORDER BY yearPublished ASC")
    List<Books> sortByBookPublishedYearAsc();

}
