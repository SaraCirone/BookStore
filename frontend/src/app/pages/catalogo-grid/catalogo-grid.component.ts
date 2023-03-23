import { Component, OnInit } from '@angular/core';
import { Ibooks } from 'src/app/models/books';
import { BooksService } from 'src/services/books.service';

@Component({
  selector: 'app-catalogo-grid',
  templateUrl: './catalogo-grid.component.html',
  styleUrls: ['./catalogo-grid.component.scss']
})
export class CatalogoGridComponent implements OnInit {

    books$ : Ibooks[] = [];

  constructor(private booksService: BooksService) { }

  ngOnInit(): void {
    this.books$ = this.booksService.getBooks();
    console.log(this.books$);
  }

  handeleEdit = (ISBN : string) => {
    console.log("Cliccato tasto modifica del codice" + ISBN);
  }

  handeleDelete = (ISBN : string) => {
    console.log("Cliccato tasto elimina del codice" + ISBN);

    this.books$.splice(this.books$.findIndex(x => x.ISBN === ISBN), 1);
    console.log(this.books$)
  }

}
