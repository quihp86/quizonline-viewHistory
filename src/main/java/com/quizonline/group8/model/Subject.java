package com.quizonline.group8.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;


@Entity
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_Id;
        private String subjectName;
    private Timestamp dateCreate;
    @JsonIgnore
    @OneToMany(mappedBy = "subject")
    private Collection<QuizCategory> quizCategories;
    @JsonIgnore
    @OneToMany(mappedBy = "subject")
    private Collection<Question> questions;
//    @Override
//    public int hashCode(){
//        int hash = 7;
//        hash = 13 * hash + Objects.hashCode(this.subject_Id);
//        hash = 13 * hash + Objects.hashCode(this.subjectName);
//        hash = 13 * hash + Objects.hashCode(this.dateCreate);
//return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Subject other = (Subject) obj;
//        if (this.dateCreate != other.dateCreate) {
//            return false;
//        }
//        if (!Objects.equals(this.subject_Id, other.subject_Id)) {
//            return false;
//        }
//        return Objects.equals(this.subjectName, other.subjectName);
//    }

}
