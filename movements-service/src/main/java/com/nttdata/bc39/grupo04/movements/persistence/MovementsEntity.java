package com.nttdata.bc39.grupo04.movements.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movements")
public class MovementsEntity {
    @Id
    private ObjectId id;
    private String number;
    private double depositAmount;
    private double withdrawlAmount;
    private Date date;


}
