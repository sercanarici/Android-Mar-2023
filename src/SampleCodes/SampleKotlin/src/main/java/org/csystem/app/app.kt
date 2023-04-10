package org.csystem.app

fun main() = runApp()

fun runApp() {
    //println("Hello, World")
    //foo()
    //println("Goodbye, World")
    //baz()
    //char1()
    //char2()
    //runSum3DigitsTest()

    /*print("a?")
    val a = readln().toDouble()
    print("b?")
    val b = readln().toDouble()
    print("c?")
    val c = readln().toDouble()
    println(findRoots(a, b, c))*/

//    print("lütfen ilk sayıyı giriniz:")
//    val a = readln().toInt()
//    print("lütfen ikinci sayıyı giriniz:")
//    val b = readln().toInt()
//    print("lütfen üçüncü sayıyı giriniz:")
//    val c = readln().toInt()

//    println("signum: ${sigNum(a)}")
//    println("mid: ${mid(a,b,c)}")
//    println("mid2: ${mid2(a,b,c)}")
//    println("order: ${order(a,b,c)}")
//    println("order2: ${order2(a,b,c)}")

    while (true) {
        print("Bir Sayı Giriniz.")
        val value = readln().toInt()

        println("$value sayısının basamak sayısı: ${countDigits(value)}")

        if (value == 0)
            break
    }

}

fun foo() {
    println("foo")
    bar()
}

fun bar() {
    println("bar")
}

fun baz() {
    print("Bir sayı giriniz:")
    val a = readLine()!!.toInt()
    print("Bir sayı giriniz:")
    val b = readln().toInt()

    println("Çarpım:${a * b}, Toplam:${a + b}, Fark:${a - b}")

    var hede = 4000000000
}

fun char1() {
    val ch: Char = 'C'
    println("ch = $ch")
}

fun char2() {
    val ch: Char = '\uACB3'
    println(ch)
}

fun sum3Digits(value: Int): Int {
    val a = value / 100
    val b = value / 10 % 10
    val c = value % 10

    return kotlin.math.abs(a + b + c)
}

fun sum3Digits2(value: Int): Int {
    val a = value.div(100)
    val b = value.div(10).rem(10)
    val c = value.rem(10)

    return kotlin.math.abs(a + b + c)
}

fun runSum3DigitsTest() {
    print("3 basamaklı bir sayı giriniz")
    val value = readln().toInt()

    print("$value sayısının basamakları toplamı ${sum3Digits(value)}")
}

fun calculateDelta(a: Double, b: Double, c: Double) = b * b - 4 * a * c

///
fun findRoots(a: Double, b: Double, c: Double): String {
    //val delta =  b * b - 4 * a * c
    val delta = calculateDelta(a, b, c)

    fun calculateRoots(): String {
        val sqrtDelta = Math.sqrt(delta)
        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b + sqrtDelta) / (2 * a)}"
    }

    return if (delta > 0) {
        calculateRoots()
    } else if (delta == 0.toDouble())
        "x1 = x2 = ${-b / (2 * a)}"
    else
        "No real root"
}

fun countDigits(value: Int): Int {
    var count = 0
    var temp = value

    do {
        ++count
        temp /= 10
    } while (temp != 0)

    return count
}

fun sumDigits(value: Int): Int {
    var total = 0
    var temp = value

    while (temp != 0) {
        total += temp % 10
        temp /= 10
    }
    return kotlin.math.abs(temp)
}

fun reversed(value: Int): Int {

    var result =0
    var temp = value

    while (temp!=0) {
        result = result*10 + temp%10
        temp /= 10
    }

    return  result
}

fun isPalindrom(value: Int) = reversed(value)==value