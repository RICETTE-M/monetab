package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        log.info("Request to teacher{} ", teacher);

        Optional<Teacher> teacherOptional = findById(teacher.getId());
        if (teacherOptional.isPresent()) {
            Teacher teacherToUpdate = teacherOptional.get();
            teacherToUpdate.setMatiere(teacher.getMatiere());
            return teacherRepository.save(teacherToUpdate);
        }
        return teacher;
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }


    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteById(id);

    }
}

