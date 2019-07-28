package com.eaxample.kotlin.sandbox

//make the add a infix function to omit the braces
infix fun <E> MutableList<E>.add(element: E) = this.add(element)

//overwrite the compare to
operator fun <E> MutableList<E>.compareTo(element: E) :Int {
    this.add(element)
    return 0
}

//is it seriously that size???
infix fun <E> MutableList<E>.ఠ_ఠ(size: Int):Boolean {
    return this.size==size
}

fun testSome(){

    val someMutableList = mutableListOf<String>()
    someMutableList add "dff"
    someMutableList < "ff"

   if(someMutableList ఠ_ఠ 2){
       println(someMutableList)
   }

}

fun main() {
    testSome()
}