package edu.miu.backend.dto;

import edu.miu.backend.entity.Department;
import edu.miu.backend.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Integer id;
    private String email;
    private String lastName;
    private String firstName;
    private String password;
    private AddressDto address;
    private Integer majorId;
    private Float gpa;
    private MultipartFile file;
}
