package com.nila.apps.bookdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nila.apps.bookdetails.entity.Books;
import com.nila.apps.bookdetails.repository.BooksRepository;

/**BooksDaoImpl used to implement BooksDao.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Component
public class BooksDaoImpl implements BooksDao{

	 @Autowired
	 private BooksRepository booksRepository;
	 	 
	 public BooksDaoImpl(BooksRepository booksRepository) {
		  super();
		  this.booksRepository = booksRepository;
		 }
	 
	@Override
	public List<Books> retrieveBooksDetails() {
		return booksRepository.findAll();
	}

	@Override
	public void saveBookDetails(Books books) {
		booksRepository.save(books);
		
	}

	@Override
	public List<Books> sortByBookNamesAsc() {
		return booksRepository.sortByBookNamesAsc();
	}

	@Override
	public List<Books> sortByBookAuthorsAsc() {
		return booksRepository.sortByBookAuthorsAsc();
	}

	@Override
	public List<Books> sortByBookPublishedYearAsc() {
		return booksRepository.sortByBookPublishedYearAsc();
	}

}
