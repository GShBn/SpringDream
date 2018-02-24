package com.example.demo.test5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ballsb on 2018/2/24.
 */
@Repository
public interface ManRepository extends JpaRepository<Man, Long> {

    Man findByName(String name);

    Man findByNameAndAge(String name, Integer age);

}
