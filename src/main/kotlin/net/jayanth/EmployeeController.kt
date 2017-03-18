package net.jayanth

import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/employees")
class EmployeeController(val employeeRepository: EmployeeRepository) {

    @GetMapping
    fun list() = employeeRepository.findAll()

    @GetMapping("/experience/{years}")
    fun get(@PathVariable years: Int) = employeeRepository.findByExperience(years)

    @GetMapping("/name/{givenName}")
    fun get(@PathVariable givenName: String) = employeeRepository.findByFirstName(givenName)
}