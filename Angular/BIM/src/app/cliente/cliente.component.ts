import { Component } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent {
  constructor(private servicio:ServiceService) {
    this.servicio.obtenerListaCliente();
    this.servicio.obtenerListaCredito();
    this.servicio.obtenerListaAmort();
    
  }
  get cliente(){
    return this.servicio.cliente;
  }
  get credito(){
    return this.servicio.credito;
  }
  get amort(){
    return this.servicio.amort;
  }
}
