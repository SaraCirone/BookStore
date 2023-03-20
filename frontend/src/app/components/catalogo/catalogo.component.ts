import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-catalogo',
  templateUrl: './catalogo.component.html',
  styleUrls: ['./catalogo.component.scss']
})
export class CatalogoComponent implements OnInit {

    books = [
        {titolo: 'Bones and All', descrizione: 'Libro ambientato nel passato', autore: 'Camille Dabous', pezzi: 10, genere: 'Fantasty', ISBN: '939568241852', prezzo: 10.30, copertina: 'url'},
        {titolo: 'Inferno', descrizione: 'Libro di mitologia cristiana', autore: 'Dante alighieri', pezzi: 7, genere: 'Mitologia', ISBN: '939568241854', prezzo: 10, copertina: 'url'}
    ]

  constructor() { }

  ngOnInit(): void {
  }

}
