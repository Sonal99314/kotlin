import java.util.Scanner

fun main(){
    println("hello world")
    variables()
}
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

