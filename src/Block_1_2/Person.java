package Block_1_2;

public class Person {
    Name name;
    int height;   // уже не нужен для вывода, но оставим для совместимости
    Person father;

    Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    Person(Name name, int height) {
        this(name, height, null);
    }

    // Формирование строки согласно правилам
    @Override
    public String toString() {
        // Фамилия
        String lastNamePart = "";
        if (name.hasLastName()) {
            lastNamePart = name.lastName;
        } else if (father != null && father.name.hasLastName()) {
            lastNamePart = father.name.lastName;
        }
        // Имя (личное имя по прежним правилам)
        String firstNamePart = name.firstName;

        // Отчество
        String middleNamePart = "";
        if (name.hasMiddleName()) {
            middleNamePart = name.middleName;
        } else if (father != null && father.name.hasFirstName()) {
            middleNamePart = father.name.firstName + "ович";
        }


        StringBuilder sb = new StringBuilder();
        if (!lastNamePart.isEmpty())
            sb.append(lastNamePart);
        if (!firstNamePart.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstNamePart);
        }
        if (!middleNamePart.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(middleNamePart);
        }

        return sb.toString().trim();
    }


}


