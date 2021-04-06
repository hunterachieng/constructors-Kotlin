fun main(){
    var identity = Person("Amanda", "Kelly", 25,"Nairobi,Kenya")
    var population = Population (42000000,"Business")

}
//primary constructor
class Person (var firstName:String,var lastName:String,var age:Int, var location:String){
    init{
        println("Full name = $firstName $lastName")
        println("Age = $age")
        println("Location = $location")
    }

}
//secondary constructor
class Population {
    constructor(people:Long){

           }
    constructor(people:Long,occupations:String){
        var totalPopulation = people
        var commonOccupation = occupations
        println("Kenya has a population of $totalPopulation million people. The most common profession is $commonOccupation")
    }
}