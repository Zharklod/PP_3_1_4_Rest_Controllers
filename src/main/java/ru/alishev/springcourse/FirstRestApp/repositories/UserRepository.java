package ru.alishev.springcourse.FirstRestApp.repositories;


import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.springcourse.FirstRestApp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = {"roles"})
    User findByEmail(String email);
}