  import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationRequest } from '@app/services/models';
import { AuthenticationService } from '@app/services/services';
  

  @Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss']
  })
  export class LoginComponent {

    authRequest: AuthenticationRequest = {email: '', password: ''};
    errorMsg: Array<string> = [];

    constructor( private router: Router, private authService: AuthenticationService){

    }

    login(): void {
      this.errorMsg = [];
      this.authService.authenticate({
        body: this.authRequest
      }).subscribe({
        next: (): void => {
          // todo save the token
          this.router.navigate(['books']);
        },
        error: (err): void => {
          console.log(err);
          if(err.error.validationErrors){
            this.errorMsg = err.error.validationErrors;
          }else{
            this.errorMsg.push(err.error.errorMsg);
          }
        }
      })
    }

    register(): void {
      this.router.navigate(['register']);

    }

  }
