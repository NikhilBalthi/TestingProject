package org.example;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="book_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;

    @NonNull
    private String name;

    

}
