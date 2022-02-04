import java.util.Scanner




fun variables(){
    val firstName: String="sonal"
    println(firstName)
    val city="Hyderabad"
    println("my city is$city")
    var state: String?=null
    println(state)
    state="Bihar"
    println(state)
    val country=null
    println(country)
}
fun handlingVariables(){
    var country : String?=null
    if (country!=null){
        println(country)
    }
    else{
        println("is null")
    }
    println(country?.uppercase())
}
//---Arrays
fun array(){
    val cities: Array<String> = arrayOf("Bangalore","Delhi")
    println(cities[0])
    println(cities.get(0))
    println(cities.size)
    println(cities.toString())
    cities[0]="Patna"

    //2nd way
    val numbers= intArrayOf(2,5,6)
    //3rd
    var countries= arrayOf<String>("Patna")

}

fun standardOutput(){
    val example="Modern"
    println("$example  Standard output")
}

fun standardInput(){
    val sc=Scanner(System.`in`)
    println("Enter Name")
    val name=sc.nextLine()
    println(name)
    println("enter lastname")
    val lastname= readLine()
    println(lastname)
}

fun operators(){
    val a=10
    val b=20
    println("Addition:${a+b}")
    println("Subtraction:${a-b}")
    println("Multiply:${a*b}")
    println("Multiply:${a.times(b)}")
    println("Divide:${a/b}")
    println("Modulo:${a%b}")


}
fun conditional(){
    val age=10
    if (age>10){
  println("greater")
    }
    else{
        println("lesseer")
    }
    val a=10
    val b=20
    //Expressions
    val status=if (age>15) "greater" else "lesser"
    val max=if(a>b) { println("greater")
        a } else { println("lesser")
        b
    }
}
fun whileLoop(){
    var number=1
    while (number<11){
        println(number)
        number++
    }
}
fun doWhileLoop(){
    var number=1
    do{
        println(number)

    }while (number<11)
}
fun forLoop(){
    var fruit="Apple"
    for (i in fruit){
        println(i)
    }
    for (i in 1 .. 10 step 3){
        println(i)
    }
    for (i in 10 downTo 1){
        println(i)
    }
   var cities= arrayOf("abd","gya")
    for (i in cities.indices){
        println(cities[i])
    }
    for((index,value ) in cities.withIndex()){
        print(index)
        print(value)
    }
    var fruits= arrayOf("Apple","Banana","Watermelon")
    fruits.forEach {
        println(it)
    }

}
fun whenStatement(){
    val month="june"
    when(month){
        "jan"->println("it's summer")
        "june","july"-> println("it's rainy")
        "Dec"->println("it's winter")
        else-> println("invalid month")
    }
    val output=when(month){
        "jan"->"it's summer"
        "june","july"-> "it's rainy"
        "Dec"->"it's winter"
        else-> "None"
    }
    println(output)
    val number=100
    when (number){
        in 1..10-> println("between 0-10")
        in 11..20-> println("between 10-20")
    }
    val num=5
    when{
        num>10-> println("greater than 10")
    }
}
//labelled break and continue
//unlabelled break and continue
fun unlablledBreakAndContinue(){
    var num=1
    while(num<10){
        if (num==6){
            break
        }
        println(num)
        num++
    }
    while (num<10){
        if (num==6){
            continue
        }
        println(num)
        num++
    }
}
fun labelledBreakAndContinue(){
    var num1=10
    outer@while (num1>0){
        inner@while (num1>2){
            if (num1==3){
                break@outer
            }
            num1--
            println(num1)
        }
    }
}
fun exampleFunction(){
    val number1: Int=10
    val number2: Int=20
    sum(number1,number2)
    // sum(num2=number1,num1=number2)
    student(age=25, name="Ramesh")
}
// Unit is default return type
fun sum(num1 : Int,num2 :Int) : Int{
    return num1+num2
}
//fun student(name: String="name",age: Int)
//student()
fun student(name: String,age: Int){
    println(name)
    println(age)
}
fun factorial(num: Int): Int{
    if (num==1){
        return num
    }
    else{
        return num*factorial(num-1)
    }
}
fun factorialTail(num: Int,value: Int=1){
    if (num==1){
        print(num)
    }
    factorialTail(num-1,value*num)
}
/*
factorial(3)
return num*factorial(2)
        return num* factorial(1)
                         return
 */
fun getName() :String="sonal"
//Anonymous
fun exampleAnonymous(){
    val sum=fun(num1: Int,num2:Int): Int=num1+num2
    sum(10,20)
}
//----Collections
fun collections(){
    val arrayExample= arrayOf("Bangalore","Chennai")
    val citiesList= listOf("Patna","pune").toMutableList()
    val citiesList2= mutableListOf("kashmir","jaipur")
    citiesList2.add("Abd")
    citiesList2.map{
        print(it)
    }
    for (city in citiesList2){
        print(city)
    }
    val stateCapitals= mapOf("a" to "b")    //imp
    stateCapitals.forEach{
        println(it.key)
    }
}
// access modifiers
//public,protected,private,internal(inside the package:like in src)

class Employee constructor(var fName: String,val lName:String){
    //val firstName: String=fName
    // val lastName:String=lName
    var gender:String?=null
    get() {
        //return field
        return "output"
        //return gender?.uppercase()
        //return field?.uppercase()
    }
    set(value){
        field=value?.lowercase()
    }
    fun printEmpDetails(){
        println("abc")
    }
    init {
        println("inside the init block")
    }
    //constructor (firstName: String,lastName: String,gender:String){
      //  this.gender=gender
  //}
    infix fun setName(name: String){
        this.fName=name
    }
}

fun main(){
    println("hello world")
    val employee :Employee=Employee("Ramesh","kumar")
    //val employee2 :Employee=Employee("Ramesh","kumar", gender = "male")
    print(employee.lName)
    print(employee.fName)
    //employee.lName="suresh"
    employee.fName="suresh"
    println(employee.gender)
    employee.gender="Male"
    employee.printEmpDetails()
}


