import { Course } from "./course";

export class Student {
    sname:string='';
    sage:string='';
    scontact:string='';
    scourse:Course={
        cid:0,
        cname:'',
        cduration:'',
        cfees:0
    }
}
