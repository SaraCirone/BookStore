import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { ChisiamoComponent } from './components/chisiamo/chisiamo.component';
import { CatalogoComponent } from './components/catalogo/catalogo.component';
import { PacchettiComponent } from './components/pacchetti/pacchetti.component';
import { RegistrazioneComponent } from './components/registrazione/registrazione.component';
import { UserComponent } from './components/user/user.component';
import { PaginaprodottoComponent } from './components/paginaprodotto/paginaprodotto.component';




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




  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
