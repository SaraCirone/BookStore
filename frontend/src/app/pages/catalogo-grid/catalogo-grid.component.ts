import { Component, OnInit } from '@angular/core';
import { Ibooks } from 'src/app/models/books';
import { BooksService } from 'src/services/data/books.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-catalogo-grid',
  templateUrl: './catalogo-grid.component.html',
  styleUrls: ['./catalogo-grid.component.scss']
})
export class CatalogoGridComponent implements OnInit {

    books$ : Ibooks[] = [];
    errore: string = "";
    private apiUrl = 'http://localhost:8080/api/libri/catalogo';


  constructor(private booksService: BooksService) { }

  ngOnInit(): void {
    // this.booksService.getBookByDesc('After').subscribe({
    //     next: this.handleResponse.bind(this),
    //     error: this.handleError.bind(this)
    // });

    this.booksService.getBooksAll().subscribe(
        (response) => {
          this.books$= response;
        },
        (error) => {
          console.log(error);
        }
      );
    }

  }

//   handleResponse(response: any) {
//     this.books$ = response;
//   }

//   handleError(error: Object) {
//     this.errore = error.toString();
//   }

//   handleEdit = (ISBN : string) => {
//     console.log("Cliccato tasto modifica del codice" + ISBN);
//   }

//   handleDelete = (ISBN : string) => {
//     console.log("Cliccato tasto elimina del codice" + ISBN);

//     this.books$.splice(this.books$.findIndex(x => x.ISBN === ISBN), 1);
//     console.log(this.books$)
//   }
