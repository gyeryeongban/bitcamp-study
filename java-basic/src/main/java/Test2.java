import java.util.ArrayList;

public class Test2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("aaa");
    list.add("ddd");
    list.add("eee");
    list.add("aaa");
    list.add("ggg");

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals("aaa")) {
        list.remove(i);
      }
    }

    System.out.println("--------------------------");

    for (String s : list) {
      System.out.println(s);
    }
  }
}
