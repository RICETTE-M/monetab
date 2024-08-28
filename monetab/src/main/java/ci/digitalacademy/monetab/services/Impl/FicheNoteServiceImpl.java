package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.FicheNoteRepository;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.FicheNoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FicheNoteServiceImpl implements FicheNoteService {
    private final FicheNoteRepository ficheNoteRepository;


    @Override
    public FicheNote save(FicheNote ficheNote) {
        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
        log.info("Request to ficheNote{} ", ficheNote);

        Optional<FicheNote> ficheNoteOptional = findById(ficheNote.getId());
        if (ficheNoteOptional.isPresent()) {
            FicheNote ficheNoteToUpdate = ficheNoteOptional.get();
            ficheNoteToUpdate.setNote(ficheNote.getNote());
            ficheNoteToUpdate.setAnnee(ficheNote.getAnnee());
            return ficheNoteRepository.save(ficheNoteToUpdate);
        }
        return ficheNote;
    }

    @Override
    public Optional<FicheNote> findById(Long id) {
        return ficheNoteRepository.findById(id);
    }


    @Override
    public List<FicheNote> findAll() {
        return ficheNoteRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        ficheNoteRepository.deleteById(id);

    }

}
