package com.github.theimplementer.bazelrecacher

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    exitProcess(CommandLine(BazelRecacher()).execute(*args))
}

@Command(name = "bazelrecacher", helpCommand = true)
class BazelRecacher : Runnable {

    @Option(names = ["--java-binary-path"], description = ["The path to the java binary used by bazel."], required = true)
    lateinit var javaBinaryPath: String

    override fun run() {
        println(javaBinaryPath)
    }
}