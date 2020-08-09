package com.nila.apps.bookdetails.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nila.apps.bookdetails.entity.Books;
import com.nila.apps.bookdetails.service.BooksService;

import java.util.List;


/**BooksRestController used to control the book related functions.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BooksRestController {
	
	 @Autowired
	 private BooksService booksService;
	 	 
	 public BooksRestController(BooksService booksService) {
		  super();
		  this.booksService = booksService;
		 }
	 
	 @GetMapping("/books")
	 public List<Books> getBooksDetails(){
		 return booksService.retrieveBooksDetails();
	 }
	 
	 @PostMapping("/addBookDetails")
	 public void addBookDetails(@RequestBody Books books){
		 booksService.saveBookDetails(books);
	 }

	 @PostMapping("/sort")
	 public List<Books> sortByAsc(@RequestBody String selectedSort){
		 return booksService.sortByAsc(selectedSort);
	 }
}
