package acadgild

//Abstract Class
abstract class Bird {
  
  def sound:String
}

//Trait Extending Bird class
trait FlyingBird extends Bird {
  
  override def sound = "Flying Sound"
  
  def work() = "BIRD IS FLYING.....FLYING....FLYING"
  
  def flyingDance = " FLYING BIRD PERSONAL METHOD"
  
}

//Trait Extending Bird class
trait RunningBird extends Bird {
   
  override def sound = "Running Sound"
  
  def work() = "BIRD IS RUNNING.......RUNNING.....RUNNING"
  
  def runningDance = "RUNNING BIRD PERSONAL METHOD"
}


//Using Multiple inheritance , extending RunningBird and FlyingBird using FlyingBirdd to used in conflicting method
class FlyingRunningBird_Flying extends RunningBird with FlyingBird
{
  
  override def work() = super.work()
 
  }

//Using Multiple inheritance , extending RunningBird and FlyingBird using RunningBird to used in conflicting method
class FlyingRunningBird_Running extends FlyingBird with RunningBird
{
  
  override def work() = super.work()
 
 }


object multiple_inheritance {
 def main(args: Array[String]): Unit = {
   
   //FlyingRunningBird_Flying Calling
   var fB_Flying =  new FlyingRunningBird_Flying 
   println(fB_Flying.work())
   println(fB_Flying.flyingDance)
   
   println()
   //FlyingRunningBird_Running Calling
   var fb_Running = new FlyingRunningBird_Running
   println(fb_Running.work())
   println(fb_Running.runningDance)
 }
}