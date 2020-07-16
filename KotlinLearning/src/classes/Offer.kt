package classes

class Offer(var companyName:String, var offerinLPA:Float=25.0f) {

    companion object
    {
        //todo use an array with different company names and offer vaules and pass
        //todo 2 separate arrays for company names and offers?
        //val companies : Array<String> =["Thorn", ]//todo invesigate initialization
        // is there a key value pair variable? Map?
        //todo introduce a map here and iterate it to display other offers
        val offers = mutableListOf<Offer>()
        fun otherOffers(count: Int):List<Offer>
        {
            for(i in 0..count)
            {
                offers.add(Offer("CompanyName$i", offerinLPA = 27.0f))

            }
            return offers
        }

        fun createOffer(companyName:String, offerinLPA:Float): Offer
        {
            return Offer(companyName = "Google", offerinLPA = 25.0f)
        }
    }
        fun compOffer():String = "$companyName - $offerinLPA"

    override fun toString(): String {
            return compOffer()
    }
}