import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Benhnhan } from './benhnhan';

@Injectable({
  providedIn: 'root'
})
export class BenhnhanService {

  constructor(private httpClient: HttpClient) { }

  private baseUrl = "http://localhost:8080/api/v1/benhnhan"

  getBenhNhanList(): Observable<Benhnhan[]> {

    return this.httpClient.get<Benhnhan[]>(`${this.baseUrl}`)
  }

  delete(id: number): Observable<Object> {

    return this.httpClient.delete(`${this.baseUrl}/${id}`);
  }
}
