package io.jongyun.kotlinspring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author jongyunha created on 22. 7. 17.
 */
@RestController
@RequestMapping("/v1/greetings")
class GreetingController {

    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String): String {
        return "Hello $name"
    }
}