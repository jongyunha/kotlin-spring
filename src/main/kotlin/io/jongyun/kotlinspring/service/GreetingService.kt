package io.jongyun.kotlinspring.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

/**
 * @author jongyunha created on 22. 7. 17.
 */
@Service
class GreetingService {

    @Value(value = "\${message}")
    private lateinit var message: String

    fun retrieveGreeting(name: String) = "$message $name"
}