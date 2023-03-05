package repository;

import models.Students;

import java.util.List;

public interface StudentRepositoryAware {
    List<Students> searchStudents();

    List<Students> insertNewStudents(Students students);

    List<Students> deleteStudents(int id);
}
