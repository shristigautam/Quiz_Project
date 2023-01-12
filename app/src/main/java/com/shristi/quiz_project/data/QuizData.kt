package com.shristi.quiz_project.data

import com.shristi.quiz_project.constants.Constant.IS_CHECK_BOX
import com.shristi.quiz_project.constants.Constant.IS_RADIO_BUTTON

class QuizData {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1/15 \t What is Kotlin?",
                    IS_RADIO_BUTTON,
                    "Kotlin is a statically typed, cross-platform programming language that is fully compatible with Java. It is a more modern and expressive alternative to Java, and it can be used to create Android apps, web apps, and other types of software. It was developed by JetBrains, the company behind the IntelliJ IDEA Java IDE.",
                    "a",
                    "A programming language",
                    null,
                    "",
                    mutableListOf("A programming language","A web browser", "A web server", "A scripting language")
                ),
                Quiz(
                    2,
                    "2/15 \t What is the purpose of the 'is' operator in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, the 'is' operator is used to check if an object is an instance of a particular class or type. It can be used in a control flow statement, such as 'if' or 'when', to check the type of an object and execute different code based on the type. It is similar to the 'instanceof' operator in Java.",
                    "a",
                    "Type checking",
                    null,
                    "",
                    mutableListOf("Type checking","Call Data class", "For Looping", "Handling exceptions")
                ),
                Quiz(
                    3,
                    "3/15 \t How does Kotlin differ from Java in terms of syntax and usage?",
                    IS_RADIO_BUTTON,
                    "Kotlin's syntax is more concise and expressive than Java, which makes it easier to read and write code. It also has a more modern feature set, including support for functional programming and extension functions. Additionally, it has improved type interface and better null safety, which can help prevent common programming errors.",
                    "c",
                    "Both",
                    null,
                    "",
                    mutableListOf("Syntax","Features", "Both", "None of the above")
                ),
                Quiz(
                    4,
                    "4/15 \t What are some of the key benefits of using Kotlin for Android development?",
                    IS_RADIO_BUTTON,
                    "Kotlin provides many benefits when used for Android development. Some of the key benefits include improved code readability and maintainability, better performance, and a more modern feature set. Additionally, it is fully compatible with Java, which means that developers can easily integrate Java code into their Kotlin projects.",
                    "a",
                    "Improvement in code quality",
                    null,
                    "",
                    mutableListOf("Improvement in code quality","Reduced development time", "Reduced cost", "All of the above")
                ),
                Quiz(
                    5,
                    "5/15 \t What is the purpose of the 'lateinit' keyword in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, the 'lateinit' keyword is used to indicate that a property should be initialized later in the program, rather than in the constructor. This keyword is used for non-nullable properties that are not primitive types, and it allows you to avoid using nullable types or having to initialize the property with a default value in the constructor.",
                    "d",
                    "Late Initialization",
                    null,
                    "",
                    mutableListOf("Initialization","Overloading", "Difference in syntax", "Late Initialization")
                ),
                Quiz(
                    6,
                    "6/15 \t APK stands for _____",
                    IS_RADIO_BUTTON,
                    "An APK is a short form of the Android Package Kit. An APK file is the file format used to install the applications on the android operating system.",
                    "c",
                    "Android Package Kit",
                    "",
                    "",
                    mutableListOf("Android Phone Kit","Android Page Kit","Android Package Kit")
                ),
                Quiz(
                    7,
                    "7/15 \t What does API stand for?",
                    IS_RADIO_BUTTON,
                    "API stands for application program interface. It is a set of routines, protocols, and tools for building software and applications.",
                    "a",
                    "Application Programming Interface",
                    "",
                    "",
                    mutableListOf("Application Programming Interface","Android Programming Interface","Android Page Interface", "Application Page Interface")
                ),
                Quiz(
                    8,
                    "8/15 \t What is the purpose of the Any class in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, the Any class is the superclass of all classes and serves as a general purpose class with basic functionality such as the ability to compare for equality and the ability to convert to a string. It is similar to the Object class in Java.",
                    "a",
                    "Superclass for all classes",
                    null,
                    "",
                    mutableListOf("Superclass for all classes","Control flow class", "Math class", "None of the above")
                ),
                Quiz(
                    9,
                    "9/15 \t What is the purpose of the 'break' and 'continue' keywords in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, the 'break' keyword is used to exit a loop early, whereas the 'continue' keyword is used to skip the current iteration of a loop and continue with the next iteration. Both keywords are used in control flow statements, such as for loops, while loops and do-while loops.",
                    "d",
                    "None of the above",
                    null,
                    "",
                    mutableListOf("Exit a loop","Skip an iteration", "Both of the above", "None of the above")
                ),
                Quiz(
                    10,
                    "10/15 \t What are some of the common ways to create a new instance of a class in Kotlin?",
                    IS_CHECK_BOX,
                    "In Kotlin, there are several ways to create a new instance of a class, including using the class's primary constructor, using a secondary constructor, and using the keyword 'object' to create a singleton instance of the class.",
                    "d",
                    "All of the above",
                    null,
                    "",
                    mutableListOf("Primary constructor","Secondary constructor", "Singleton object", "All of the above")
                ),
                Quiz(
                    11,
                    "11/15 \t What is the purpose of the Unit type in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, the Unit type is used to indicate that a function or property does not return a value. It is similar to the void type in Java.",
                    "a",
                    "Represents NO returned value",
                    null,
                    "",
                    mutableListOf("Represents NO returned value","Represents a null value", "Represents a boolean value", "None of the above")
                ),
                Quiz(
                    12,
                    "12/15 \t What is the purpose of the 'lambda' in kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, a lambda is a small anonymous function that can be passed as an argument to a higher-order function. Lambdas are enclosed in curly braces and can be assigned to a variable or passed directly as an argument. They are useful for implementing functional programming concepts such as map, filter and reduce.",
                    "a",
                    "Small anonymous function",
                    null,
                    "",
                    mutableListOf("Small anonymous function","Control flow statement", "Loop statement", "None of the above")
                ),
                Quiz(
                    13,
                    "13/15 \t What is the difference between a data class and a regular class in Kotlin?",
                    IS_RADIO_BUTTON,
                    "In Kotlin, a data class is a class that is used to store data and has certain convenience features such as automatic generation of equals(), hashCode(), and toString() methods. A regular class is a class that is used to define custom behavior and can have additional properties and methods. Data class should only have primary constructor with at least one parameter, whereas regular class can have any constructor.",
                    "c",
                    "Automatic generation of some methods",
                    null,
                    "",
                    mutableListOf("Data storage vs behavior","No difference", "Automatic generation of some methods", "None of the above")
                ),
                Quiz(
                    14,
                    "14/15 \t What is the purpose of the 'when' expression in Kotlin?",
                    IS_CHECK_BOX,
                    "In Kotlin, the 'when' expression is used as a control flow statement to select one of multiple code blocks to execute based on the value of an expression. It is similar to the 'switch' statement in Java and other languages. The 'when' expression can be used with any type of expression, including integers, strings, and objects.",
                    "a",
                    "Control flow statement",
                    null,
                    "",
                    mutableListOf("Control flow statement","Data class", "Loop statement", "None of the above")
                ),
                Quiz(
                    15,
                    "15/15 \t What is the purpose of the 'try-catch' block in Kotlin?",
                    IS_CHECK_BOX,
                    "In Kotlin, the 'try-catch' block is used to handle exceptions and errors that may occur during the execution of code. The 'try' block contains the code that may throw an exception, and the 'catch' block contains the code that will handle the exception if it is thrown. It is similar to the try-catch block in Java and other languages",
                    "d",
                    "Handling Exceptions",
                    null,
                    "",
                    mutableListOf("Conditional statement","Data class", "Loop statement", "Handling Exceptions")
                ),
                )
        }
    }
}