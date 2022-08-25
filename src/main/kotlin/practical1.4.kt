fun main(){
    print("Enter the Number:")
    val number= readLine()!!.toInt()
    if(number%2==0){
        println(" entered $number  number is even")
    }
    else{
        println("entered $number number is odd")

    }
}