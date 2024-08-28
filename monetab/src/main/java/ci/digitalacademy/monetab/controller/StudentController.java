package ci.digitalacademy.monetab.controller;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String showStudentPage(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "student/student";
    }

    @PostMapping("/saveStudent")
    public String showSaveStudent(Student student) {
        log.debug("Request to save student: {}", student);
        studentService.save(student);
        return "redirect:/students";
    }


    @GetMapping("/{id}")
    public String showUpdate(Model model, @PathVariable Long id) {
        log.debug("Request to show update student forms", id);
        Optional<Student> student = studentService.findOne(id);
        if (student.isPresent()) {
            model.addAttribute("student", student.get());
            return "student/form";
        } else {
            return "redirect:/students";
        }
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        log.debug("Request to show add student");
        model.addAttribute("student", new Student());
        return "student/form";
    }


}

