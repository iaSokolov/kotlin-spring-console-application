package ru.isokolov.demo.console_application.runner

import mu.KLogger
import mu.KotlinLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Runner(): CommandLineRunner {
    private val logger = KotlinLogging.logger {  }

    override fun run(vararg args: String?) {
        logger.info { "start-of-program" }

        val input = readln()
        println(input)

        logger.info { "end-of-program" }
    }
}