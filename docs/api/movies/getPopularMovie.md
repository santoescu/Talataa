# Get popular Movies

Este metodo obtiene las peliculas populares del api  `api.themoviedb.org/3/movie/popular`

**URL** : `/api/movie/popular`

**Metodo** : `GET`

**Requiere Autorizacion** : NO

**Permisos requeridos** : NO

**Query Params** : `?page=2` 

##  Response

**Code** : `200 OK`

**Ejemplo**

Esta es la respuesta si consumimos el api.

```json
{
    "page": 1,
    "results": [
        {
            "adult": false,
            "id": 315162,
            "overview": "Puss in Boots discovers that his passion for adventure has taken its toll: He has burned through eight of his nine lives, leaving him with only one life left. Puss sets out on an epic journey to find the mythical Last Wish and restore his nine lives.",
            "popularity": 9062.029,
            "title": "Puss in Boots: The Last Wish",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
            "original_language": "en",
            "original_title": "Puss in Boots: The Last Wish",
            "poster_path": "/kuf6dutpsT0vSVehic3EZIqkOBt.jpg",
            "release_date": "2022-12-07",
            "vote_average": 8.6,
            "vote_count": 2077,
            "genre_ids": [
                16,
                28,
                12,
                35,
                10751,
                14
            ]
        },
        {
            "adult": false,
            "id": 536554,
            "overview": "A brilliant toy company roboticist uses artificial intelligence to develop M3GAN, a life-like doll programmed to emotionally bond with her newly orphaned niece. But when the doll's programming works too well, she becomes overprotective of her new friend with terrifying results.",
            "popularity": 2679.327,
            "title": "M3GAN",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/q2fY4kMXKoGv4CQf310MCxpXlRI.jpg",
            "original_language": "en",
            "original_title": "M3GAN",
            "poster_path": "/7CNCv9uhqdwK7Fv4bR4nmDysnd9.jpg",
            "release_date": "2022-12-28",
            "vote_average": 7.0,
            "vote_count": 321,
            "genre_ids": [
                878,
                27,
                35
            ]
        },
        {
            "adult": false,
            "id": 76600,
            "overview": "Set more than a decade after the events of the first film, learn the story of the Sully family (Jake, Neytiri, and their kids), the trouble that follows them, the lengths they go to keep each other safe, the battles they fight to stay alive, and the tragedies they endure.",
            "popularity": 2619.368,
            "title": "Avatar: The Way of Water",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/s16H6tpK2utvwDtzZ8Qy4qm5Emw.jpg",
            "original_language": "en",
            "original_title": "Avatar: The Way of Water",
            "poster_path": "/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg",
            "release_date": "2022-12-14",
            "vote_average": 7.7,
            "vote_count": 4361,
            "genre_ids": [
                878,
                12,
                28
            ]
        },
        {
            "adult": false,
            "id": 846433,
            "overview": "A noir thriller set in Miami, the film follows an enforcer who discovers his femme fatale boss has branched out into cyber sex trafficking, putting a young runaway he’s befriended at risk. He sacrifices everything to save the young girl from the deadly organization he’s spent his life building.",
            "popularity": 1962.503,
            "title": "The Enforcer",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/Aqldsq65Nj1KAkQD2MzkZsAk5N5.jpg",
            "original_language": "en",
            "original_title": "The Enforcer",
            "poster_path": "/72V1r1G8S87ELagVxjqAUdChMCt.jpg",
            "release_date": "2022-09-22",
            "vote_average": 6.4,
            "vote_count": 50,
            "genre_ids": [
                28,
                53,
                18
            ]
        },
        {
            "adult": false,
            "id": 899112,
            "overview": "When a team of mercenaries breaks into a wealthy family compound on Christmas Eve, taking everyone inside hostage, the team isn’t prepared for a surprise combatant: Santa Claus is on the grounds, and he’s about to show why this Nick is no saint.",
            "popularity": 1716.73,
            "title": "Violent Night",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/sBOenwOZGRN5nZZGw4TxwtnfrEf.jpg",
            "original_language": "en",
            "original_title": "Violent Night",
            "poster_path": "/1XSYOP0JjjyMz1irihvWywro82r.jpg",
            "release_date": "2022-11-30",
            "vote_average": 7.7,
            "vote_count": 952,
            "genre_ids": [
                28,
                35,
                80,
                53
            ]
        },
        {
            "adult": false,
            "id": 411,
            "overview": "Siblings Lucy, Edmund, Susan and Peter step through a magical wardrobe and find the land of Narnia. There, they discover a charming, once peaceful kingdom that has been plunged into eternal winter by the evil White Witch, Jadis. Aided by the wise and magnificent lion, Aslan, the children lead Narnia into a spectacular, climactic battle to be free of the Witch's glacial powers forever.",
            "popularity": 1612.801,
            "title": "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
            "video": false,
            "statusMovie": false,
            "backdrop_path": "/sKK5bbQm15jzbMRwCJmPBbv9trN.jpg",
            "original_language": "en",
            "original_title": "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
            "poster_path": "/iREd0rNCjYdf5Ar0vfaW32yrkm.jpg",
            "release_date": "2005-12-07",
            "vote_average": 7.1,
            "vote_count": 9183,
            "genre_ids": [
                12,
                10751,
                14
            ]
        },
        ...
    
    ],
    "total_pages": 36753,
    "total_results": 735046
}
```

## Notas

* La paginacion es de 20 pliculas por cada una de ellas, solo se puede paginar hasta 500, debido a que esta la api antes mensionada, se puede paginar hasta 500, debido a que la api del proveedor no soporta mas
