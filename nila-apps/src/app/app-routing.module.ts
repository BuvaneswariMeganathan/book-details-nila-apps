import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookDetailsComponent } from './book-details/book-details.component';
import { BooksFormComponent } from './books-form/books-form.component';
const routes: Routes = [
  { path: 'books', component: BookDetailsComponent },
  { path: 'addBookDetails', component: BooksFormComponent },
  { path: 'sort', component: BookDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
