import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';

import { AuthenticationService } from '../../authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  loading = false;
  submitted = false;
  returnUrl: string;
  error = '';

  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService
  ) {
    if (this.authenticationService.currentUserValue) {
      this.router.navigate(['/']);
    }
  }

  ngOnInit(): any {
    this.loginForm = this.formBuilder.group({
      username: ['', [Validators.required, Validators.pattern('^[^\s@]+@[^\s@]+\.[^\s@]+$')]],
      password: ['', Validators.required],
    });

    this.returnUrl = this.route.snapshot.queryParams.returnUrl || '/';
  }

  get f(): any { return this.loginForm.controls; }

  onSubmit(): void {
    this.submitted = true;

    if (this.isInvalidEmailForm()) {
      return;
    }

    this.loading = true;
    this.authenticationService.login(this.f.username.value, this.f.password.value)
      .subscribe(
        data => {
          this.router.navigate([this.returnUrl]);
        });
  }

  usernameMessage(): string {
    if (this.isInvalidEmailFormat()){
      return 'Wrong email format!';
    } else if (this.isEmptyEmail()) {
      return 'Email is required!';
    }
  }

  isEmptyEmail(): boolean {
    if (this.f.username.value === '' || this.f.username.value === null) {
      return true;
    }
    return false;
  }

  emailIsValid(email): boolean {
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
  }

  isInvalidEmailFormat(): boolean {
    if (!this.emailIsValid(this.f.username.value) && !this.isEmptyEmail()) {
      return true;
    }
    return false;
  }

  isInvalidEmailForm(): boolean {
    if (this.isInvalidEmailFormat() || this.isEmptyEmail()) {
      return true;
    }
    return false;
  }

  isEmptyPassword(): boolean {
    if (this.f.password.value === '' || this.f.password.value === null) {
      return true;
    }
    return false;
  }
}
