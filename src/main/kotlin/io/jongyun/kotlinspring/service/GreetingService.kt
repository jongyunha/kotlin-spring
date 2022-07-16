package io.jongyun.kotlinspring.service

import org.springframework.stereotype.Service

/**
 * @author jongyunha created on 22. 7. 17.
 */
@Service
class GreetingService {

    fun retrieveGreeting(name: String) = "Hello $name"
}