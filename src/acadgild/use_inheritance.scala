package acadgild


//Vehicle Class
class Vehicle(speed:Int) {
  val mph :Int =speed
  def race() = println("Racing")
}

//Car Inheriting Vehicle Class 
class Car(speed:Int) extends Vehicle(speed){
  override val mph :Int = speed
  override def race() = println("Racing Car")
}

//Bike Inheriting Vehicle Class
class Bike(speed:Int) extends Vehicle(speed){
  override val mph:Int =speed
  override def race() = println("Racing Bike")
}


object use_inheritance {

  def main(args: Array[String]): Unit = {

    
    val vehicle_car =  new Car(200)
    val vehicle_bike = new Bike(100)
    
    vehicle_car.race()
    println("Speed of Car is :"+vehicle_car.mph)
    println()
 
    vehicle_bike.race()
    println("Speed of Bike is:"+vehicle_bike.mph)
  }
  
}