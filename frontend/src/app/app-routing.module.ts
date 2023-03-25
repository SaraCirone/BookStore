import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { LoginComponent } from './pages/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { ChisiamoComponent } from './pages/chisiamo/chisiamo.component';
import { CatalogoComponent } from './pages/catalogo/catalogo.component';
import { PacchettiComponent } from './pages/pacchetti/pacchetti.component';
import { RegistrazioneComponent } from './pages/registrazione/registrazione.component';
import { UserComponent } from './pages/user/user.component';
import { LogoutComponent } from './components/logout/logout.component';
import { RouteGuardService } from 'src/services/route-guard.service';
import { CatalogoGridComponent } from './pages/catalogo-grid/catalogo-grid.component';




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
        component: LogoutComponent, canActivate:[RouteGuardService]
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
        component: CatalogoComponent,  canActivate:[RouteGuardService]
    },
    {
        path: "Catalogo/grid",
        component: CatalogoGridComponent,  canActivate:[RouteGuardService]
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
