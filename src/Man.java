public class Man {
    int age;
    String sex;
    String name;

    String run () {
        String res = "";
        for (int i = 0; i < age; i++) {
            res += sex;
            res += ' ';
        }

      return res;
    };
}
