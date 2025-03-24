package ex_14_String;

public class Lab123_String_Immutable {

    public static void main(String[] args) {

        String name="Siddu";
        name.toUpperCase();//SIDDU
        System.out.println(name);
    }
}

//name.toUpperCase(); creates a new String ("SIDDU") but doesn’t update name.
//Since name was not reassigned, it still refers to "Siddu"
