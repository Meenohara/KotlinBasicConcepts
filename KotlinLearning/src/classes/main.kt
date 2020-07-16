package classes

fun main()
{
  println("\n")
  var meena = careerProfile("Meena","Murthy", 6.8f)
  println("\n")
  var meena2021 = careerProfile("Meena","Murthy")
  println("\n")
  var someBody = careerProfile("Somebody")
  println("\n")
  var meeMyself = myFacets("Software Developer")
  println(meeMyself.meMyself)
  println("\n\n")

  var meeMyslf = myFacets("Mee")//Noo value passed for meMysrlf
  println(meeMyslf.meMyself)
  meeMyself.getNewSkills()
  println(meeMyself.getNewSkills())

  val offer = Offer.createOffer(  "Google", 25.0f)
  println(offer);

  val multipleOffers = Offer.otherOffers(4)
  println(multipleOffers);
}

