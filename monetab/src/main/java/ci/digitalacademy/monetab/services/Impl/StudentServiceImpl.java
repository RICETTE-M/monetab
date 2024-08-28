package ci.digitalacademy.monetab.services.Impl;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

private final StudentRepository studentRepository;
    //private final logger log = loggerFactory.getlogger(UserServiceImpl.class);


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        log.info("Request to student{} ", student);

        Optional<Student> studentOptional = findOne(student.getId());
        if (studentOptional.isPresent()) {
            Student studentToUpdate = studentOptional.get();
            studentToUpdate.setMatricule(student.getMatricule());
            return studentRepository.save(studentToUpdate);
        }
        return student;
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentRepository.findById(id);
    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);

    }


}
