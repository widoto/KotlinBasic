fun main() {
    var two = Array<IntArray>(3,{IntArray(3)})
    //var three = arrayOf(arrayOf(100,110,120),arrayOf(130,140,150))
    var value : Int = 100
    for(i in 0..2){
        for(j in 0..2){
            two[i][j] = value
            value = value + 10
            println("two[$i][$j]: ${two[i][j]}")
            //위의 경우 중괄호로 표시
        }
    }
}