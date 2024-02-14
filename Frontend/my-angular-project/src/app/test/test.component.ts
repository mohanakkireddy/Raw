import { HeroService } from './../hero.service';
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-test',
  standalone: true,
  imports: [CommonModule],
  template: `<div>
  <h1>Customers</h1>
  <ul *ngFor="let customer of customers">
    <li >{{ customer.name }}</li>
  </ul>
</div>`,
  styleUrl: './test.component.css'
})
export class TestComponent {
  customers: any[]=[];

  constructor(private myNewService: HeroService) {}

  ngOnInit() {
    this.myNewService.getCustomers().subscribe(data => this.customers=data);
  }

}
