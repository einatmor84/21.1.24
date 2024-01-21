public class Main {
    public static void main(String[] args) {

        String str = "Hello";
        str = str + " World";
        System.out.println(str);

        String str1 = "Hello";
        String str2 = "Hello";
        if (str1.equals(str2)){
            System.out.println("Strings are equals");
        }
        else {
            System.out.println("not equals");
        }

        String firstName = "Eli";
        String lastName = "Cohen";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        String subString = fullName.substring(0,4);
        System.out.println(subString);
        int length = fullName.length();
        System.out.println(length);
        char firstChar = fullName.charAt(0);
        System.out.println(firstChar);
        String upper = fullName.toUpperCase();
        System.out.println(upper);

        //String Buffer  // String builder
        StringBuffer buffer = new StringBuffer("Hey");
        buffer.append(" You All");
        System.out.println(buffer);
    }
}