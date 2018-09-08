package org.example.star.wars.entities


trait Character {
  def id: Long
  def name: String
  def friends: List[Long]
  def appearsIn: List[Episode]
}

case class Human(id: Long,
                 name: String,
                 friends: List[Long],
                 appearsIn: List[Episode],
                 homePlanet: Option[String]) extends Character

case class Droid(id: Long,
                 name: String,
                 friends: List[Long],
                 appearsIn: List[Episode],
                 primaryFunction: Option[String]) extends Character

