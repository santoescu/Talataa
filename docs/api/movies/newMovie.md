# New Movie

Este metodo crea una pelicula y la almacena en una lista

**URL** : `/api/movie/new`

**Metodo** : `POST`

**Requiere Autorizacion** : NO

**Permisos requeridos** : NO

##  Response

**Code** : `201 Created`

**Ejemplo**

Para este ejemplo vamos a agregar una nueva pelicula, el ponemos en el body el Json de la nueva pelicula
```json
{
  "adult": false,
  "budget": 90000000,
  "genres": [
    {
      "id": 16,
      "name": "Animation"
    },
    {
      "id": 28,
      "name": "Action"
    },
    {
      "id": 12,
      "name": "Adventure"
    },
    {
      "id": 35,
      "name": "Comedy"
    },
    {
      "id": 10751,
      "name": "Family"
    },
    {
      "id": 14,
      "name": "Fantasy"
    }
  ],
  "homepage": "https://www.dreamworks.com/movies/puss-in-boots-the-last-wish",
  "id": 76600,
  "overview": "Puss in Boots discovers that his passion for adventure has taken its toll: He has burned through eight of his nine lives, leaving him with only one life left. Puss sets out on an epic journey to find the mythical Last Wish and restore his nine lives.",
  "popularity": 10895.482,
  "revenue": 253068975,
  "runtime": 103,
  "status": "Released",
  "tagline": "Say hola to his little friends.",
  "title": "Puss in Boots: The Last Wish",
  "video": false,
  "backdrop_path": "/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
  "belongs_to_collection": {
    "id": 94602,
    "name": "Puss in Boots Collection",
    "poster_path": "/anHwj9IupRoRZZ98WTBvHpTiE6A.jpg",
    "backdrop_path": "/feU1DWV5zMWxXUHJyAIk3dHRQ9c.jpg"
  },
  "imdb_id": "tt3915174",
  "original_language": "en",
  "original_title": "Puss in Boots: The Last Wish",
  "poster_path": "/kuf6dutpsT0vSVehic3EZIqkOBt.jpg",
  "production_companies": [],
  "production_countries": [
    {
      "name": "United States of America",
      "iso_3166_1": "US"
    }
  ],
  "release_date": "2022-12-07",
  "spoken_languages": [
    {
      "name": "English",
      "english_name": "English",
      "iso_639_1": "en"
    },
    {
      "name": "Español",
      "english_name": "Spanish",
      "iso_639_1": "es"
    }
  ],
  "vote_average": 8.623,
  "vote_count": 1892
}
```
Esto es lo que responde cuando ha sido creada y agregada a la lista
```json
{
  "adult": false,
  "budget": 90000000,
  "genres": [
    {
      "id": 16,
      "name": "Animation"
    },
    {
      "id": 28,
      "name": "Action"
    },
    {
      "id": 12,
      "name": "Adventure"
    },
    {
      "id": 35,
      "name": "Comedy"
    },
    {
      "id": 10751,
      "name": "Family"
    },
    {
      "id": 14,
      "name": "Fantasy"
    }
  ],
  "homepage": "https://www.dreamworks.com/movies/puss-in-boots-the-last-wish",
  "id": 76600,
  "overview": "Puss in Boots discovers that his passion for adventure has taken its toll: He has burned through eight of his nine lives, leaving him with only one life left. Puss sets out on an epic journey to find the mythical Last Wish and restore his nine lives.",
  "popularity": 10895.482,
  "revenue": 253068975,
  "runtime": 103,
  "status": "Released",
  "tagline": "Say hola to his little friends.",
  "title": "Puss in Boots: The Last Wish",
  "video": false,
  "backdrop_path": "/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
  "belongs_to_collection": {
    "id": 94602,
    "name": "Puss in Boots Collection",
    "poster_path": "/anHwj9IupRoRZZ98WTBvHpTiE6A.jpg",
    "backdrop_path": "/feU1DWV5zMWxXUHJyAIk3dHRQ9c.jpg"
  },
  "imdb_id": "tt3915174",
  "original_language": "en",
  "original_title": "Puss in Boots: The Last Wish",
  "poster_path": "/kuf6dutpsT0vSVehic3EZIqkOBt.jpg",
  "production_companies": [],
  "production_countries": [
    {
      "name": "United States of America",
      "iso_3166_1": "US"
    }
  ],
  "release_date": "2022-12-07",
  "spoken_languages": [
    {
      "name": "English",
      "english_name": "English",
      "iso_639_1": "en"
    },
    {
      "name": "Español",
      "english_name": "Spanish",
      "iso_639_1": "es"
    }
  ],
  "vote_average": 8.623,
  "vote_count": 1892
}
```
