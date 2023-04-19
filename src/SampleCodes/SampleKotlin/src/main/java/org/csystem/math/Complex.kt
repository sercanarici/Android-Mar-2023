/*----------------------------------------------------------------------
	FILE        : Complex.kt
	AUTHOR      : Android-May-2022 Group
	LAST UPDATE : 19.04.2023

	Immutable Complex class that represents the complex number

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
-----------------------------------------------------------------------*/

package org.csystem.math

import kotlin.math.sqrt
import kotlin.random.Random

class Complex(val real: Double = 0.0, val imag: Double = 0.0) {
    val norm: Double
        get() = sqrt((real * real) + imag * imag)

    val length: Double
        get() = norm

    val conjugate: Complex
        get() = Complex(real, -imag)

}

fun complexTest()
{
    val z = Complex(3.4, 5.6)
    val zc = z.conjugate;

    println("|${z.real} + i.${z.imag}| = ${z.norm}")
    println("|${zc.real} + i.${zc.imag}| = ${zc.norm}")
}

fun runCoinSimulationApp()
{
    while (true) {
        println("Parayı kaç kez atmak istersiniz")
        val count = readln().toInt()

        if (count==0)
            break

        println("p = ${coinProbability(count)}")
    }
}
fun coinProbability(count: Int) : Double
{
    var n =0
    for (i in 0 until count)
        n += Random.nextInt(2)

    return n.toDouble() / count
}
fun main() {
    //complexTest()
    //runCoinSimulationApp()



}