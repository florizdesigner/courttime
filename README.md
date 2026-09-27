# CourtTime

Сервис бронирования спортивных площадок: корты для падела и тенниса, футбольные поля и залы.
Партнёры выкладывают расписание своих площадок, игроки ищут и бронируют свободные слоты.

## Глоссарий

Эти термины используются везде, в том числе в коде:

| Термин      | Значение                                         |
|-------------|--------------------------------------------------|
| **Venue**   | Клуб или площадка с адресом и часами работы      |
| **Court**   | Конкретный корт внутри Venue                     |
| **Slot**    | Интервал времени на Court, который можно забронировать |
| **Booking** | Бронь Slot'а игроком                             |
| **Player**  | Тот, кто бронирует                               |
| **Partner** | Сотрудник клуба, управляет своим Venue           |

## Стек

- Java 25
- Spring Boot 4.1 (Web MVC, jOOQ)
- PostgreSQL
- springdoc-openapi (Swagger UI)
- Gradle 9 (wrapper в репозитории)

## Требования

- PostgreSQL (локально или в Docker)
- Docker

## Запуск

Параметры подключения к БД передаются через стандартные переменные Spring:

```bash
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/courttime
export SPRING_DATASOURCE_USERNAME=postgres
export SPRING_DATASOURCE_PASSWORD=postgres
```

```bash
./gradlew bootRun      # запуск приложения
./gradlew test         # тесты
./gradlew build        # сборка jar в build/libs/
java -jar build/libs/courttime-0.0.1-SNAPSHOT.jar
```

После запуска документация API доступна на http://localhost:8080/swagger-ui.html.
