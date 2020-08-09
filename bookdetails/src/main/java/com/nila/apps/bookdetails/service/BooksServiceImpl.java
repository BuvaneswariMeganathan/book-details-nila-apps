package com.nila.apps.bookdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nila.apps.bookdetails.dao.BooksDao;
import com.nila.apps.bookdetails.entity.Books;

/**BooksServiceImpl used to implement BooksService.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Service
public class BooksServiceImpl implements BooksService {

	 @Autowired
	 private BooksDao booksDao;
	 	 
	 public BooksServiceImpl(BooksDao booksDao) {
		  super();
		  this.booksDao = booksDao;
		 }
	 
	@Override
	public List<Books> retrieveBooksDetails() {
		return booksDao.retrieveBooksDetails();
	}

	@Override
	public void saveBookDetails(Books books) {
		booksDao.saveBookDetails(books);
	}

	@Override
	public List<Books> sortByAsc(String selectedSort) {
		if(("bookAuthors").equals(selectedSort)){
		return booksDao.sortByBookAuthorsAsc();
		}
		else if(("yearPublished").equals(selectedSort)){
		return booksDao.sortByBookPublishedYearAsc();
		}
		else {
		return booksDao.sortByBookNamesAsc();
		}
	}
}
