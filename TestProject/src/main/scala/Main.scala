package main.scala

import scala.util.Random

object Main extends App {

  var usersWin = 0;
  var usersNumber = 0;
  var computersWin = 0;
  var computersNumber = 0;

  var i = 0;
  for (i <- 1 to 10) {
    computersNumber = Random.between(1, 6)
    usersNumber = Random.between(1, 6)
    if (computersNumber > usersNumber) computersWin += 1 else usersWin += 1

  }
  val s = if (computersWin > usersWin) "Computer wins!" else "User wins!"
  println(s);

}
