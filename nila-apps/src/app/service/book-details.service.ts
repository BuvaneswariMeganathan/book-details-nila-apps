import { Injectable } from '@angular/core';
import { Books } from '../model/books';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()
export class BookDetailsService {
  private booksDetailsUrl: string;
  private addBooksDetailsUrl: string;
  private sortByAscUrl: string;

  constructor(private http: HttpClient) {
    this.booksDetailsUrl = 'http://localhost:8088/books';
    this.addBooksDetailsUrl = 'http://localhost:8088/addBookDetails';
    this.sortByAscUrl = 'http://localhost:8088/sort';
  }
 
  public findAll(): Observable<Books[]> {
    return this.http.get<Books[]>(this.booksDetailsUrl);
  }
 
  public save(book: Books) {
    return this.http.post<Books>(this.addBooksDetailsUrl, book);
  }

  public sortByAsc(selectedSort): Observable<Books[]> {
    return this.http.post<Books[]>(this.sortByAscUrl, selectedSort);
  }
}
