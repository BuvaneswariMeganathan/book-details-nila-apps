import { Component, OnInit } from '@angular/core';
import { Books } from '../model/books';
import { ActivatedRoute, Router } from '@angular/router';
import { BookDetailsService } from '../service/book-details.service';
@Component({
  selector: 'app-books-form',
  templateUrl: './books-form.component.html',
  styleUrls: ['./books-form.component.css']
})
export class BooksFormComponent {
  book: Books;
 
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private bookDetailService: BookDetailsService) {
    this.book = new Books();
  }
 
  onSubmit() {
    this.bookDetailService.save(this.book).subscribe(result => this.gotoBooksList());
  }
 
  gotoBooksList() {
    this.router.navigate(['/books']);
  }

}
