package weather;

public class HTTPRequest {
    //Следуя инструкциям с урока (вкладка Network in Chome DevTools) изучите response с 8-дневным
    // прогнозом погоды и поймите, откуда берутся какие данные в интерфейсе
    //На сайте openWeather.com найдите в документации названия городов на языках,
    // которые поддерживаются в запросах (geocoding). Найдите и скопируйте, как называется город Лондон на языках
    //В классе HTTPRequest:
    //8. Создать переменные типа String с названиями города Лондон на перечисленных выше языках.
    //9. Создать метод createRequest(), который принимает на вход параметры:
    //String cityName
    //String apiKey
    //Метод возвращает строку запроса по названию города (шаблон запроса нужно взять в документации),
    // вставляя необходимые параметры в шаблон.
    //Метод так же печатает созданные запросы на разных языках.
    //Скопируйте полученные строки запросов, сделайте запросы в браузере, и сравните ответы, совпадают ли они или нет.
    String cityEnglish = "London";
    String cityGreek = "Λονδίνο";
    String cityPersian = "لندن";
    String cityHindi = "लंदन";
    String cityFrench = "Londres";

    public String createRequest(String cityName, String apiKey) {
        System.out.println("http://api.openweathermap.org/geo/1.0/direct?q=" + cityEnglish + "&limit=5&appid=" + apiKey);
        System.out.println("http://api.openweathermap.org/geo/1.0/direct?q=" + cityGreek + "&limit=5&appid=" + apiKey);
        System.out.println("http://api.openweathermap.org/geo/1.0/direct?q=" + cityPersian + "&limit=5&appid=" + apiKey);
        System.out.println("http://api.openweathermap.org/geo/1.0/direct?q=" + cityHindi + "&limit=5&appid=" + apiKey);
        System.out.println("http://api.openweathermap.org/geo/1.0/direct?q=" + cityFrench + "&limit=5&appid=" + apiKey);

        return "http://api.openweathermap.org/geo/1.0/direct?q=" + cityName + "&limit=5&appid=" + apiKey;

    }

    public static void main(String[] args) {
        HTTPRequest httpRequest = new HTTPRequest();
        String result = httpRequest.createRequest("London", "7f34f4817aa7a956d30d1e7a9c110f04");
        System.out.println("Generated request: " + result);
    }
}
