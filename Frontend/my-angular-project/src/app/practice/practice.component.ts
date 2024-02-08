import { Customer } from './customer';
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FormService } from '../services/form.service';
@Component({
  selector: 'app-practice',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './practice.component.html',
  styleUrl: './practice.component.css'
})
export class PracticeComponent {

customerModel = new Customer('mohan','a', '1995-02-17');  
constructor (private _formService: FormService){}
onSubmit(){
  this._formService.enroll(this.customerModel)
  .subscribe(
    data=> console.log('Success', data),
    error=>console.log('Error', error)
  )
}

}
