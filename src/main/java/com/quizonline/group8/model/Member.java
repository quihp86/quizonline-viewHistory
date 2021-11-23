package com.quizonline.group8.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Member implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String password;
    private String fullname;
    private Long role_id;
    private String status;
<<<<<<< HEAD

    @ManyToMany
    private Set<Quiz> quiz;
=======
    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Quiz> quizzes;
>>>>>>> 2b45610 (Add project)

    @ManyToOne(fetch =  FetchType.EAGER)
    @JoinColumn(name = "role_Id")
    private Role roles;

}
