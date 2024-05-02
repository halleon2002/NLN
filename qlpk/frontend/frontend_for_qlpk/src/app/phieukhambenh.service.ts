import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Phieukhambenh } from './phieukhambenh';

@Injectable({
  providedIn: 'root'
})
export class PhieukhambenhService {

  constructor(private httpClient: HttpClient) { }

  private baseUrl = "http://localhost:8080/api/v2/phieukhambenh"

  getAllnPhieuKhanBenh(): Observable<Phieukhambenh[]> {

    return this.httpClient.get<Phieukhambenh[]>(`${this.baseUrl}`);
  }

  createPhieuKhamBenh(phieukhambenh: Phieukhambenh): Observable<Phieukhambenh> {

    return this.httpClient.post<Phieukhambenh>(`${this.baseUrl}`, phieukhambenh);
  }

  deletePhieuKhamBenh(id: number): Observable<object> {
    return this.httpClient.delete(`${this.baseUrl}/${id}`);
  }
}
