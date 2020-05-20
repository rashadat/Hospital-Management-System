package com.developia.model.doctor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Doctor {

    @Id
    int id;
    String name;
    String specialist;

    public  Doctor(int id, String name, String specialist) {
    }
}
