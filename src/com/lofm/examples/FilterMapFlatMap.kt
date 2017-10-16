package com.lofm.examples

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
    Album("Hybrid Theory", 2000, 4, 2,
            listOf(
                    Track("Papercut", 164),
                    Track("One Step Closer", 155),
                    Track("With You", 203),
                    Track("Point of Authority", 200),
                    Track("Crawling", 209),
                    Track("Runamay", 183),
                    Track("By Myself", 189),
                    Track("In the End", 216),
                    Track("A Place for My Head", 184),
                    Track("Forgotten", 194),
                    Track("Cure for the Itch", 157),
                    Track("Pushing Me Away", 191)
            )
    ),
    Album("Meteora", 2003, 1, 1),
    Album("Minutes to Midnight", 2007, 1, 1),
    Album("A Thousand Suns", 2010, 2, 1),
    Album("Living Things", 2012, 1, 1),
    Album("The Hunting Party", 2014, 2, 3),
    Album("One More Light", 2017, 4, 1)
)

fun albumAndTrackLowerThanXSeconds(durationInSeconds:Int, albums: List<Album>): List<Pair<String, String>> {
    //flatMap applies everything that is inside to a collections of collections (every track in every album)
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < durationInSeconds
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun main(args: Array<String>) {
    //Not very functional filtering
    for (album in albums) {
        if (album.chartUS == 1) {
            //println("Album - ${album.title}")
        }
    }

    //A little more functional filtering
    albums.forEach {
        //album -> if (album.chartUS == 1) println("Album - ${album.title}")
    }

    //"album" is a single parameter so it can be simplified
    albums.forEach {
        //if (it.chartUS == 1) println("Album - ${it.title}")
    }

    //Even better filtering using "filter"
    val numberOnes = albums.filter { it.chartUS == 1 }
    for (album in numberOnes) {
        //println("Album - ${album.title}")
    }

    //No need of extra variable "numberOnes"
    //We can concatenate both sentences (function pipeline)
    albums.filter { it.chartUS == 1 }.forEach {
        //println("Album - ${it.title}")
    }

    //Getting only first number one album
    //It is possible to add .functon.function...
    //println(albums.filter { it.chartUS == 1 }.first().title)

    //Save found albums in a list to use them later
    albums.filter { it.chartUS == 1 }.forEach {
        val titles = mutableListOf<String>()
        titles.add(it.title)
    }

    //A better way to get titles is using function map
    val albumTitles = albums.filter { it.chartUS == 1 }.map { it.title }
    //albumTitles.forEach { println("Album - $it") }

    //In case we want the title and the year we can map more than one value
    val titleYear = albums.filter { it.chartUS == 1 }.map { Pair(it.title, it.year) }
    //titleYear.forEach { println("Album: ${it.first} - Year: ${it.second}") }
    //Another way to print it. Since Album is a data class it has a toString function and prints nicely
    titleYear.forEach { println(it) }

    //Call to a function that uses flatMap
    albumAndTrackLowerThanXSeconds(200, albums).forEach {
        println("Album: ${it.first} - Track: ${it.second}")
    }

}