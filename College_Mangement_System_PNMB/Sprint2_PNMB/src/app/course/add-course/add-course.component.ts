import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CollegeserviceService } from 'src/app/collegeservice.service';
import { Course } from 'src/app/course';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit{
 st:Course=new Course();
 constructor(private serv:CollegeserviceService,private router:Router)
 {}
 ngOnInit(): void {
    this.postData();
 }

 postData()
 {
  // this.Course.Course_name=this.addCourseForm.controls.Course_name.value;
     
   this.serv.postCourse(this.st).subscribe(() => {
           this.router.navigate(['/courses'])
           }
          
   );
     
 }

 
}
