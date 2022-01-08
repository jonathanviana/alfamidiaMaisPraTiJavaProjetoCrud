package com.alfamidia.maisprati.java.projeto.crud;

import com.alfamidia.maisprati.java.projeto.crud.user.UserRepository;
import com.alfamidia.maisprati.java.projeto.crud.user.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository testRepository;

    @Test
    public void testAddNew() {
        User user = new User();

        user.setEmail("testZero@gmail.com");
        user.setFirstName("Test");
        user.setLastName("Zero.");
        user.setPhone("55-51-9-1111-1111");
        user.setBirthdate("11/11/1111");
        user.setRegistrationDate("22/22/2222");
        user.setUpdateDate("33/33/3333");
        user.setFinalGrade(100.00);

        User testSavedUser = testRepository.save(user);

        Assertions.assertThat(testSavedUser).isNotNull();
        Assertions.assertThat(testSavedUser.getId()).isGreaterThan(0);

    }

    @Test
    public void testListAll() {
        Iterable<User> users = testRepository.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void testUpdate() {
        Integer userId = 1;
        Optional<User> optionalUser = testRepository.findById(userId);
        User user = optionalUser.get();
        user.setFirstName("Alfamidia");
        testRepository.save(user);

        User updateUser = testRepository.findById(userId).get();
        Assertions.assertThat(updateUser.getFirstName()).isEqualTo("MaisPraTi");
    }

    @Test
    public void testGet(){
        Integer userId = 7;
        Optional<User> optionalUser = testRepository.findById(userId);
        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete(){
        Integer userId = 42;
        testRepository.deleteById(userId);

        Optional<User> optionalUser = testRepository.findById(userId);
        Assertions.assertThat(optionalUser).isNotPresent();
    }

}

