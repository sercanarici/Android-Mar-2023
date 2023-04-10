package org.csystem.app

fun order(a: Int, b: Int, c: Int): String {
    val (small, medium, large) = listOf(a, b, c).sorted()

    val result = if (small == medium && medium == large) {
        "$small = $medium = $large"
    } else if (small == medium) {
        "$small = $medium < $large"
    } else if (medium == large) {
        "$small < $medium = $large"
    } else {
        "$small < $medium < $large"
    }

    return result
}

fun mid(a: Int, b: Int, c: Int): Int {
    val (small, medium, large) = listOf(a, b, c).sorted()
    return medium
}

fun order2(a: Int, b: Int, c: Int): String {
    val small: Int
    val medium: Int
    val large: Int

    if (a <= b && a <= c) {
        small = a
        if (b <= c) {
            medium = b
            large= c
        } else {
            medium = c
            large = b
        }
    } else if (b <= a && b <= c) {
        small = b
        if (a <= c) {
            medium = a
            large = c
        } else {
            medium = c
            large = b
        }
    } else {
        small = c
        if (a <= b) {
            medium = a
            large = b
        } else {
            medium = b
            large = a
        }
    }

    val result = if (small == medium && medium == large) {
        "$small = $medium = $large"
    } else if (small == medium) {
        "$small = $medium < $large"
    } else if (medium == large) {
        "$small < $medium = $large"
    } else {
        "$small < $medium < $large"
    }

    return result
}

fun mid2(a: Int, b: Int, c: Int): Int {
    val middle: Int

    if (a <= b && a <= c) {
        middle = if (b <= c) {
            b
        } else {
            c
        }
    } else if (b <= a && b <= c) {
        middle = if (a <= c) {
            a
        } else {
            c
        }
    } else {
        middle = if (a <= b) {
            a
        } else {
            b
        }
    }
    return middle
}

fun mid3(a: Int, b: Int, c: Int): Int {

    val middle: Int = if (a <= b && a <= c) {
        if (b <= c) {
            b
        } else {
            c
        }
    } else if (b <= a && b <= c) {
        if (a <= c) {
            a
        } else {
            c
        }
    } else {
        if (a <= b) {
            a
        } else {
            b
        }
    }
    return middle
}

fun sigNum(a: Int): Int {
    return if (a > 0) {
        1
    } else if (a < 0) {
        -1
    } else {
        0
    }
}