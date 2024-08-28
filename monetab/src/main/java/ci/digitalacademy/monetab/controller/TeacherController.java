package ci.digitalacademy.monetab.controller;
import ci.digitalacademy.monetab.models.Teacher;
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
@RequestMapping("/teachers")
@RequiredArgsConstructor
@Slf4j
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public String showTeacherPage(Model model) {
        List<Teacher> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teacher/teacher";
    }

    @PostMapping("/saveTeacher")
    public String showSaveTeacher(Teacher teacher) {
        log.debug("Request to save teacher: {}", teacher);
        teacherService.save(teacher);
        return "redirect:/teachers";

    }


    @GetMapping("/{id}")
    public String showUpdate(Model model, @PathVariable Long id) {
        log.debug("Request to show update teacher forms", id);
        Optional<Teacher> teacher = teacherService.findById(id);
        if (teacher.isPresent()) {
            model.addAttribute("teacher", teacher.get());
            return "teacher/form";
        } else {
            return "redirect:/teachers";
        }
    }


    @GetMapping("/add")
    public String showAdd(Model model) {
        log.debug("Request to show add teacher");
        model.addAttribute("teacher", new Teacher());
        return "teacher/form";
    }
}
