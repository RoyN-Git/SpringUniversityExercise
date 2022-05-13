import exceptions.SchoolException;

public class school {

    public void updateLecturer(Lecturer lecturer) throws SchoolException {
        if (!lecturerRepo.existsById(lecturer.getId())) {
            throw new SchoolException("Lecturer not found");
        }
        lecturerRepo.saveAndFlush(lecturer);
    }

}
