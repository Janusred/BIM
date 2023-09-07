import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public cliente :any ;
  public credito :any;
  public amort : any;
  

  constructor( private servicio: HttpClient, private router:Router) { 

    this.cliente=[];
    this.credito=[];
    this.amort=[];
  }

  obtenerListaCliente():void{
    this.servicio.get("http://localhost:9000/api/clientes").subscribe((respuesta:any)=>{
      console.log(respuesta);
      this.cliente= respuesta;
    });
  }
  obtenerListaCredito():void{
    this.servicio.get("http://localhost:9000/api/credito").subscribe((respuesta:any)=>{
      console.log(respuesta);
      this.credito= respuesta;
    });
  }
  obtenerListaAmort():void{
    this.servicio.get("http://localhost:9000/api/amort").subscribe((respuesta:any)=>{
      console.log(respuesta);
      this.amort= respuesta;
    });
  }

}
