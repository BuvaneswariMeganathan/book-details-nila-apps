import { Component, OnInit } from '@angular/core';
import { Books } from '../model/books';
import { BookDetailsService } from '../service/book-details.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {

  books: Books[];
  selectedSort: String='bookNames';
  constructor(private bookDetailService: BookDetailsService, public router:Router) {
  }
 
  ngOnInit() {
    this.bookDetailService.findAll().subscribe(data => {
      this.books = data;
    });
  }
  selectChangeHandler(event:any)
  {
   this.selectedSort=event.target.value;
  }
  sortByAsc(){
    this.bookDetailService.sortByAsc(this.selectedSort).subscribe(data => {
      this.books = data;
    });
  }

}
