package net.jayanth

import javax.persistence.*

@Entity
@Table(name = "EMPLOYEE")
class Employee (@Id
                @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
                @SequenceGenerator(sequenceName = "employee_seq", allocationSize = 1, name = "EMP_SEQ")
                val id: Long,
                @Column(name = "FIRST_NAME")var firstName: String, @Column(name = "LAST_NAME") var lastName: String, @Column(name = "EXPERIENCE") var experience: Int)