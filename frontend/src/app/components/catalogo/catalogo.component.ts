import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-catalogo',
  templateUrl: './catalogo.component.html',
  styleUrls: ['./catalogo.component.scss']
})
export class CatalogoComponent implements OnInit {

    books = [
        {id: 1, titolo: 'Bones and All', descrizione: 'Libro ambientato nel passato', autore: 'Camille Dabous', pezzi: 10, genere: 'Fantasty', ISBN: '939568241852', prezzo: 10.30, copertina: 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91ZNOLB9d3L.jpg'},
        {id: 2, titolo: 'Inferno', descrizione: 'Libro di mitologia cristiana', autore: 'Dante alighieri', pezzi: 7, genere: 'Mitologia', ISBN: '939568241854', prezzo: 10, copertina: 'https://www.ibs.it/images/9788806187903_0_536_0_75.jpg'},
        {id: 3, titolo: 'Purgatorio', descrizione: 'Libro di mitologia cristiana', autore: 'Dante alighieri', pezzi: 7, genere: 'Mitologia', ISBN: '939568241858', prezzo: 10, copertina: 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71OzqpdnuML.jpg'},
        {id: 4, titolo: 'Paradiso', descrizione: 'Libro di mitologia cristiana', autore: 'Dante alighieri', pezzi: 7, genere: 'Mitologia', ISBN: '939568241584', prezzo: 10, copertina: 'https://www.ibs.it/images/9788806216245_0_536_0_75.jpg'},
        {id: 5, titolo: 'Verso il Paradiso', descrizione: 'Storia di alcune persone', autore: 'Hanya Yanagihara', pezzi: 7, genere: 'Mitologia', ISBN: '939568241584', prezzo: 15, copertina: 'https://www.ibs.it/images/9788807034817_0_424_0_75.jpg'},
        {id: 6, titolo: 'I grandi Giochi - Nevernight', descrizione: 'Storia di una ragazzina assassina in un mondo fantasy', autore: 'Jay Kristoff', pezzi: 7, genere: 'Mitologia', ISBN: '939568241584', prezzo: 13, copertina: 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T2/images/I/912koRihZtL.jpg'},
        {id: 6, titolo: 'Mai Dimenticare - Nevernight', descrizione: 'Storia di una ragazzina assassina in un mondo fantasy', autore: 'Jay Kristoff', pezzi: 7, genere: 'Mitologia', ISBN: '939568241584', prezzo: 13, copertina: 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T2/images/I/91o4FBRvXeL.jpg'},
    ]

    generi = [{nome: 'Horror'},{nome: 'Fantasy'}, {nome: 'Storico'},  {nome: 'Ragazzi'}, {nome: 'Giallo'}, {nome: 'Narrativa'}, {nome: 'Altro'},
]


  constructor() { }

  ngOnInit(): void {
  }

}
