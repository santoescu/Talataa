# Talataa Prueba Tecnica

Esta es una prueba técnica para Ingeniero de desarrollo JAVA

## Puntos de la prueba

1. Utilizando JAVA y spring boot se requiere la construcción de una RESTful API donde se consuma los servicios provee la api de The Movie database.                                                                                                             2. Crear Endpoints donde exponga la data ya procesada (Incluir métodos POST, PUT, DELETE, UPDATE).
3. Las respuestas de los endpoints deben estar estandarizadas para una mayor legibilidad.
4. no mostrar más 20 películas en la carga inicial, Construir un paginador para controlar la cantidad de data proveniente de la API (GET)
5. Construir endpoint de detalle de cada película usando toda la información que ofrece la Api (GET por ID).
6. El proyecto se debe subir a un repositorio Público en GitHub o GitLab, se debe compartir el link del proyecto a este mismo correo.
7. Desplegar proyecto en cualquier tipo de nube (AWS, AZURE).

## Recursos 
Para esta prueba se consumio un api(`api.themoviedb.org/3`) donde estaba alojadas las peliculas consultas, en la cual se
agrego en una lista donde podemos agregar, eliminar, modificar, y obtner peliculas
Para esto utilizaremos la URL: `ec2-54-82-177-214.compute-1.amazonaws.com:8080` y utilizando los endpoints correspondientes

### Endpoints

* [Obtener Peliculas](docs/api/movies/getPopularMovie.md) : `GET /api/movie/popular`
* [Obtener Peliculas por ID](docs/api/movies/getMovie.md) : `GET /api/movie/{id}`
* [Eliminar Pelicula](docs/api/movies/deleteMovie.md) : `DELETE /api/movie/delete/{id}`
* [Agregar Pelicula](docs/api/movies/newMovie.md) : `POST /api/movie/new`
* [Editar Pelicula](docs/api/movies/upgradeMovie.md) : `PUT /api/movie/update`
