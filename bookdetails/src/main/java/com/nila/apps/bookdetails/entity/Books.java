package com.nila.apps.bookdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**Books used as an entity for getting and setting the appropriate values
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Entity
@Table(name="Books")
public class Books {
  
 @Id
 @Column(name="book_names")
 private String bookNames;
  
 @Column(name="book_authors")
 private String bookAuthors;
  
 @Column(name="year_published")
 private int yearPublished;
 
 public Books() {
	 
 }
 
 public Books(String bookNames, String bookAuthors, int yearPublished) {
	  super();
	  this.bookNames = bookNames;
	  this.bookAuthors = bookAuthors;
	  this.yearPublished = yearPublished;
 }
  
 public String getBookNames() {
  return bookNames;
 }
 
 public void setBookNames(String bookNames) {
  this.bookNames = bookNames;
 }
 
 public String getBookAuthors() {
  return bookAuthors;
 }
 
 public void setBookAuthors(String bookAuthors) {
  this.bookAuthors = bookAuthors;
 }
 
 public int getYearPublished() {
  return yearPublished;
 }
 
 public void setYearPublished(int yearPublished) {
  this.yearPublished = yearPublished;
 }
}
