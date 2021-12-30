//fun sum(a:Int, b:Int) = a+b
//같은 패키지의 파일에서 같은 이름의 함수를 선언시 오류
//따라서 정의하지 않아도 됨(다른 파일에서 이미 정의했으므로
fun sub(a:Int, b:Int) : Int = a-b

fun mul(a:Int, b:Int) : Int{
    return a*b
}

fun main() {
    var num1 : Int
    var num2 : Int

    print("number1 = ") //줄바꿈을 막으려면 println이 아닌 print
    num1 = readLine()!!.toInt() //널값을 받으면 안되므로 !!
    print("number2 = ")
    num2 = readLine()!!.toInt()
    println("number1 + number2 = ${sum(num1, num2)}")
    println("number1 - number2 = ${sub(num1, num2)}")
    println("number1 * number2 = ${mul(num1, num2)}")

}