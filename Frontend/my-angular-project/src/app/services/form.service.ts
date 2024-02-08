import { Customer } from './../practice/customer';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FormService {
  _url = 'http://localhost:8080/api/v1/student/post';
  constructor(private _http: HttpClient) { }
  enroll(customer: Customer){
    return this._http.post<any>(this._url, customer)
  }

}
