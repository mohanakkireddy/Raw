import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ICustomer } from './customer';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class HeroService {
  
  private url: any ="http://localhost:8080/api/v1/student/get";
  constructor(private http: HttpClient) { }

  getCustomers():Observable <ICustomer[]>{
    return this.http.get<ICustomer[]>(this.url);
   }
}
