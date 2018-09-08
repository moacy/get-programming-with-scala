package org.example.star.wars

import org.example.star.wars.entities._

object SampleData {

  val lukeSkywalker = Human(
    id = 1001,
    name = "Luke Skywalker",
    friends = List(1002, 1003, 2000, 2001),
    appearsIn = List(
      TheEmpireStrikesBack,
      RevengeOfTheSith,
      ReturnOfTheJedi,
      ANewHope,
      TheForceAwakens
    ),
    homePlanet = Some("Tatooine")
  )

  val darthVader = Human(
    id = 1001,
    name = "Darth Vader",
    friends = List(1004),
    appearsIn = List(TheEmpireStrikesBack, RevengeOfTheSith, ReturnOfTheJedi, ANewHope),
    homePlanet = Some("Tatooine")
  )

  val hanSolo = Human(id = 1002,
                      name = "Han Solo",
                      friends = List(1000, 1003, 2001),
                      appearsIn = List(TheEmpireStrikesBack, ReturnOfTheJedi, ANewHope, TheForceAwakens),
                      homePlanet = None)

  val leiaOrgana =
    Human(
      id = 1003,
      name = "Leia Organa",
      friends = List(1000, 1002, 2000, 2001),
      appearsIn = List(TheEmpireStrikesBack, RevengeOfTheSith, ReturnOfTheJedi, ANewHope, TheForceAwakens),
      homePlanet = Some("Alderaan")
    )

  val wilhuffTarkin =
    Human(id = 1004,
          name = "Wilhuff Tarkin",
          friends = List(1001),
          appearsIn = List(RevengeOfTheSith, ANewHope),
          homePlanet = None)

  val c3po =
    Droid(
      id = 2000,
      name = "C-3PO",
      friends = List(1000, 1002, 1003, 2001),
      appearsIn =
        List(TheEmpireStrikesBack, AttackOfTheClones, ThePhantomMenace, RevengeOfTheSith, ReturnOfTheJedi, ANewHope),
      primaryFunction = None
    )

  val r2d2 =
    Droid(
      id = 2001,
      name = "R2-D2",
      friends = List(1000, 1002, 1003),
      appearsIn = List(TheEmpireStrikesBack,
                       AttackOfTheClones,
                       ThePhantomMenace,
                       RevengeOfTheSith,
                       ReturnOfTheJedi,
                       ANewHope,
                       TheForceAwakens),
      primaryFunction = Some("Astromech")
    )

  val humans = List(lukeSkywalker, darthVader, hanSolo, leiaOrgana, wilhuffTarkin)
  val droids = List(c3po, r2d2)

  val characters = humans ++ droids

  // Friendship map
  // The char with the most/least friends
  // The movie with the most characters
  // compose of the two
  // find movies with darth vader

}
