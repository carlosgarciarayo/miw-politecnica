package miw.politecnica.app.patrones.builder.user.solution_advance;



public interface UserBuilders {

    interface Id {
        Nick id(String id);
    }

    interface Nick {
        Name nick(String nick);
    }

    interface Name {
        Optionals name(String name);
    }

    interface Optionals {
        Optionals familyName(String familyName);

        Optionals age(int age);

        Optionals phone(int phone);

        Optionals profession(String profession);

        Optionals tag(String tag);

        User build();

    }
}
