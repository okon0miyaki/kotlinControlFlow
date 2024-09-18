package org.dicoding.controlFlow

fun main() {
  whenFlow()
  whileFlow()
  doWhileFlow()
  rangeflow()
  forFlow()
  breakContinue()

    var counter = 3
    do {
        print("Hi Kotlin! ")
        counter++
    } while (counter < 3)
}

// Example for when function, seems like switch case in java.
fun whenFlow() {
    val value = 7

    when(value) {
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("Value is not defined")
    }

    // Example for when expression, must have else branch.
    val stringOfValue = when(value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("Value is not defined")
    }

    //Checking Instance with any type of object
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val values =  27
    val ranges = 10..50

    when(values){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

}

fun whileFlow(){
    var counter = 2

    while(counter <= 3){
        println("Counter number $counter")
        counter++
    }
}

fun doWhileFlow(){
    var count = 1

    do {
        println("Count number $count")
        count++
    } while (count <= 2)
}

fun rangeflow(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach{
        print("$it ")
    }

    println()

    val upInt = 1.rangeTo(10)
    println(upInt)

    val downInt = 10 downTo (1)
    println(downInt)

    //Checking if value in range
    if (7 in downInt){
        println("Value is available")
    } else println("Value not defined")

}

fun forFlow(){
    val long = 1..3 step 2

    for (i in long){
        println("Value is $i")
    }

    //Indexing with for loop
    for ((index, value) in long.withIndex()) {
        println("value $value with index $index")
    }

    //foreach func
    val ranges = 1.rangeTo(5) step 2
    ranges.forEach{
        value -> println("value is $value")
        /*print("$it ")*/
    }
}

fun breakContinue(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print("$i ")
    }

    println()

    for (j in listOfInt) {
        if (j == null) break
        print("$j ")
    }
}