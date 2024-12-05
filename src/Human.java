/**
 * Класс представляет собой физическое лицо с личными данными и подразделением.
 */
public class Human
{
    int id, salary;
    String name, sex, dateOfBirth;
    Division division;

    /**
     * Создает объект Human с заданными деталями.
     *
     * @param id          уникальный идентификатор человека
     * @param name        имя
     * @param sex         пол
     * @param division    подразделение
     * @param salary      зарплата
     * @param dateOfBirth день рождения
     */
    public Human(int id, String name, String sex, Division division, int salary, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.division = division;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString()
    {
        int currId = this.id;
        return "Id = " + currId + ", Name: " + this.name + ", Sex: " + this.sex + ", Salary: " + this.salary + "," +
                " DateOfBirth: " + this.dateOfBirth + ", Division: " + this.division.getDivision();
    }
}