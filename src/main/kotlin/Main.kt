fun main(){
    towerOfHanoi(3, 'A', 'C', 'B')
}

fun towerOfHanoi(n: Int, fromStack: Char, toStack: Char, auxStack: Char) {
    if (n == 1) {
        println("Move disk 1 from stack $fromStack to $toStack")
        return
    }
    towerOfHanoi(n - 1, fromStack, auxStack, toStack)
    println("Move disk $n from stack $fromStack to $toStack")
    towerOfHanoi(n - 1, auxStack, toStack, fromStack)
}
