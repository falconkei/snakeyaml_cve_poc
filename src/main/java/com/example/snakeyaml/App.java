package com.example.snakeyaml;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import java.util.Map;
import java.util.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

import static spark.Spark.*;

public class App {


    public static void main(String[] args) {

        port(8080);

        get("/*", (req, res) -> {
            Student student = new Student();

            student.setId(21);
            student.setFirstName("Tim");
            student.setLastName("Doe");
            student.setAge(21);
            student.setDepartment("Cyberware");

            Course courseOne = new Course();
            courseOne.setName("Intelligence");
            courseOne.setCredits(5);

            Course courseTwo = new Course();
            courseTwo.setName("Crafting");
            courseTwo.setCredits(2);

            List<Course> courseList = new ArrayList<>();
            courseList.add(courseOne);
            courseList.add(courseTwo);

            student.setCourses(courseList);

            DumperOptions options = new DumperOptions();
            options.setIndent(2);
            options.setPrettyFlow(true);
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml yaml = new Yaml(options);

            res.type("text/plain");
            return yaml.dump(student);
        });
	
	    post("/*", (req, res) -> {

            String body = req.body();

            InputStream inputStream = new ByteArrayInputStream(body.getBytes());
            Yaml yaml = new Yaml(new Constructor(Student.class));
            Student data = yaml.load(inputStream);
            System.out.println(data);

            res.type("text/plain");
            return "File Read, Object Created";
        });
    }
}
