import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { ChisiamoComponent } from './pages/chisiamo/chisiamo.component';
import { CatalogoComponent } from './pages/catalogo/catalogo.component';
import { PacchettiComponent } from './pages/pacchetti/pacchetti.component';
import { RegistrazioneComponent } from './pages/registrazione/registrazione.component';
import { UserComponent } from './pages/user/user.component';
import { PaginaprodottoComponent } from './pages/paginaprodotto/paginaprodotto.component';
import { LogoutComponent } from './components/logout/logout.component';
import { CatalogoGridComponent } from './pages/catalogo-grid/catalogo-grid.component';
import { BookCardComponent } from './components/book-card/book-card.component';




@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    LoginComponent,
    ErrorComponent,
    ChisiamoComponent,
    CatalogoComponent,
    PacchettiComponent,
    RegistrazioneComponent,
    UserComponent,
    PaginaprodottoComponent,
    LogoutComponent,
    CatalogoGridComponent,
    BookCardComponent,




  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
