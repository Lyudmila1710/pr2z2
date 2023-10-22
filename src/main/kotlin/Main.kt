fun main() {
        val array = Array(5) { IntArray(5) }
    var prov = true
        println("Введите элементы массива 5x5:")

        for (i in 0 until 5) {
            for (j in 0 until 5) {
                print("Элемент [$i][$j]: ")
                array[i][j] = readln().toInt()
            }
        }

        println("Массив заполнен:")
        for (i in 0 until 5) {
            for (j in 0 until 5) {
                print("${array[i][j]} ")
                if(array[i][j] != array[j][i]){
                    prov=false
                }
            }
            println()
        }

if(prov==true){
    print("Массив симметричен")
}
    else{
    println("Массив не симментричен")}
}