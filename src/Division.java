/**
 * Класс представляет собой подразделение с уникальным идентификатором и названием.
 */
public class Division
{
    private static int divisionID = 0;
    private int id;
    private String title;

    /**
     * Создает объект Division с указанным названием.
     *
     * @param title название
     */
    public Division(String title)
    {
        this.id = divisionID++;
        this.title = title;
    }

    /**
     * Возвращает название подразделения.
     *
     * @return название подразделения
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Возвращает строковое представление подразделения, включая его идентификатор и название.
     *
     * @return строковое представление подразделения
     */
    public String getDivision()
    {
        return "ID = " + this.id + ", Title " + this.title;
    }
}