import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './student';
import { Observable } from 'rxjs';
import { Course } from './course';

@Injectable({
  providedIn: 'root'
})
export class CollegeserviceService {

  constructor(private http:HttpClient) { }

  getStudent(id:number):Observable<Student>
  {
    console.log("Get request sent...."); 
    return this.http.get<Student>("http://localhost:8080/student/"+id);

  }
  getCourse(id:number):Observable<Course>
  {
    console.log("Get request sent...."); 
    return this.http.get<Course>("http://localhost:8080/course/"+id);

  }

  postStudent(st:Student):Observable<Student>
  {
      //return this.http.post("http://localhost:8080/test",student,{responseType:'text'} );
      return this.http.post<Student>("http://localhost:8080/student",st);
  }
  postCourse(st:Course):Observable<Course>
  {
      //return this.http.post("http://localhost:8080/test",student,{responseType:'text'} );
      return this.http.post<Course>("http://localhost:8080/course",st);
  }

  getAllStudents():Observable<Student[]>
  {
    console.log("Get all request sent...."); 
    return this.http.get<Student[]>("http://localhost:8080/students");

  }
  getAllCourse():Observable<Course[]>
  {
    console.log("Get all request sent...."); 
    return this.http.get<Course[]>("http://localhost:8080/courses");

  }
  getStudentByCourse(searchterm:string):Observable<Student[]>
  {
    return this.http.get<Student[]>("http://localhost:8080/Bycourse/"+searchterm);

  }

  deleteStudent(id:number):Observable<any>
  {
    return this.http.delete("http://localhost:8080/student/"+id,{responseType:'text'});

  }
  deleteCourse(id:number):Observable<any>
  {
    return this.http.delete("http://localhost:8080/course/"+id,{responseType:'text'});

  }

  updateStudent(student:Student,id:number):Observable<Student>
  {
   return this.http.put<Student>("http://localhost:8080/student/"+id,student,{responseType:'text'as'json'});

  }
  updateCourse(course:Course,id:number):Observable<Student>
  {
   return this.http.put<Student>("http://localhost:8080/course/"+id,course,{responseType:'text'as'json'});

  }
}
