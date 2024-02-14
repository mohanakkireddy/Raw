package com.example.demo.app.student;

import com.example.demo.app.customer.ProgrammaticallyValidatingService;
import com.example.demo.app.customer.dto.Customer;
import com.example.demo.app.customer.dto.Violation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    private final ProgrammaticallyValidatingService programmaticallyValidatingService;

    public StudentController(StudentService studentService,ProgrammaticallyValidatingService programmaticallyValidatingService) {
        this.studentService = studentService;
        this.programmaticallyValidatingService = programmaticallyValidatingService;
    }


    @GetMapping("/get")
    public List <Student> getStudents(){
        return studentService.getStudents();
    }



    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void  updateStudent(@PathVariable("studentId") Long studentId,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String email){
        studentService.updateStudent(studentId, name, email);
    }
    @PostMapping("/post")
    public Student registerNewStudent(@RequestBody Student student){
       return studentService.addNewStudent(student);

    }
    @PostMapping("/register")
    public List<Violation> submitForm(@RequestBody Customer customer) {
        return programmaticallyValidatingService.validateInputWithInjectedValidator(customer);

    }



}




