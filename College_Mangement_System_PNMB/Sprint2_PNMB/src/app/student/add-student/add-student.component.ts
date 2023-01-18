import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CollegeserviceService } from 'src/app/collegeservice.service';
import { Course } from 'src/app/course';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit{
  course:Course[]=[];
 st:Student=new Student();
 constructor(private serv:CollegeserviceService,private router:Router){}
 ngOnInit(): void {
  this.getCourses();
 }

getCourses()
{
  this.serv.getAllCourse().subscribe(data=>{
    this.course=data
  });
  for (let index = 0; index < this.course.length; index++) {
    console.log(this.course[index].cname);
    
  }
  
}

 postStudent()
 {
  // this.student.student_name=this.addStudentForm.controls.student_name.value;
     
   this.serv.postStudent(this.st).subscribe(() => {
           this.router.navigate(['/students'])
           }
          
   );
     
 }

 

}

