package exceptions.types;

public enum PrinterExceptionType {

    GET_STATUS_ERROR ("Ошибка получения состояния"),
    TEXT_PRINT_ERROR("Ошибка печати строки текста"),
    BARCODE_ERROR("Ошибка штрихкода"),
    IMAGE_PRINT_ERROR("Ошибка печати изображения"),
    CUT_ERROR ("Ошибка механизма отрезки");

    public final String description;

    PrinterExceptionType(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("%s", description);
    }

}
