package otus.gpb.homework.activities.sender

data class Payload(
    val title: String,
    val year: String,
    val description: String
)

val PAYLOAD_DB = listOf(
    Payload(
        title = "Славные парни",
        year = "2016",
        description = "Что бывает, когда напарником брутального костолома становится " +
                "субтильный лопух? Наемный охранник Джексон Хили и частный детектив Холланд" +
                " Марч вынуждены работать в паре, чтобы распутать плевое дело о пропавшей" +
                " девушке, которое оборачивается преступлением века. Смогут ли парни разгадать " +
                "сложный ребус, если у каждого из них – свои, весьма индивидуальные методы."
    ),
    Payload(
        title = "Интерстеллар",
        year = "2014",
        description = "Когда засуха, пыльные бури и вымирание растений приводят человечество" +
                " к продовольственному кризису, коллектив исследователей и учёных отправляется " +
                "сквозь червоточину (которая предположительно соединяет области " +
                "пространства-времени через большое расстояние) в путешествие, чтобы превзойти " +
                "прежние ограничения для космических путешествий человека и найти планету" +
                " с подходящими для человечества условиями."
    ),
)
