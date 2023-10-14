package _1_basic._12

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer();

    val contact = Contact(1, "gmldnr2222@naver.com");

    println(contact.id)
    println(contact.email)
    contact.email = "gmldnr2222@gmail.com"
    println(contact.email)
}