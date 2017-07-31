package net.jayanth

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : CrudRepository<Employee, Long> {
    fun findByFirstName(firstName: String): List<Employee>
    fun findByExperience(experience: Int): List<Employee>

    //comment
}