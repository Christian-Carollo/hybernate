package co.develhope.hybernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String fistName;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Enrollments> enrollmentsList;

}
