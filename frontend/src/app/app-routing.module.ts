import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { LoginComponent } from './components/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { ChisiamoComponent } from './components/chisiamo/chisiamo.component';
import { CatalogoComponent } from './components/catalogo/catalogo.component';
import { PacchettiComponent } from './components/pacchetti/pacchetti.component';
import { RegistrazioneComponent } from './components/registrazione/registrazione.component';
import { UserComponent } from './components/user/user.component';
import { LogoutComponent } from './components/logout/logout.component';




const routes: Routes = [
    {
        path: "",
        component: HomeComponent
    },//path che determina cosa si visualizza quando si arriva nell'indirizzo normale del localhost
    {
        path: "home/:userid",
        component: HomeComponent
    },//path della home
    {
        path: "login",
        component: LoginComponent
    },
    {
        path: "logout",
        component: LogoutComponent
    },

    {
        path: "registrazione",
        component: RegistrazioneComponent
    },
    {
        path: "user",
        component: UserComponent
    },
    {
        path: "chisiamo",
        component: ChisiamoComponent
    },
    {
        path: "pacchetti",
        component: PacchettiComponent
    },
    {
        path: "Catalogo",
        component: CatalogoComponent
    },
    {
        path: "**",
        component: ErrorComponent
    }//sempre ultimo componente. Visualizzato quando non esiste una pagina cercata
];

@NgModule({
    declarations: [],
    imports: [
        BrowserModule,
        HttpClientModule,
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule { }
