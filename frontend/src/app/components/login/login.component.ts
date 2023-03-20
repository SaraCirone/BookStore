import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

    userId: string = "";
    password: string = "";
    autenticato: boolean = true;
    errMsg: string = "User e/o la password non corrispondono!"



  constructor(private route: Router) { }

  ngOnInit(): void {
  }

 gestAuth = () : void => {
    console.log(this.userId);

    if (this.userId ==="Sara" && this.password ==="1234") {
        this.route.navigate(['home']);
        this.autenticato = true;

    } else {
        this.autenticato = false;

    }
 }

}
