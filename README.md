Planner REST API

Planner — это полноценное RESTful веб-приложение для управления задачами, пользователями и группами.

Основные возможности:

Полноценное управление задачами (Item): создание, обновление, удаление, завершение, поиск по названию и описанию
Управление пользователями (User): регистрация, добавление/удаление задач, обновление имени, поиск по имени и задачам
Группы пользователей (Group): создание, обновление имени, привязка пользователей, удаление
Счётчик всех запросов к API (CounterService)
Аспектное логирование всех вызовов контроллеров (Before, After, AfterReturning, AfterThrowing)
Простое in-memory кэширование сущностей (CacheService)
Глобальная обработка исключений (ObjectNotFoundException, BadRequestException, ObjectExistException)
Swagger-документация API (OpenAPI 3)
Технологии:

Java 17/21
Spring Boot 3.x
Spring Web (REST API)
Spring Data JPA + Hibernate
PostgreSQL (JDBC + Hibernate)
Lombok
AspectJ (аспекты для логирования)
SLF4J + Logback (логирование)
Maven
Swagger OpenAPI (io.swagger.v3)
Как запустить проек:

Установите Intellij Idea
Клонируйте проект.
Отправте запрос через браузер или через клиента.
server.port=8080
spring.application.name=planner-app
